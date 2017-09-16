package WUSUOWEI;

public class Example {
	// String str = new String("good");
	

	public static void main(String[] args) {
		String str = "good";
		 char[] ch = { 'a', 'b', 'c' };
		Example ex = new Example();
		ex.change(str, ch);
		//ex.change(ex.str, ex.ch);
		//System.out.println(ex.str + "------" + ex.ch[0]+ ex.ch[1]);
		System.out.println(str + "------" + ch[0]+ ch[1]);
		
	}

	public void change(String str1, char ch[]) {
		str1 = "test ok";
		ch[0] = 'g';
	}
}
