package Properties;


import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

//properties 是一个map集合  存储的是属性   属性名和属性值 是字符串型所以  这个集合类没有使用泛型
/**
 * 
 * @author Administrator
 *可以和流集合使用的集合类
 */

public class Pro1 {

	
	public static void main(String[] args) {
		fun2();
	}
/*	
	
	public static void fun3(){
		//Properties 的使用
		Properties pro=new Properties();
		//把文件中的键值对存储到集合
		try {
			InputStream in = ClassLoader.getSystemResourceAsStream("Pro.properties");    
			Properties p = new Properties();   
			p.load(in); 
			
			FileWriter fw=new FileWriter("Pro.properties");
			pro.store(fw, "dddddddd");
			
			pro.setProperty("color", "blue");
			
			
			
		    InputStream in = new BufferedInputStream(new FileInputStream("Pro.properties"));  
		    pro.load(in);  
			 //FileReader fr=new FileReader("Pro.properties");
			//pro.load(fr);//把文件中的键值对存储到集合中
			
		//	pro.setProperty("color", "blue");
			//把在内存中做的修改保存到文件中
		//	FileWriter fw=new FileWriter("Pro.properties");
		//	pro.store(fw, null);
			
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}*/
	public static void fun2(){
		Properties pro=System.getProperties();//得到系统属性集
		/*System.out.println(pro);
	
	
		Set<String> keys=pro.stringPropertyNames();
		Iterator<String> ite=keys.iterator();
		while(ite.hasNext()){
			String key=ite.next();
			String value=pro.getProperty(key);
			System.out.println(key+"="+value);
		}
	
	*/
		pro.list(System.out);//把集合中的键值对写到控制台
		pro.setProperty("user.country", "China");//修改集合中的名字----在内存中做的修改   电脑关机后又变为CN
		pro.list(System.out);
	//user.country=CN
	
	}
	public static void fun1(){
		//创建一个集合类对象
		Properties pro=new Properties();
		//向集合类添加属性键值对
		pro.setProperty("name", "lise");
		pro.setProperty("age", "22");
		
		Set<String> keys=pro.stringPropertyNames();//得到所有键的集合
		Iterator<String>ite=keys.iterator();
		while(ite.hasNext()){
			String key=ite.next();
			String value=pro.getProperty(key);
			System.out.println(key+"="+value);
		}
		
		
		
		//修改集合中的名字----在内存中做的修改 
		pro.setProperty("name", "zhang");
		Set<String> keys1=pro.stringPropertyNames();//得到所有键的集合
		Iterator<String>ite1=keys1.iterator();
		while(ite1.hasNext()){
			String key=ite1.next();
			String value=pro.getProperty(key);
			System.out.println(key+"="+value);
		}
	}
}
