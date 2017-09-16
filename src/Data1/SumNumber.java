package Data1;
//求a+aa+aaa+aa.....a相加的值  ，其中a是一个数组，例如：3+33+333+3333=3702
public class SumNumber {
	public SumNumber(int num,int count){
		int []r=getNumber(num,count);
		System.out.println(getString(r)+"="+calResult(r));
	}

	/*得到需要的数组*/
	private int[] getNumber(int num, int count) {
		int []numbers=new int[count];
		int temp=0;
		for(int i=0;i<count;i++){
			for(int j=0;j<count-i;j++){
				int a =10;
				temp +=num*Math.pow(a, j);//a的j次方     a,j都应该为浮点型
			}
			numbers[i]=temp;
			temp=0;
		}
		return numbers;
	}
	//对该数组进行计算
		private int calResult(int[] r) {
			int result=0;
			for(int i=0;i<r.length;i++){
				result+=r[i];
			}
			return result;
		}
		//取得该数组的字符串形式
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
