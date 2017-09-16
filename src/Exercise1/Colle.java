package Exercise1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


public class Colle {
	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
		list.add("d");
		list.add("dd");
		list.add("dx");
		list.add("dx");
		
		Iterator<String> it=list.iterator();
		/*while(it.hasNext()){
			System.out.println(it.next());
			//System.out.println(list);// if and while
		}
		*/
		
		
		Map<String,String> map=new HashMap<>();
		map.put("1", "a");
		map.put("2", "b");
		map.put("3", "c");
		map.put("4", "d");
		map.put("13", "1c");
		map.put("14", "1d");
		map.put("33", "c5");
		map.put("43", "d3");
		/*map.put("4", "dt");
		map.put("4", "det");*/
		String aa=map.get("1");
		String waa=map.get("4");
		//System.out.println(waa);
		Set<Entry<String,String>> set=map.entrySet(); 
		/*for(Entry<String, String> en:set){
			String key=en.getKey();
			String value=en.getValue();
			System.out.println(key+"-------"+value);
		}*/
		
		
		
		
		Set<Object> set1=new HashSet<>();
		set1.add("d");
		set1.add("de");
		set1.add("wd");
		set1.add("dee");
		set1.add("dee");
		set1.add("de2e");
		Iterator<Object> i=set1.iterator();
		while(i.hasNext()){
			System.out.print(i.next()+"--");
		}
		
		
	}

}
