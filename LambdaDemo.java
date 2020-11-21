import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

class Employee4
{
	String name;
	int age;
	float sal;
	Employee4(String name,int age,float sal)
	{
		this.name=name;
		this.age=age;
		this.sal=sal;
	}
	@Override
	public  String toString()
	{
		return name+" "+age+" "+sal+"\n";
	}
	
	public void show()
	{
		System.out.println(age+" "+name+" "+sal);
	}
	}
public class LambdaDemo {

	public static void main(String[] args)
	{
		
		Employee4 e1=new Employee4("Ram",21,44.18f);
		Employee4 e2=new Employee4("Shyam",24,56.18f);
		Employee4 e3=new Employee4("Ramesh",29,36.18f);
		Employee4 e4=new Employee4("Mohan",37,40.18f);
		Employee4 e5=new Employee4("Sohan",51,39.18f);
		List<Employee4> arrayList=new ArrayList<Employee4>();
		arrayList.add(e1);
		arrayList.add(e2);
		arrayList.add(e3);
		arrayList.add(e4);
		arrayList.add(e5);
		System.out.println("******Using Override ToString Method******");
		System.out.println(arrayList);
		System.out.println("******Using Iterator******");
		Iterator<Employee4> itr=arrayList.iterator();
		while(itr.hasNext())
		{
			Employee4 empRef=(Employee4)itr.next();
			empRef.show();
		}
		//Lambda Method 
		Collections.sort(arrayList,(a,b)->
		{
			return a.name.compareTo(b.name);
		});
		// forEach loop
		System.out.println("*****Using Lambda Expression*******");
		for(Employee4 emp:arrayList)
		{
			System.out.println(emp.name+" "+emp.age+" "+emp.sal);
		}
		// Filter in Collection
		System.out.println("******Filter Data using Stream******");
		Stream<Employee4> f_data=arrayList.stream().filter(a->a.age>23);
		f_data.forEach(a->System.out.println(a.age+" "+a.name+" "+a.sal));
	}

}
