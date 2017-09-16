package Exercise1;

public class Arr1 {
	public static void main(String[] args) {
		int src[]=new int[]{4,2,6,8,5,14,3,90,42,54,21,122};
		int dest[]=new int[]{4,2,13,55,3,5,8,3,2};
		
		for(int i=0;i<dest.length;i++){
			System.out.print(dest[i]+" ");
		}
		System.out.println();
		System.out.println("+++++++++++++++++++++++");
		System.arraycopy(src, 1, dest, 2, 4);
		for(int i=0;i<dest.length;i++){
			System.out.print(dest[i]+" ");
		}
		
		
		
	}

}
