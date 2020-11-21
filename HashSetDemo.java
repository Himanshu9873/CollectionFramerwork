import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;
import java.util.ListIterator;
class Employee
{
	int age;
	String name,address;
	Employee(int age, String name, String address)
	{
		this.age=age;
		this.name=name;
		this.address=address;
	}
}
public class HashSetDemo {
	public String toString()
	{
		return Integer.toHexString(hashCode());
	}

	public static void main(String[] args) {
	Employee emp=new Employee(22,"Himanshu Sharma","Vidhya Nagar dadri");	
	Employee emp1=new Employee(21,"Himanshu Sharma","Vidhya Nagar dadri");
	Employee emp2=new Employee(43,"Suneeta Sharma","Vidhya Nagar dadri");
	Employee emp3=new Employee(23,"Preet Sharma","Vidhya Nagar dadri");
	Employee emp4=new Employee(21,"Sourabh Sharma","Vidhya Nagar dadri");
     Set<Employee> set=new HashSet<Employee>();
     set.add(emp4);
     set.add(emp);
     set.add(emp1);
     set.add(emp2);
     set.add(emp3);
     //System.out.println(set);
     //System.out.println(set.toString());
     Iterator<Employee> itr=set.iterator();
     while(itr.hasNext())
     {
    	 Employee obj=(Employee)itr.next();
    	 System.out.println(obj.age+" "+obj.name+" "+obj.address);
     }
     //ListIterator<Employee> list=set.listIerator();     ListIterator Method doesnot work with HashSet
     //while()
	}

}
