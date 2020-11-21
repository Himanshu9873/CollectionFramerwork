import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class CustomHashMapDemo 
{
	public static void main(String[] args) 
	{
		Employee1 emp1=new Employee1(10,"Harsh","Vidhya nagar dadri");
		Employee1 emp2=new Employee1(50,"Himanshu","Gagan vihar dadri");
		Employee1 emp3=new Employee1(70,"Neermal","Greater noida dadri");
		Employee1 emp4=new Employee1(20,"Honey","Delhi ");
		Employee1 emp5=new Employee1(30,"Suneeta","Dheradhun");
		Map<Integer,Employee1> map=new HashMap<Integer,Employee1>();
		map.put( 101,emp1);
		map.put( 102,emp2);
		map.put( 103,emp3);
		map.put( 104,emp4);
		map.put( 105,emp5);
		//System.out.println(map);
		Set set=map.entrySet();
		Iterator itr=set.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}
