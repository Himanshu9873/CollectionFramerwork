import java.util.Vector;
import java.util.Collections;
import java.util.Collection;
import java.util.Iterator;
import java.util.Enumeration;
import java.util.ListIterator;
public class VectorDemo {

	public String toString()
	{
		return getClass().getName() ;
	}
	public static void main(String[] args) {
		Vector vector=new Vector();
		VectorDemo demo=new VectorDemo();
		System.out.println(demo.toString());
		vector.add(50);
		vector.add(100);
		vector.add(40);
		vector.add(30);
		vector.add(50);
		System.out.println(vector);
		Collections.sort(vector);
		System.out.println(vector);
		vector.remove(3);
		System.out.println(vector);
		//get data from 1st palace
		System.out.println(vector.get(1));
		System.out.println("fetching data one By One........");
		//  using iterator
		/*Iterator itr=vector.iterator();
		while(itr.hasNext())
		{
			Object object=(Object)itr.next();
			System.out.print(object+" ");
		}*/
		// Using Enumeration interface but it used in legacy Classes 
		/*Enumeration enumeration=vector.elements();
	    while(enumeration.hasMoreElements())
	    {
	    	System.out.print(enumeration.nextElement()+" ");
	    }*/
		//method three using lambda Expression
		//vector.forEach((a)->System.out.print(a+" "));
		// method 4 using ListIterator
		ListIterator listItr=vector.listIterator();
		while(listItr.hasNext())
		{
			System.out.print(listItr.next()+" ");
		}
       // we can fetch the elements using 2 differ methods
		// for and using For each loop
		System.out.println("We have 4 constructor in Vector class");
		// constructor 1 initial capacity with 100% increment
		Vector vector1=new Vector();
		System.out.println(vector1.capacity());
		// Vector Capacity with user defined capacity
		Vector vector2=new Vector(4);
		System.out.println(vector2.capacity());
		// third using Collection with reference
		Vector vector3=new Vector(vector);
		System.out.println(vector3.capacity());
		// Fourth one take initial capacity as well as incremential capacity
		// example Vector(3,1); 3 is initaial capacity and 1 is incremental capacity
	}

}
