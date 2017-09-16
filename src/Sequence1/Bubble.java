package Sequence1;
//冒泡排序  下标相邻的两个数比较
//它重复地走访过要排序的数列，一次比较两个元素，如果他们的顺序错误就把他们交换过来。
//走访数列的工作是重复地进行直到没有再需要交换，也就是说该数列已经排序完成。
/*
 * 冒泡排序算法的运作如下：（从后往前）

    比较相邻的元素。如果第一个比第二个大，就交换他们两个。
    对每一对相邻元素作同样的工作，从开始第一对到结尾的最后一对。在这一点，
    最后的元素应该会是最大的数。
    针对所有的元素重复以上的步骤，除了最后一个。
    持续每次对越来越少的元素重复上面的步骤，直到没有任何一对数字需要比较。
 */
public class Bubble {
	public static void main(String[] args) {
		int arr[]={3,76,5,11,37,89,2};
		Bubbles(arr);
		for(int i=0;i<arr.length;i++){
			
				System.out.print(arr[i]+",");
			
			
		}
	}
	public static void Bubbles(int arr[]){
		for(int i=0;i<arr.length-1;i++){
			for(int j=0;j<arr.length-i-1;j++){
				if(arr[j]>arr[j+1]){
					Change(arr,j);
				}
			}
		}
	}
	private static void Change(int[] arr, int i) {
		int c=arr[i];
		arr[i]=arr[i+1];
		arr[i+1]=c;
		
		
	}
}
