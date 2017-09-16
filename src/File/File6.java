package File;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class File6 {
	public static void main(String[] args) throws IOException {
		File resource =new File("aa.txt");
		File dest=new File("ff.txt");
		FileReader fr=new FileReader(resource);
		FileWriter fw=new FileWriter(dest);
		BufferedReader br=new BufferedReader(fr);
		BufferedWriter bw=new BufferedWriter(fw);
		String line;
		
		while((line=br.readLine())!=null){
			bw.write(line);
			bw.newLine();
		}
		bw.flush();
	}

}
