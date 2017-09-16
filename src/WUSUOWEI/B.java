package WUSUOWEI;


public class B extends C implements E{

	public void px(){
		System.out.println(x);//The field x is ambiguous

	}
	public static void main(String[] args) {
		new B().px();
	}
}

interface E{
	int x=0;
}
class C{
	//int x=1;
}
