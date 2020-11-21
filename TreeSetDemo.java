import java.util.SortedSet;
import java.util.TreeSet;
import java.util.Iterator;
class Employee2 implements Comparable
{
	int id;
	String name,address;
	Employee2(int id, String name, String address)
	{
		this.name=name;
		this.id=id;
		this.address=address;
	}
	@Override
	public String toString()
	{
		System.out.println();
		return id+" "+name+" "+address;
	}
	@Override
	/*public int compareTo(Object o)
	{
		Employee2 emp=(Employee2)o;
		if(this.id>emp.id)
			return -1;
		else if(this.id<emp.id)
		{
			return 1;
		}
		else
			
		return 0;
	}*/
	public int compareTo(Object o)
	{
		Employee2 emp=(Employee2)o;
		return this.name.compareTo(emp.name);
		
	}
	
	public void show()
	{
		System.out.println(id+" "+name+" "+address);
	}
}
public class TreeSetDemo 
{

	public static void main(String[] args) 
	{
		SortedSet sortSet=new TreeSet();
		Employee2 emp=new Employee2(22,"Himanshu Sharma","Vidhya Nagar dadri");	
		Employee2 emp1=new Employee2(50,"Shiv kumar Sharma","Vidhya Nagar dadri");
		Employee2 emp2=new Employee2(43,"Suneeta Sharma","Vidhya Nagar dadri");
		Employee2 emp3=new Employee2(24,"Preet Sharma","Vidhya Nagar dadri");
		Employee2 emp5=new Employee2(23,"Priyanka Sharma","Vidhya Nagar dadri");
		Employee2 emp4=new Employee2(21,"Sourabh Sharma","Vidhya Nagar dadri");
		sortSet.add(emp);
		sortSet.add(emp1);
		sortSet.add(emp2);
		sortSet.add(emp3);
		sortSet.add(emp4);
		sortSet.add(emp5);
		//System.out.println(sortSet);
		Iterator<Employee2> itr=sortSet.iterator();
		while(itr.hasNext())
		{
			Employee2 empRef=(Employee2)itr.next();
			empRef.show();
		}
	}

}
