import java.util.*;
class Employee3
{
	int id;
	String name,address;
	Employee3(int id, String name, String address)
	{
		this.name=name;
		this.address=address;
		this.id=id;		
	}
	@Override
	public String toString()
	{
		return  id+" "+name+" "+address;
	}
	public void show()
	{
		System.out.println( id+" "+name+" "+address);
 	}
	}
public class TreeSetDemo1
{

	public static void main(String[] args) 
	{
		Comparator comp=new AddressComp();
		// for Id by sort
		//Comparator comp=new IdComp();
		// for name by sort
		//Comparator comp=new NameComp();
				
	Set set=new TreeSet(comp);
	Employee3 emp1=new Employee3(5,"Satend Kumar ","Upralsii");
	Employee3 emp2=new Employee3(10,"sanjeev Kumar","Jarcha");
	Employee3 emp3=new Employee3(120,"shiv Kumar Sharma","Ghori");
	Employee3 emp4=new Employee3(55,"shiv naresh Sharma","Gagan vihar");
	Employee3 emp5=new Employee3(20,"PriyankaSharma","Vidhya nagar Dadri");
	Employee3 emp6=new Employee3(25,"Preet Sharma","Vidhya nagar Dadri");
	set.add(emp1);
	set.add(emp2);
	set.add(emp3);
	set.add(emp4);
	set.add(emp5);
	set.add(emp6);
	System.out.println(set);
	Iterator<Employee3> itr=set.iterator();
	while(itr.hasNext())
	{
		Employee3 obj=(Employee3)itr.next();
		obj.show();
	}

	}
}
