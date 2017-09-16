package Thread1;
//线程间的通信    线程的任务不同  但是数据操作的数据相同


//wait() 让线程进等待状态  就是把线程放入线程池
//notify()  唤醒线程池中的任意一个
//,notifyall() 唤醒所以
//必须用在同步里面而且必须结合锁用
//指明让持有哪个锁的线程去等待被唤醒    可能不止一把锁
//锁是任意对象  任意对象都可以调用的方法   需要定义在object中
//存入的时候同时输出
public class Demo2 {
	
	public static void main(String[] args) {
		System.out.println("Hello !!!!!!!!");
		//创建资源的对象
		Res res=new Res();
		//创建任务
		Input in=new Input(res);
		Output out=new Output(res);
		//创建线程
		Thread t1=new Thread(in);
		Thread t2=new Thread(out);
		t1.start();
		t2.start();
		
	}
}
class Res{
	boolean flag;//默认为false
	String name ;
	String sex;
}

//描述输ru任务
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
				 //先判断该不该存
				 if(res.flag)//false 该存    不执行wait()  为true  执行wait()
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
					res.notify();//唤醒对方 空唤醒
			 }
			 i=(i+1)%2;
		 }
	 
	}
	
}
//两部分组成锁   输出时候不能输入
class Output implements Runnable{
	private Res res;
	public Output(Res res){
		this.res=res;
	}
	@Override
	public void run() {
		while (true){
			synchronized (res) {
				//判断是否可以输出
				if(!res.flag)//true 该输出
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