package Thread;
//�ĸ�������Ʊ
public class Ticket {
	public static void main(String[] args) {
		Ticket1 a=new Ticket1();
		Ticket1 b=new Ticket1();
		Ticket1 c=new Ticket1();
		Ticket1 d=new Ticket1();
		a.start();
		b.start();
		c.start();
		d.start();
	}

}
class Ticket1 extends Thread{
	//�ĸ��̹߳���һ���ܶ� Ҫ��static
//	private int Tnum=50;
	private static int Tnum=50;
	public void run(){
	//	while (true){
		if(Tnum>0){
			System.out.println(Thread.currentThread().getName()+".......sale....."+Tnum--);
		}
		//}
	}
}
