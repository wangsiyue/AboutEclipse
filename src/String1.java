import java.util.StringTokenizer;

public class String1 {
	public static void main(String[]args){
		String s="sfa,et,dsf,wf,wfer,h,rwr,er,w,4,dfsa,j";
		String result[]=s.split(",");
		/*StringTokenizer tokener=new StringTokenizer(s,",");
		String [] result1=new String[tokener.countTokens()];
		int i=0;
		while(tokener.hasMoreTokens()){
			result[i++]=tokener.nextToken();
		}
		*/
	/*	for(int i=0;i<result.length;i++){
			System.out.println(result[i]);
		}*/
		
		String nn[]=s.split("f", 3);
	
		for(int i=0;i<nn.length;i++){
			System.out.println(nn[i]+"****");
		}
		/*String a=s.substring(2);
		String i=s.substring(2,9);
		System.out.println(i);
		System.out.println(a);
		*/
		
		
		
	}

}
