package File;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class File5 {
	public static void main(String[] args) throws IOException {
		File resource =new File("aa.txt");
		File dest=new File("ee.txt");
		
		InputStream fis=new FileInputStream(resource);
		OutputStream ois=new FileOutputStream(dest);
		byte []b=new byte[1024];
		while(fis.read(b)!=-1){
			ois.write(b);
		}
		fis.close();
		
	}

}
