
public class Outer3 {
	 int v=29;
	//�ֲ��ڲ���   �����ڲ��е���   ֻ���ں�����ʹ��  ���˺����Ͳ���
	public void fun(){
		final int a=9;//����ֲ��ڲ���Ҫʹ���亯���ĳ�Ա����   ��Ա�������붨��Ϊfinal  
		class Inner{
			public void show(){
				System.out.println("i not care");
				System.out.println(v);
				System.out.println(a);
			}
		}
		Inner i=new Inner();
		i.show();
	}
	public static void main(String[] args) {
		Outer3 o=new Outer3();
		o.fun();
	}

}
