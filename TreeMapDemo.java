import java.util.TreeMap;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
public class TreeMapDemo 
{
	public static void main(String[] args)
	{
		Employee3 emp1=new Employee3(10,"Harsh","Vidhya nagar dadri");
		Employee3 emp2=new Employee3(50,"Himanshu","Gagan vihar dadri");
		Employee3 emp3=new Employee3(70,"Neermal","Greater noida dadri");
		Employee3 emp4=new Employee3(20,"Honey","Delhi ");
		Employee3 emp5=new Employee3(30,"Suneeta","Dheradhun");
		Comparator comp=new IdComp();
		Map<Employee3,Integer> map=new TreeMap<Employee3,Integer>(comp);
		map.put(emp1,105);
		map.put(emp1,102);
		map.put(emp1,101);
		map.put(emp1,104);
		map.put(emp1,103);
		//System.out.println(map);
		Set set=map.entrySet();
		Iterator<Employee3> itr=set.iterator();
		while(itr.hasNext())
		{
			Employee3 emp=(Employee3)itr.next();
			System.out.println(emp);
		}
	}

}
