
public class Outer {
	//�ڲ������ⲿ���һ����Ա
	//�ڲ����к��о�̬��Ա   �ڲ�������Ǿ�̬��
	int num=9;
	public void fun(){
		Inner i=new Inner();
		i.show();
	}
	/*public class Inner{
		public void show(){
			System.out.println(num);
		}
	}*/
	/*public static class Inner{
		public void show(){
			System.out.println("soWhat");
		}
	}*/
	//�ڲ����к��о�̬��Ա   �ڲ�������Ǿ�̬��
	public static class Inner{
		public static void show(){
			System.out.println("soWhat");
		}
	}
	public static void main(String[] args) {
		/*Outer o=new Outer();
		o.fun();
		//ֱ�Ӵ����ڲ���
		Outer.Inner in=new Outer().new Inner();
		in.show();*/
		/*Outer.Inner in=new Outer.Inner();
		in.show();*/
		
		Outer.Inner.show();
	}

}
