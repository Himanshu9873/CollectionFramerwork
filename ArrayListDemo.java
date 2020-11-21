import java.util.*;
//import java.util.Collection;
public class ArrayListDemo 
{
	
	public  String toString()
    {
    	return "Himanshu Sharma";
    }
	public static void main(String[] args) {
    
		ArrayListDemo demo=new ArrayListDemo();
		ArrayList arrayList=new ArrayList();
		// its tells the list is empty or not
		System.out.println(arrayList.isEmpty());
		// its tells the list size
		System.out.println(arrayList.size());
		arrayList.add(10);
		arrayList.add(20);
		arrayList.add(30);
		arrayList.add("Hello");
		arrayList.add("Himanshu");
		arrayList.add(12.04);
		System.out.println(demo);
		System.out.println(arrayList);
		//ArrayList1 contains a arrayList obj in its constructor
		ArrayList arrayList1=new ArrayList(arrayList);
		arrayList1.add("Hello");
		arrayList1.add("Hye");
		arrayList1.add("bye");
		System.out.println(arrayList1);
		System.out.println(arrayList1.size());
		System.out.println(arrayList1.contains("Hello"));
		System.out.println(arrayList1.get(2));
		System.out.println(arrayList1.set(1, 12));
		//arrayList1.retainAll(arrayList);
		arrayList1.remove(arrayList);
		System.out.println(arrayList1);
		// fetch a element from arrayList
		// method 1 using for loop
		/*for(int i=0;i<arrayList1.size();i++)
		{
			System.out.print(arrayList1.get(i)+" ");
		}
		*/
		// method 2 using foreach loop
		/*
		for(Object o:arrayList1)
		{
			System.out.println(o);
		}
		*/
		// method 3 using Iterator
		/*Iterator u=arrayList1.iterator();
		while(u.hasNext())
		{
			Object object=(Object)u.next();
			System.out.print(object+" ");
		}*/
		// method 4 ListIterator
		
	}
}
