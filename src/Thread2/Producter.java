package Thread2;
//����������
//�����������������������    ��Ʒ
public class Producter {

	public static void main(String[] args) {
		Product p=new Product();
		Producer producer=new Producer(p);
		Consumer consumer=new Consumer(p);
		Thread t1=new Thread(producer);
		Thread t2=new Thread(consumer);
		t1.start();
		t2.start();
	}
}
//��Ʒ
class  Product{
	 private String name;
	 private int count;
	 private boolean flag;
	 //������Ʒ�Ĺ���
	 public  synchronized void product(String name){
		 
		if(flag){
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		 
		 
		 
		 this.name=name+"----"+count;
		 System.out.println(Thread.currentThread().getName()+"������"+this.name);
		 count++;
		 flag=true;
		 notify();
		 
		 
	 }
	//���Ѳ�Ʒ�Ĺ���
	 public synchronized void cosume(){
		 if(!flag){
			 try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 }
		 
		 notify();
		 System.out.println(Thread.currentThread().getName()+"������"+name);
		 flag=false;
	 }
 
}
//��������
class  Producer implements Runnable{
	private Product p;
	public Producer( Product p){
		this.p=p;
	}

	@Override
	public void run() {
		while(true){
			p.product("�ʼǱ�");
		}
		
		
	}
	
}
//��������
class Consumer implements Runnable{

	private Product p;
	public Consumer(Product p){
		this.p=p;
	}
	@Override
	public void run() {
		while(true){
			p.cosume();
		}
		
		
	}
	
}
