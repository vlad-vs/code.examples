package my.examples.multithreading;

import java.util.concurrent.TimeUnit;

public class Operations {
	private static final long WATI_SEC = 10;

	public static void main(String[] args) {

		final Account a = new Account(1000);
		final Account b = new Account(2000);

		new Thread(new Runnable() {
			@Override
			public void run() {
				transfer(a, b, 500);
				System.out.println(a.getBalance());
				System.out.println(b.getBalance());
			}
		}).start();

		transfer(b, a, 300);

		System.out.println(a.getBalance());
		System.out.println(b.getBalance());
	}

	static void transfer(Account a1, Account a2, int anount) {
		if (a1.getBalance() >= anount) {
			try {
				if (a1.getLock().tryLock(WATI_SEC, TimeUnit.SECONDS)) {
					try {
						if (a2.getLock().tryLock(WATI_SEC, TimeUnit.SECONDS)) {
							try {
								a1.withdraw(anount);
								System.out.println("withdraw" + anount);
								a2.deposit(anount);
								System.out.println("deposit" + anount);
							} finally {
								a2.getLock().unlock();
							}
						}
					} finally {
						a1.getLock().unlock();
					}
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
	}
}

//		static void transfer(Account a1, Account a2, int anount) {
//			synchronized (a1){
//				synchronized (a2){
//					a1.withdraw(anount);
//					System.out.println("withdraw " + anount);
//					try {
//
//						Thread.sleep(10000);
//
//					} catch (InterruptedException e) {
//						e.printStackTrace();
//					}
//
//					a2.deposit(anount);
//					System.out.println("deposit " + anount);
//				}
//			}


//		} else {
//			try {
//				throw new InsufficientResourcesException("Not enuf mony");
//			} catch (InsufficientResourcesException e) {
//				e.printStackTrace();
//			}
//}
//		}
