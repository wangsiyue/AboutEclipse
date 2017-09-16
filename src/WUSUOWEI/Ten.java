package WUSUOWEI;

public class Ten {
	public static void main(String[] args) {
		
		for (int i = 0; i < 10; i++) {
			for (int j=i; j <(6 + i); j++) {
				if (j<10) {
					System.out.print(j + " ");
				}
				else if (j>=10) {
					System.out.print(j%10 + " ");
				}
			}
			System.out.println();
		}
		
		/*for(int i=0;i<10;i++){
			int num=0;
			for(int j=i;num<6;num++,j++){
				if(j==10){ 
					j=0;
				}
				System.out.print(j+ " ");
			}
			System.out.println();
		}
		*/
	/*	int j=0;
		for(int i=0;i<10;i++){
			int num=0;
			j=i;
			while(num<6){
				
				System.out.print(j+ " ");
				j++;
				num++;
				if(j==10){
					j=0;
				}
			}
			
			System.out.println();
		}*/

	}

}
