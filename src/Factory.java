
public class Factory {
	private  int num;
	private static Factory f=new Factory();
	private Factory(){}
	public static Factory getInstance(){
		return f;
		
	}
	public void jiagong(){
		System.out.println("���ǵ�"+(++num)+"�����");
	}
	public static void main(String[] args) {
		Factory s=Factory.getInstance();
		s.jiagong();
		s.jiagong();
		s.jiagong();
		s.jiagong();
		s.jiagong();
		Factory s1=Factory.getInstance();
		s1.jiagong();
		s1.jiagong();
		s1.jiagong();
		s1.jiagong();
	}
	

}
