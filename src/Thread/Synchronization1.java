package Thread;
//同步函数的锁 this
//同步 静态函数的锁   静态函数进内存的时候不存在对象   存在所属类的字节码文件对象属于class类型的对象
//所以静态同步函数的锁是其所属的文件字节码对象
public class Synchronization1 {

	public static void main(String[] args) {
		MyTickets mt=new MyTickets();
		Thread t1=new Thread(mt);
		Thread t2=new Thread(mt);
		
		t1.start();
		t2.start();
		
		
		
	}

}
class MyTickets implements Runnable{
	//四个线程共享一个总额 要加static
//	private int Tnum=50;
	private  int Tnum=50;
	public void run(){
		
	//	synchronized(MyTickets.class){// 同步代码块 的锁是MyTickets.class
			while (true){
				if(Tnum>0){
					System.out.println(Thread.currentThread().getName()+".......sale....."+Tnum--);
				}
			}
		//}
	}
	//同步 静态函数的锁   静态函数进内存的时候不存在对象   存在所属类的字节码文件对象属于class类型的对象
	//所以静态同步函数的锁是其所属的文件字节码对象
	/*public static synchronized void  fun(){// fun 的锁是MyTickets.class
		while (true){
			if(Tnum>0){
				System.out.println(Thread.currentThread().getName()+".......sale....."+Tnum--);
			}
		}
	}*/
}