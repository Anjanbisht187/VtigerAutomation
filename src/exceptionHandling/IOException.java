package exceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class IOException {
	public static void main(String[] args) {
		try {
			FileInputStream fts = new FileInputStream("f:\\Test.txt");
			System.out.println("file is available ");
		} catch (FileNotFoundException e) {
 			e.printStackTrace();
			System.out.println("file not  available at location");
		}
		System.out.println("progrma is complete");
	}

}
