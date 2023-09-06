package day3;

import java.nio.file.Files;
import java.nio.file.Paths;

public class DeleteOneDirectory {

	public static void main(String[] args) throws IOException {
		
		// TODO Auto-generated method stub
		Path p= Paths.get("C:\\Users\\CD917NJ\\Desktop\\New Text Document.txt");
		Path p2= Paths.get("C:\\Users\\CD917NJ\\Desktop\\New Text Document.txt");
		BasicFileAttributeView view= Files.getFileAttributeView(p, BasicFileAttributeView.class);
		BasicFileAttributes attr=view.readAttributes();
		
		
				

	}

}
