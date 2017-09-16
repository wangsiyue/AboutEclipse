
public class Outer2 {
	//内部类是外部类的一个成员
	//内部类中含有静态成员   内部类必须是静态的
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
			System.out.println(this.num);//this 代表访问的是类的成员变量
			System.out.println(Outer2.this.num);//Outer.this 表示外部类的成员变量
		}
	}
	
	
	public static void main(String[] args) {
		Outer2.Inner i=new Outer2().new Inner();
		i.show();
				
		
		
		
	}

}
