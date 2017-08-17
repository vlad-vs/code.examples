package my.examples.file.deleteFolder;

import java.io.File;

public class DeleteFoder {

	public static void main(String[] args) {
		delete("D:\\_Work\\file");
	}

	public static void delete(String folder){
		File file = new File(folder);

		if (!file.isDirectory()){
			file.delete();
			System.out.println("deleted: " + file);
		}

		if (file.isDirectory()){
			System.out.println("file is directory: " + file);
			for (File f : file.listFiles()){
				f.delete();
				System.out.println("deleted: " + f);
			}
			file.delete();
			System.out.println("deleted: " + file);
		}
	}
}
