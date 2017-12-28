package my.examples.bookResolver;

public class MainBookResolver {
	public static void main(String[] args) {
		BookResolver bookResolver = new BookResolver();
		String s =  bookResolver.readBookFromTxtFile("C:\\Users\\HardWorker\\Desktop\\pox.txt");
		System.out.println(s);

//        try(FileWriter writer = new FileWriter("C:\\Users\\HardWorker\\Desktop\\new2.txt", false))
//        {
//            // запись всей строки
//            String text = s;
//            writer.write(text);
//            // запись по символам
//
//            writer.flush();
//        }
//        catch(IOException ex){
//
//            System.out.println(ex.getMessage());
//        }
	}
}
