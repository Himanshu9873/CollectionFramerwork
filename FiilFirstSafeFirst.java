package ConcurrentPackClass;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.*;
public class FiilFirstSafeFirst extends Thread
{
	 static ArrayList arrayList=new ArrayList();
	 public void run()
	 {
		 arrayList.add(220);
	 }
	 public String toString()
	 {
		 return "Himanshu";
	 }
	public static void main(String[] args) 
	{
		FiilFirstSafeFirst fill=new FiilFirstSafeFirst();
		fill.start();
		arrayList.add(101);
		try
		{
		  Thread.sleep(2000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		arrayList.add(101);
		Iterator itr=arrayList.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}
