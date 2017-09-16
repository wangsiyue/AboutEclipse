package Sequence1;
//选择排序   
//依次固定每个下标，让每个固定下标的数和后面所有的数进行比较
//选择排序是不稳定的排序方法
//（比如序列[5， 5， 3]第一次就将第一个[5]与[3]交换，导致第一个5挪动到第二个5后面）。
public class Select {
	public static void main(String[] args) {
		int arr[]={3,76,5,11,37,89,2};
		selection(arr);
		for(int i=0;i<arr.length;i++){
			if(i!=arr.length-1){
				System.out.print(arr[i]+",");
			}else{
				System.out.print(arr[i]);
			}
			
		}
		
	}
	public static  void selection(int arr[]){
		for(int i=0;i<arr.length-1;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]<arr[j]){
					Change(arr,i,j);
				}
			}
		}
	}
	//交换两个下标的数
	public static void Change(int arr[],int a,int b){
		int c=arr[b];
		arr[b]=arr[a];
		arr[a]=c;
		
	}
}











































