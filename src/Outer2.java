
public class Outer2 {
	//�ڲ������ⲿ���һ����Ա
	//�ڲ����к��о�̬��Ա   �ڲ�������Ǿ�̬��
	int num=3;
	public void fun(){
		Inner i=new Inner();
		i.show();
	}
	public class Inner{
		int num=2;
		public void show(){
			int num=1;
			System.out.println(num);
			System.out.println(this.num);//this ������ʵ�����ĳ�Ա����
			System.out.println(Outer2.this.num);//Outer.this ��ʾ�ⲿ��ĳ�Ա����
		}
	}
	
	
	public static void main(String[] args) {
		Outer2.Inner i=new Outer2().new Inner();
		i.show();
				
		
		
		
	}

}
