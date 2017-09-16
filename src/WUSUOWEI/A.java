package WUSUOWEI;

import java.util.Date;

public class A {
	public static void main(String[] args) {
		System.out.println(new Date(new Date().getYear()+1, 0, 1)+"******");;
		new java.sql.Date(new Date().getYear(), 0, 1);
		char[] c=new char []{'f','1','g','v','2','w','e'};
		String s=new String(c,0,5);
		System.out.println(s);
		String d="fhkicd  op";
		System.out.println(d.length());
		int i=1;
		Integer aa=1;
		System.out.println(i==aa);
		/*String uu="3";
		String iu="i";
		String cd=uu.concat(iu);
		System.out.println(cd);*/
		String iu="i";
		StringBuffer uu=new StringBuffer();
		
		uu.append(iu);
		uu.append("faf");
		
		System.out.println(uu);
		/*String iu="i";
		StringBuilder uu=new StringBuilder();
		uu.append(3);
		uu.append(iu);
		uu.append("faf");
		
		System.out.println(uu);
		*/
	}

}
