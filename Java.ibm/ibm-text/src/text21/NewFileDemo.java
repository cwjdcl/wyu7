package text21;

import java.io.File;
import java.io.IOException;

public class NewFileDemo {
	public static void main(String[] args) throws IOException { 
		File f = new File("C:\\java"); 
		f.mkdirs();
		File ff = new File(f,"myfile.txt"); 
		ff.createNewFile();
		File f1 = new File("C:\\java\\Copy"); 
		f1.mkdirs();
	}
}
