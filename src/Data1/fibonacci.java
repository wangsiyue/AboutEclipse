package Data1;

public class fibonacci {
	static int fibonacci(int i){
		if(i<=2){
			return 1;
		}else{
			return fibonacci(i-1)+fibonacci(i-2);
		}
		
	}
	public static void main(String[] args) {
		System.out.println(fibonacci(12));
		
	}
}
