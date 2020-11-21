import java.util.*;
class Employee1 
{
	int age;
	String name,address;
	Employee1(int age,String name,String address)
	{
		this.age=age;
		this.name=name;
		this.address=address;
	}
	public String toString()
	{
		return age+" "+name+" "+address+"\n";
	}
	public int hashCode()
	{
		return age*10;
	}
	public boolean equals(Object o)
	{
		Employee1 emp=(Employee1)o;
		if(this.age==emp.age)
		{
			return true;
		}
		else 
			return false;
	}
	public void show()
	{
		System.out.println(age+" "+name+" "+address);
	}
}
	
	
	
public class CustomHashSet {

	public static void main(String[] args)
	{
		Employee1 emp=new Employee1(21,"Himanshu","Vidhya nagar dadri");
		Employee1 emp1=new Employee1(21,"Himanshu","Vidhya nagar dadri");
		Employee1 emp2=new Employee1(21,"Himanshu","Vidhya nagar dadri");
		Employee1 emp3=new Employee1(21,"Himanshu","Vidhya nagar dadri");
		Employee1 emp4=new Employee1(21,"Himanshu","Vidhya nagar dadri");
		Set set=new HashSet();
		
		set.add(emp);
		set.add(emp1);
		set.add(emp2);
		set.add(emp3);
		set.add(emp4);
		System.out.println(set);
		Iterator<Employee1> itr=set.iterator();
		while(itr.hasNext())
		{
			Employee1 employee=(Employee1)itr.next();
			employee.show();
		}
	}

}
