package Thread3;
//多个线程生产和消费    if---while     notify------notifyAll          性能不好
//notify唤醒任意一个线程，
public class Producter {

		public static void main(String[] args) {
			Product p=new Product();
			Producer producer=new Producer(p);
			Consumer consumer=new Consumer(p);
			Thread t1=new Thread(producer);
			Thread t2=new Thread(consumer);
			Thread t3=new Thread(producer);
			Thread t4=new Thread(consumer);
			t1.start();
			t2.start();
			t3.start();
			t4.start();
		}
	}
	//产品
	class  Product{
		 private String name;
		 private int count;
		 private boolean flag;
		 //生产产品的功能
		 public  synchronized void product(String name){
			while(flag){
				try {
					wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			 
			 
			 
			 this.name=name+"----"+count;
			 System.out.println(Thread.currentThread().getName()+"生产了"+this.name);
			 count++;
			 flag=true;
			 notifyAll();
			 
			 
		 }
		//消费产品的功能
		 public synchronized void cosume(){
			 while(!flag){
				 try {
					wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			 }
			 
			 notifyAll();
			 System.out.println(Thread.currentThread().getName()+"消费类"+name);
			 flag=false;
		 }
	 
	}
	//生产任务
	class  Producer implements Runnable{
		private Product p;
		public Producer( Product p){
			this.p=p;
		}

		@Override
		public void run() {
			while(true){
				p.product("笔记本");
			}
			
			
		}
		
	}
	//消费任务
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