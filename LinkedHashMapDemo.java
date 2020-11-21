import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.LinkedHashMap;
public class LinkedHashMapDemo {

	public static void main(String[] args) {
		Pass p1=new Pass("Himanshu@123");
		Pass p2=new Pass("Sourabh@123");
		Pass p3=new Pass("Preet@123");
		Pass p4=new Pass("Sourabh@123");
		IdDemo demo1=new IdDemo(101);
		IdDemo demo2=new IdDemo(102);
		IdDemo demo3=new IdDemo(103);
		IdDemo demo4=new IdDemo(104);
		Map<IdDemo,Pass> map=new LinkedHashMap<IdDemo,Pass>();
		map.put(demo1,p1 );
		map.put(demo2,p2);
		map.put(demo3,p3);
		map.put(demo4,p4);
		System.out.println("****** Keys are ******");
		Set set=map.keySet();
		Iterator itr=set.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println("****** Values are ******");
		Collection cl=map.values();
		Iterator itr1=cl.iterator();
		while(itr1.hasNext())
		{
			System.out.println(itr1.next());
		}
		
		System.out.println("****** Key & Values  are ******");
		Set set1=map.entrySet();
		Iterator itr2=set1.iterator();
		while(itr2.hasNext())
		{
			System.out.println(itr2.next());
		}

	}

}
