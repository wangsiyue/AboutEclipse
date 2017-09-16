
public class Single {
	/*¶öººÊ½
	 * 
	 * private static  Single s=new Single();
	private Single(){}
	public static Single getInstance(){
		return s;
		
	}*/
	//ÀÁººÊ½
	private static  Single s=null;
	private Single(){}
	public static Single getInstance(){
		if(s==null){
			s=new Single();
		}
		return s;
		
	}
	public static void main(String[]args){
		Single s1=Single.getInstance();
		Single s2=Single.getInstance();
		System.out.println(s1==s2);
	}

}
