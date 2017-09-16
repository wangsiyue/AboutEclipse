package File;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class File3 {
	public static void main(String[] args) throws IOException {
		
		File file=new File("cc.txt");
		if(file.exists()){
			System.out.println("exist");
		}else{
				file.createNewFile();
		}
		String a="dsfjlskdj fsaksfµ¹Èø·¢Ê¿´ó·ò f";
		try {
			OutputStream os=new FileOutputStream(file,true);
			for(int i=0;i<a.length();i++){
				os.write(a.charAt(i));//ÂÒÂë
			}
			
			
			
			
			
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
