package Sequence1;
//数组中查找一个数
public class Arr {
	public static void main(String[] args) {
		int arr[]={3,76,5,11,37,89,2};
		int key=89;
		/*int i=0;
		for(;i<arr.length;i++){
			if(key==arr[i]){
				System.out.println("index"+"="+i);
				break;
			}
		}
		if(i==arr.length){
			System.out.println("index=-1");
		}*/
		int index=find(arr,key);
		System.out.println("index="+index);
	}
	//函数方法
	public static int find(int arr[],int key){
		for(int i=0;i<arr.length;i++){
			if(arr[i]==key){
				return i;
			}
		}
		return -1;
	}
	
}
