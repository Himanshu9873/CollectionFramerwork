import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
class Emp
{
	String name,compname;
	int age;
	Emp(String name,String compname , int age)
	{
		this.name=name;
		this.compname=compname;
		this.age=age;
	}
	public String toString()
	{
		return name+" ,"+compname+" ,"+age;
	}
	public void show()
	{
		System.out.println(name+" "+age+" "+compname);
	}
	
}
public class UserDefined {

	public static void main(String[] args) {
		
		ArrayList<Emp> arrayList=new ArrayList<Emp>();
		Emp emp1=new Emp("Himanshu","The Coders Company",22);
		Emp emp2=new Emp("Ajeet","The Coders Company",22);
		Emp emp3=new Emp("Asish","The Coders Company",22);
		Emp emp4=new Emp("Shivam","The Coders Company",22);
		arrayList.add(emp1);
		arrayList.add(emp2);
		arrayList.add(emp3);
		arrayList.add(emp4);
		System.out.println(arrayList);
		//fetch one by one using iterator
		/*Iterator<Emp> itr=arrayList.iterator();
		while(itr.hasNext())
		{
			
			
			Emp emp=(Emp) itr.next();
			System.out.println(emp.name+" "+emp.age+" "+emp.compname);
		}
		
		// method 2 using ListIterator
		ListIterator<Emp> listItr=arrayList.listIterator();
		while(listItr.hasNext())
		{
			Emp emp=(Emp)listItr.next();
			emp.show();
		}
		 */
		// using lambda expression
		System.out.println("Lambda Expression....."+ " ");
		arrayList.forEach((a)->System.out.println(a+" "));
	}

}
