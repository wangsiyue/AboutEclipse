package Thread;
//һ����̳�  Thread   
/*
 * ��дrun����
 * ʵ����
 * start   
 */
public class Thread1 {
	
	public static void main(String[] args) {
		//�߳��Ƕ�����  ����һ�������쳣  �����̲߳���Ӱ��
		Person p1=new Person("����");
		Person p2=new Person("����");
		p1.start();
		p2.start();
		
		//System.out.println(4/0);
		System.out.println(Thread.currentThread().getName()+"hello world");
	}
	
}
class Person extends Thread{
	private String name;
	public Person(){}
	public Person(String name){
		this.name=name;
	}
	
	
	public void run(){
		for(int i=1;i<=10;i++){
			int arr[]=new int [5];
			System.out.println(arr[3]);
			System.out.println(Thread.currentThread().getName()+name+"--"+i);
		}
	}
}