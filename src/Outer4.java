
public class Outer4 {
	public abstract  class Test{
		public abstract void show() ;
	}
	
	//�����ڲ������Ҫ�и�����߸��ӿ�
	
	public void fun(){
		  
		/*class Inner extends Test{
			public void show(){
				System.out.println("i not care");
			}
			
			public void eat(){
				System.out.println("i want ice");
			}
		}
		Inner i=new Inner();
		i.show();
		
		//�����ڲ���
		new Test(){
			@Override
			public void show() {
				System.out.println("show1111111111");
				System.out.println("money!!!!!");
			}
			public void eat(){
				System.out.println("i want ice uuuuuuuu");
			}
		}.show();
		
		
		
		new Test(){
			@Override
			public void show() {
				System.out.println("show1111111111");
				System.out.println("money!!!!!");
			}
			public void eat(){
				System.out.println("i want ice uuuuuuuu");
			}
		}.eat();*/
	//	����Ӧ��ָ���������
		Test obi=new Test(){
			public void show() {
				System.out.println("show1111111111");
				System.out.println("money!!!!!");
			}
			public void eat(){
				System.out.println("i want ice uuuuuuuu");
			}
			
		};
	obi.show();
//		obi.eat();    Test ô��eat()����   
	
	
	
	System.out.println(new Object(){
		int age=9;
		String name="d";
		public String toString(){
			return name+"---"+age;
		}
	});
		
	}
	public static void main(String[] args) {
		Outer4 o=new Outer4();
		o.fun();
	}
	
	interface Inter{
		
	}

}
