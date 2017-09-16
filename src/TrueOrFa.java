
public class TrueOrFa {
	public static void main(String[] args) {
		/*Integer i1=new Integer(1);
		Integer i2=1;
		int i3=1;
		System.out.println(i1.equals(i2));//true
		System.out.println(i1==i2);//false
		System.out.println(i1.equals(i3));//true
		System.out.println(i1==i3);//true
		System.out.println(i2.equals(i3));//true
		System.out.println(i2==i3);//true
		System.out.println(i1.equals(i2));//true
*/	
		
	
			String str="love";
			System.out.println("before exchange:"+str);//love
			exchange(str);//love123
			System.out.println("after exchange:"+str);//love
			System.out.println("before exchange2:"+str);//love
			exchange2(str);//love123
			System.out.println("after exchange2:"+str);//love
		} 
		public static void exchange(String str){
			str="love123";
			System.out.println("exchange中的str:"+str);
		}
		public static void exchange2(String str){
			str+="123";
		System.out.println("exchange2中的str:"+str);
		}	
	

}
