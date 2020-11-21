import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

class Name implements Comparator
{

	@Override
	public int compare(Object arg0, Object arg1) 
	{
		Employee4 emp1=(Employee4)arg0;
		Employee4 emp2=(Employee4)arg1;
		
		return emp1.name.compareToIgnoreCase(emp2.name);
	}
	}
class Age implements Comparator
{

	@Override
	public int compare(Object arg0, Object arg1) {
		Employee4 emp1=(Employee4)arg0;
		Employee4 emp2=(Employee4)arg1;
		if(emp1.age>emp2.age)
		{
			return -1;
		}
		else if(emp1.age<emp2.age)
		{
			return 1;
		}
		return 0;
	}
}
class Sallery implements Comparator
{

	@Override
	public int compare(Object arg0, Object arg1) {
		Employee4 emp1=(Employee4)arg0;
		Employee4 emp2=(Employee4)arg1;
		if(emp1.sal>emp2.sal)
		{
			return -1;
		}
		else if(emp1.sal<emp2.sal)
		{
			return 1;
		}
		return 0;
	}
}
public class ComparatorDemo
{
	public static void main(String[] args)
	{
		//Comparator comp=new Name();
		//Comparator comp=new Age();
		Comparator comp=new Sallery();
		Employee4 e1=new Employee4("Ram",21,44.18f);
		Employee4 e2=new Employee4("Shyam",24,56.18f);
		Employee4 e3=new Employee4("Ramesh",29,36.18f);
		Employee4 e4=new Employee4("Mohan",37,40.18f);
		Employee4 e5=new Employee4("Sohan",51,39.18f);
		Set set=new TreeSet(comp);
		set.add(e1);
		set.add(e2);
		set.add(e3);
		set.add(e4);
		set.add(e5);
		Iterator<Employee4> itr=set.iterator();
		while(itr.hasNext())
		{
			Employee4 emp=(Employee4)itr.next();
			emp.show();
		}
	}

}
