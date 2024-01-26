package fileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.ClientInfoStatus;

public class CreationOfAFile {
	
public static void main(String[] args) throws IOException {
	
	 File f = new File("F:\\sjana.txt");
	 f.createNewFile();
	 f.setWritable(true);
	 
//	 FileWriter fw = null;
//	 fw=new FileWriter(f);
//	  fw.write("Please Start Writing");
	 
	 
	 FileOutputStream fos = new FileOutputStream(f);
	  fos.write("120".getBytes());
	  
	  FileInputStream fis = new FileInputStream(f);
	 System.out.println( (char)fis.read());
	 
}

}
