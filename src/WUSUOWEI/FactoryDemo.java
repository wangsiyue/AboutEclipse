package WUSUOWEI;

public class FactoryDemo {
	public static void main(String[] args) {
		Factiry f=new Factiry();
		BMW bmw=f.getOne("BMW320");
		bmw.BMW();	
		
		BMW bmw1=f.getOne("BMW520");
		bmw1.BMW();	
		
		
		/*BMW bmw1e=new Factiry().getOne("BMW320");
		bmw1e.BMW();*/	
	}

}
