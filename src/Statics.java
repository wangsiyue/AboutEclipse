
public class Statics {
	static int value1=9;
	public void printvalue(){
		int value1=3;
		System.out.println(this.value1);
	}

	public static void main(String[] args) {
		new Statics().printvalue();
	}
	
}
