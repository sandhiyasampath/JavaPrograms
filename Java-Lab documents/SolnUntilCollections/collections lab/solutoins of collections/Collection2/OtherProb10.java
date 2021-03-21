//Test maps
package uttara.solutions.Collection2;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class OtherProb10 {

	public static void main(String[] args) {
		Map<String,String> m = new TreeMap <String,String>();
		m.put("raj", "No1");
		m.put("punraj", "No2");
		m.put("vishn", "No3");
		m.put("yash", "444");
		m.put("amir", "No5");
		m.put("raj", "No1");

		System.out.println(m);
		System.out.println(m.get("amir"));
		System.out.println("Noramal map is "+m);

		m.put("yash","888");
		System.out.println("Value used for replacing..."+m.get("yash"));
		m.remove("raj");

		System.out.println("after removing... "+m);
		System.out.println(m.containsKey("raj"));
		System.out.println(m.containsValue("888"));
		m.remove("amir");

		System.out.println(m);
		System.out.println("size s "+m.size());
		Set<String>s=m.keySet();

		System.out.println("Key set is "+s);
		Collection<String>z=m.values();
		System.out.println("Values are  "+z);

		Set<Entry<String,String>>y=m.entrySet();
		System.out.println("Entries are "+y);
		for(Entry<String,String> x:y)
		{
		//System.out.println("iterated elements "+x.getKey()+" and "+x.getValue());
			System.out.println(x);
		}

		Iterator<Entry<String, String>> i=y.iterator();
		while(i.hasNext())
		{
			System.out.println("iteration "+i.next());
		}

	}

}
