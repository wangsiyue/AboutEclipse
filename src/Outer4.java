
public class Outer4 {
	public abstract  class Test{
		public abstract void show() ;
	}
	
	//匿名内部类必须要有父类或者父接口
	
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
		
		//匿名内部类
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
	//	父类应用指向子类对象
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
//		obi.eat();    Test 么有eat()方法   
	
	
	
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
