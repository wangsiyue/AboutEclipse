package WUSUOWEI;

public class juzheng {
	public static void main(String args[]) {
		int arr[] = { 4, 2, 3, 7, 8 };// 定义数组内容
		int count;// 计数器
		int length = arr.length;// 数组的长度
		System.out.println(length);//5
		for (int i = 0; i < length; i++) {
			count = 0;
			for (int j = i; count < length; count++, j++) {
				if (j > length - 1)
					
					j = 0;
				System.out.print(arr[j] + "\t");
			}
			System.out.println();
		}
	}
}
