package Base;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Map_Interface12
{
public static void main(String[] args) 
{
		Map<String,String> m1=new HashMap<String,String>();
			m1.put("Ashwanth", "Chennai");
			m1.put("Roma", "Mumbai");
			m1.put("Arbind", "Delhi");
			m1.put("Kavitha", "Pune");
			m1.put("Mudita", "Noida");
			
		for(Entry<String,String> kv:m1.entrySet())
		{
			System.out.println(kv);
		}
			
			
	
		
}
}
