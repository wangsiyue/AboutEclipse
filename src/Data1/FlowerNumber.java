package Data1;

public class FlowerNumber {//Ë®ÏÉ»¨Êı
	public static void main(String[] args) {
		for(int i=100;i<999;i++){
			int gewei=i%10;
			int shiwei=i/10%10;
			int baiwei=i/100%10;
			if(i==gewei*gewei*gewei+shiwei*shiwei*shiwei+baiwei*baiwei*baiwei){
				System.out.print(i+"  ");
			}
		}
	}

}
