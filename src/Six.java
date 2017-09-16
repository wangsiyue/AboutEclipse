import java.util.Random;


public class Six {
	public static void main(String[] args) {
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		Random r=new Random();
		int arr[]=new int[6];
		
		for(int i=0;i<6;i++){
			boolean info=true;
			int num=r.nextInt(10);
			for(int j=0;j<6;j++){
				if(num==arr[j]){
					i--;
					info=false;
					break;
				}
				
			}
			
			
			if(info){
				arr[i]=num;
			}
			
		}
		for(int k=0;k<6;k++){
			System.out.print(arr[k]+" ");
		}		
	}

}
