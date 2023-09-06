package day3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class Checkedexception {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br= null;
		Reader r= new InputStreamReader(System.in);
		br=new BufferedReader(r);
		String str;
		try {
			do {
				System.out.println("Please enter, I will read it for you");
				str=br.readLine();
				System.out.println("what you entered is "+ str);
			}while( !str.equalsIgnoreCase("exit"));
		}catch(IOException e) {
			e.printStackTrace();
			
		}finally {
			if(br!= null) {
				try {
					br.close();
					
				}catch(IOException e) {
					e.printStackTrace();
				}
			}
		}
		
	

	}

}
