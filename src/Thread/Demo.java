package Thread;
//线程间的通信    线程的任务不同  但是数据操作的数据相同

//存入的时候同时输出
public class Demo {
	
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
				System.out.println(res.name+"------"+res.sex);
			}
			
		}
		
		
	}
	
}