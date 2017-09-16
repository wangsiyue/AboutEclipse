package File;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class File1 {
	public static void main(String[] args) throws IOException {
		File a=new File("aa.txt");
		if(a.exists()){
			System.out.println("exist");
		}else{
				a.createNewFile();
		}
		InputStream is=new FileInputStream(a);
		byte[]b=new byte[1024];
		while(is.read(b)!=-1){
			String s=new String(b);
			System.out.println(s);
		}
	}

}
