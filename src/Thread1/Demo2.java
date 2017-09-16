package Thread1;
//�̼߳��ͨ��    �̵߳�����ͬ  �������ݲ�����������ͬ


//wait() ���߳̽��ȴ�״̬  ���ǰ��̷߳����̳߳�
//notify()  �����̳߳��е�����һ��
//,notifyall() ��������
//��������ͬ��������ұ���������
//ָ���ó����ĸ������߳�ȥ�ȴ�������    ���ܲ�ֹһ����
//�����������  ������󶼿��Ե��õķ���   ��Ҫ������object��
//�����ʱ��ͬʱ���
public class Demo2 {
	
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
	boolean flag;//Ĭ��Ϊfalse
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
				 //���жϸò��ô�
				 if(res.flag)//false �ô�    ��ִ��wait()  Ϊtrue  ִ��wait()
					try {
						res.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				 if(i==1){
					 
						res.name="q";
						res.sex="man";
					 }
						
					 else{
						res.name="w";
						res.sex="woman";
					 }
					res.flag=true;
					res.notify();//���ѶԷ� �ջ���
			 }
			 i=(i+1)%2;
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
				//�ж��Ƿ�������
				if(!res.flag)//true �����
					try {
						res.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				System.out.println(res.name+"------"+res.sex);
				res.flag=false;
				res.notify();
			}
			
		}
		
		
	}
	
}