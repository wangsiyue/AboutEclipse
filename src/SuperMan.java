
public class SuperMan {
	private String name;
	private static  SuperMan sm=new SuperMan("wangsiyue");
	private SuperMan (){}
	private SuperMan (String name){
		this.name=name;
	}
	public static SuperMan getInstance(){
		return sm;
	}
	public String getName(){
		return name;
	}
	public static void main(String []args){
		SuperMan s=SuperMan.getInstance();
		System.out.println(s.getName());
	}

}
