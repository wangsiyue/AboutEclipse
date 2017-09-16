package Data1;

import java.util.Date;

public class Final{
	
	public static void main(String[] args) {
		System.out.println(new Final().test());
		
	}

	static String  test() {
		System.out.println("aaaaaa");
		try{
			System.out.println("bbbbbbb");
			String  x="ddd";
			return x;
		}finally{
			System.out.println("ggg");
			
		}
		
	}
	

}
