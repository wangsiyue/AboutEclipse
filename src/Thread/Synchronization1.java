package Thread;
//ͬ���������� this
//ͬ�� ��̬��������   ��̬�������ڴ��ʱ�򲻴��ڶ���   ������������ֽ����ļ���������class���͵Ķ���
//���Ծ�̬ͬ���������������������ļ��ֽ������
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
	//�ĸ��̹߳���һ���ܶ� Ҫ��static
//	private int Tnum=50;
	private  int Tnum=50;
	public void run(){
		
	//	synchronized(MyTickets.class){// ͬ������� ������MyTickets.class
			while (true){
				if(Tnum>0){
					System.out.println(Thread.currentThread().getName()+".......sale....."+Tnum--);
				}
			}
		//}
	}
	//ͬ�� ��̬��������   ��̬�������ڴ��ʱ�򲻴��ڶ���   ������������ֽ����ļ���������class���͵Ķ���
	//���Ծ�̬ͬ���������������������ļ��ֽ������
	/*public static synchronized void  fun(){// fun ������MyTickets.class
		while (true){
			if(Tnum>0){
				System.out.println(Thread.currentThread().getName()+".......sale....."+Tnum--);
			}
		}
	}*/
}