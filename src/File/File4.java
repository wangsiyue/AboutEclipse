package File;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class File4 {
	public static void main(String[] args) throws IOException {
		File file=new File("dd.txt");
		if(file.exists()){
			System.out.println("exist");
		}else{
				file.createNewFile();
		}
		String a="dsfjlskdj fsak f �Է��Ŀ��ȵ귿�䶼�ǿ��ŵ�";
		OutputStream os=new FileOutputStream(file,true);
		byte b[]=a.getBytes();
		os.write(b);
	}

}
