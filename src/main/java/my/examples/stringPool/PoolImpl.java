package my.examples.stringPool;

public class PoolImpl {

	public static void main(String[] args) {
		Integer a, b, c, d;
		a=100;
		b= 100;
		c=130;
		d=130;


		System.out.println(a == b);
		System.out.println(c == d);

		System.out.println("==================================================================================");

		int n,m,e,f;
		n = 100;
		m = 100;
		e = 130;
		f = 130;
		System.out.println(n == m);
		System.out.println(e == f);

		System.out.println("==================================================================================");

		String s1 = "Cat";
		String s2 = "Cat";

		String s3 = new String("Cat");


		System.out.println(s1 ==s2);
		System.out.println(s1 ==s3);
		System.out.println("==================================================================================");
		System.out.println(s1.equals(s3));
	}
}
