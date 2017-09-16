package Sequence1;

import java.util.Arrays;

public class Two {
	//二分法必须按照大小排好
	public static void main(String[] args) {
		int arr[]={2,5,6,7,9,22,45,56,67,77,89,100,102};
		int key=45;
		//int i=HalfSearch(arr,key);
		//System.out.println("index"+"="+i);
		int i=Arrays.binarySearch(arr, key);
		System.out.println("index"+"="+i);
	}
	
	public static int HalfSearch(int arr[],int key){
		int min=0;int max=arr.length-1;int mid;
		while(min<=max){
			mid=(min+max)>>1;//除以2  相当于右移一位
			if(key>arr[mid]){
				min=mid+1;
				
			}
			else if(key<arr[mid]){
				max=mid-1;
			}else{
				return mid;
			}
		}
		return -1;
	}

}
