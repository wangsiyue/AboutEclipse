package Thread;

public class thread {
	public static void main(String[] args) {
		new Test();
		new Test();
		new Test();
		new Test();
		System.gc();//垃圾回收线程
		System.out.println("dddddddddddddddddddddddddddd");
	}

}
class Test{
	public void finalize(){
		System.out.println("dddsssssssss");
	}
}