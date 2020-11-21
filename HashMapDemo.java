import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.*;

public class HashMapDemo
{

	public static void main(String[] args)
	{
		Map<String, String> map=new HashMap<String, String>();
		System.out.println(map.isEmpty());
		map.put("0123","Himanshu");
		map.put("123","Himanshu");
		map.put("123","Himanshu");
		map.put("13","Himanshu");
		System.out.println(map.containsKey("123"));
		System.out.println(map);
		//Collection cl=map.values();// values return List type value
		//Set set=map.keySet(); // keySet() return Set type values
		Set set=map.entrySet();
		Iterator itr=set.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}

	}

}
