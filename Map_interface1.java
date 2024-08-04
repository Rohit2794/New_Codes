package Base;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
public class Map_interface1 
{
	public static void main(String[] args) 
	{
		Map<String,String> m1=new HashMap<String,String>();
		m1.put("Ashwanth", "Chennai");
		m1.put("Roma", "Mumbai");
		m1.put("Arbind", "Delhi");
		m1.put("Kavitha", "Pune");
		m1.put("Mudita", "Noida");
		
		Iterator<Entry<String,String>> kv1=m1.entrySet().iterator();
		while(kv1.hasNext())
		{
			System.out.println(kv1.next());
		}
		

	}

}
