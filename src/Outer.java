
public class Outer {
	//内部类是外部类的一个成员
	//内部类中含有静态成员   内部类必须是静态的
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
	//内部类中含有静态成员   内部类必须是静态的
	public static class Inner{
		public static void show(){
			System.out.println("soWhat");
		}
	}
	public static void main(String[] args) {
		/*Outer o=new Outer();
		o.fun();
		//直接创建内部类
		Outer.Inner in=new Outer().new Inner();
		in.show();*/
		/*Outer.Inner in=new Outer.Inner();
		in.show();*/
		
		Outer.Inner.show();
	}

}
