package File;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class File2 {
	public static void main(String[] args) throws IOException {
		File a=new File("bb.txt");
		if(a.exists()){
			System.out.println("exist");
		}else{
				a.createNewFile();
		}
		InputStream is=new FileInputStream(a);
		int i;
		while(( i=is.read())!=-1){
			
			System.out.print((char)i);
		}
				
	}

}
