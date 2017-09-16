package Mianshi;
/**
 * 使用for循环、while循环和递归写出3个函数来计算给定数列的总和。
 * @author Administrator
 *
 */
public class Test1 {
	public static void main(String[] args) {
		Test1 t=new Test1();
		int arr[]=new int[]{5,7,3,1};
		//t.forSum(arr);
		System.out.println(t.recursiveMethod(arr, 0));
		t.recursiveMethod(arr, 0);
	}
	/*public  int Sum1(){
		int arr[]=new int[]{5,7,3,1};
		int sum=0;
		int count=arr.length;
		for(int i=0;i<count;i++){
			sum+=arr[i];
		}
		System.out.println(sum);
		return sum;
		
	}
	
	public  int Sum2(){
		int arr[]=new int[]{5,7,3,1};
		int sum=0;
		int count=arr.length;
		int i=0;
		while(i<count){
			sum+=arr[i];
			i++;
		}
		System.out.println(sum);
		return sum;
		
	}*/
	
	public static void forSum(int arr[]){
		if(arr==null||arr.length<1){
			return;
		}
		int sum=0;
		int count=arr.length;
		for(int i=0;i<count ;i++){
			sum+=arr[i];
		}
		System.out.println(sum);
	}
	public static void whileMethod(int[] array) {
	    if (array == null || array.length < 1) {
	        return;
	    }

	    int sum = 0;
	    int i = 0;

	    while ( i < array.length) {
	        sum += array[i];
	        i++;
	    }

	    System.out.println("while:"+sum);

	}
	public static int recursiveMethod(int[] array,int i) {
	    if (array == null || array.length < 1) {
	        return 0;
	    }

	    if (i < array.length ) {
	        return array[i] + recursiveMethod(array, i+1);
	    }

	    return 0;

	}

}
