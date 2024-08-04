package Base;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Map_Interface11 
{
public static void main(String[] args) 
{
	Map<String, Integer> m1	=new HashMap<String, Integer>();
	m1.put("Ram", 51);
	m1.put("Sita", 49);
	m1.put("Supriya",32);
	m1.put("Mahesh", 28);
	m1.put("Suman", 33);
	//System.out.println(m1);	
	
	for(	Entry<String, Integer> kv:m1.entrySet())
	{
		System.out.println(kv);
	}
	
	
}
}
