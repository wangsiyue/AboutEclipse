package Thread;
//�ĸ�������Ʊ
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
	//�ĸ��̹߳���һ���ܶ� Ҫ��static
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
