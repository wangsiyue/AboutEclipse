package Thread;
//四个窗口买票
public class Ticket2 {
	public static void main(String[] args) {
		MyTicket mt=new MyTicket();
		Thread t1=new Thread(mt);
		Thread t2=new Thread(mt);
		Thread t3=new Thread(mt);
		Thread t4=new Thread(mt);
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
		
		
	}

}
class MyTicket implements Runnable{
	//四个线程共享一个总额 要加static
//	private int Tnum=50;
	private static int Tnum=50;
	public void run(){
	while (true){
		if(Tnum>0){
			System.out.println(Thread.currentThread().getName()+".......sale....."+Tnum--);
		}
	}
	}
}
