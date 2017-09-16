package Thread;
//�̼߳��ͨ��    �̵߳�����ͬ  �������ݲ�����������ͬ

//�����ʱ��ͬʱ���
public class Demo {
	
	public static void main(String[] args) {
		System.out.println("Hello !!!!!!!!");
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
	String name ;
	String sex;
}

//������ru����
class Input implements Runnable{

	private Res res;
	public Input(Res res){
		this.res=res;
	} 
	@Override
	public void run() {
		 int i=1;
		 while(true){
			 synchronized(res){
				 if(i==1){
					 
						res.name="q";
						res.sex="man";
					 }
						
					 else{
						res.name="w";
						res.sex="woman";
					 }
					 i=(i+1)%2;
			 }
			
		 }
	 
	}
	
}
//�����������   ���ʱ��������
class Output implements Runnable{
	private Res res;
	public Output(Res res){
		this.res=res;
	}
	@Override
	public void run() {
		while (true){
			synchronized (res) {
				System.out.println(res.name+"------"+res.sex);
			}
			
		}
		
		
	}
	
}