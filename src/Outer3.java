
public class Outer3 {
	 int v=29;
	//局部内部类   函数内部中的类   只能在函数中使用  出了函数就不行
	public void fun(){
		final int a=9;//如果局部内部类要使用其函数的成员变量   成员变量必须定义为final  
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
