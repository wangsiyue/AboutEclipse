package WUSUOWEI;

public class Factiry {
	public BMW getOne(String a){
		
		if(a.equalsIgnoreCase("BMW320")){
			return new BMW320();
		}if(a.equalsIgnoreCase("BMW520")){
			return new BMW520();
		}
		else return null;
		
	}

}
