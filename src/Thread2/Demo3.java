package Thread2;

public class Demo3 {
	public static void main(String[] args) {
		System.out.println("Hello!!!!!!!!!!");
		//������Դ�Ķ���
				Res res=new Res();
				//��������
				Input in=new Input(res);
				Output out=new Output(res);
				//�����߳�
				Thread t1=new Thread(in);
				Thread t2=new Thread(out);
				t1.start();
				t2.start();
				
	}

}
class Res{
	private boolean flag;
	private String name;
	private String sex;
	//�洢����
	public  synchronized void set(String name,String sex){
		if(flag){
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		this.name=name;
		this.sex=sex;
		flag=true;
		notify();
	}
	//�������
	public synchronized void out(){
		if(!flag){
			try {
				this.wait();//this��ʡ
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println(name+"-----"+sex);
		flag=false;
		notify();
	}

}
class Input implements Runnable{
	private Res res;
	public Input(Res res){
		this.res=res;
	}
	@Override
	public void run() {
		int i=1;
		while(true){
			if(i==1){
				res.set("gg", "man");
			}
			else{
				res.set("mm", "woman");
			}
			i=(i+1)%2;
		}
				
		
	}
}
	class Output implements Runnable{
		private Res res;
		public Output(Res res){
			this.res=res;
		}
		@Override
		public void run() {
			while(true){
				res.out();
				
			}
			
					
			
		}
	}