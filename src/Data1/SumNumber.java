package Data1;
//��a+aa+aaa+aa.....a��ӵ�ֵ  ������a��һ�����飬���磺3+33+333+3333=3702
public class SumNumber {
	public SumNumber(int num,int count){
		int []r=getNumber(num,count);
		System.out.println(getString(r)+"="+calResult(r));
	}

	/*�õ���Ҫ������*/
	private int[] getNumber(int num, int count) {
		int []numbers=new int[count];
		int temp=0;
		for(int i=0;i<count;i++){
			for(int j=0;j<count-i;j++){
				int a =10;
				temp +=num*Math.pow(a, j);//a��j�η�     a,j��Ӧ��Ϊ������
			}
			numbers[i]=temp;
			temp=0;
		}
		return numbers;
	}
	//�Ը�������м���
		private int calResult(int[] r) {
			int result=0;
			for(int i=0;i<r.length;i++){
				result+=r[i];
			}
			return result;
		}
		//ȡ�ø�������ַ�����ʽ
		private String getString(int[] r) {
			String temp="";
			String result;
			int len=r.length;
			for(int i=len-1;i>=0;i--){
				temp+=r[i]+"+";
				
			}
			result=temp.substring(0,temp.length()-1);
			return result;
		}
		public static void main(String[] args) {
			new SumNumber(3,4);
			//3+33+333+3333=3702;
		}
}
