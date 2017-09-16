package Exercise1;

public class Triangle {
	public static void main(String[] args) {

		Triangle t=new Triangle();
		t.printTriange(5);
		
	}
	public   void printTriange(int num){
		for(int i=0;i<num;i++){
			for(int j=0;j<num-i;j++){    //for(int j=0;j<num-i;j++) 打印出来最后一个数是否不空格0空一格 1 挨着边不空格
				System.out.print(" ");//输出前面的空格
			}
			for(int j=0;j<i+1;j++){
				System.out.print(i+1+" ");//输出数字和空格
			}
			System.out.println();
		}
	}
	
	

}
