package Exercise1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

//  java NIO
public class InAndOut {
	public static void main(String[] args) {
		String infile="D:\\infile.txt";
		String outfile="D:\\outfile.txt";
		//获取源文件和目标文件的输入输出流
		try {
			FileInputStream fin=new FileInputStream(infile);
		
			FileOutputStream fout=new FileOutputStream(outfile);
		
		//获取输入输出通道
			FileChannel fcin=fin.getChannel();
			FileChannel fcout=fout.getChannel();
			//创建缓冲区
			ByteBuffer buffer=ByteBuffer.allocate(1024);
			while(true){
				buffer.clear();//重设缓冲区  使他可以接受读入的数据
				//从输入通道中将数据读到缓冲区
				int re=fcin.read(buffer);
				if(re==-1){
					break;
				}
				buffer.flip();//让缓冲区可以将新读入的数据写入另一个通道  flip   写模式转换为读模式
				fcout.write(buffer);//从输出通道中将数据写入缓冲区
			}
			fcin.close();
			fout.close();
		} catch ( IOException e) {
			e.printStackTrace();
		}
		
	}

}
