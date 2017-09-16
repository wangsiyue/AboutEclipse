package Exercise1;

public class Strin {
	public static void main(String[] args) {
		/*long time1=System.currentTimeMillis();
		String a="dafdfffffffsssssssss";
		int t=5000;
		String s="";
		for(int i=0;i<t;i++){
			s+=a;
		}
		long time2=System.currentTimeMillis();
		long time=(time2-time1);
		System.out.println(time);*/
		
		
		long time1=System.currentTimeMillis();
		String a="dafdfffffffsssssssss";
		int t=5000;
		StringBuffer sb=new StringBuffer();
		for(int i=0;i<t;i++){
			sb.append(a);
		}
		long time2=System.currentTimeMillis();
		long time=(time2-time1);
		System.out.println(time);
	}

}
