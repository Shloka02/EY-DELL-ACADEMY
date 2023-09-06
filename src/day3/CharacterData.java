package day3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class CharacterData {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		try {
			File f= new File("C:\\Users\\CD917NJ\\Desktop\\New Text Document.txt");
			FileWriter fw= new FileWriter(f);
			System.out.println(f.exists());
			BufferedWriter bw= new BufferedWriter(fw);
	
			
			BufferedWriter bw2= new BufferedWriter(new FileWriter(new File("C:\\Users\\CD917NJ\\Desktop\\New Text Document.txt")));
			bw.write("ABCD");
			bw.newLine();
			bw.write(97);
			bw.flush();
			bw.close();
			BufferedReader br = new BufferedReader(new FileReader(new File("C:\\Users\\CD917NJ\\Desktop\\New Text Document.txt")));
			String str;
			while((str=br.readLine()) != null){
				System.out.println(str);
			}
			br.close();
		}catch(IOException e) {
			e.printStackTrace();
		}

	}

}
