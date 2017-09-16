package Thread;
//懒汗式线程不安全
 public class Single {
	 private static Single s;
		private Single(){}
		public static Single getInstance(){
			//优化
			
			if(s==null)//判断之后   锁就不要判断了    判断锁耗资源
				synchronized(Single.class){
					if(s==null){
						s=new Single();
					}
					
				}
				return s;
			
		}
	public static void main(String[] args) {
		Task Task=new Task();
		Thread t1=new Thread(Task);
		Thread t2=new Thread(Task);
		t1.start();
		t2.start();
	}

	
}
class Task implements Runnable{
	@Override
	public void run() {
		Single s=Single.getInstance();
		System.out.println("fffffff");
	}
}
