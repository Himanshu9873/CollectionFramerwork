import java.util.LinkedList;
import java.util.ArrayList;
import java.util.List;
public class ArrayVsLinked {

	public static void main(String[] args)
	{
		List array=new ArrayList();
		List linked=new LinkedList();
		// arrayList Inserction
		long startTime=System.nanoTime();
		for(int i=0;i<1000;i++)
		{
			array.add(i);
		}
		long endTime=System.nanoTime();
		System.out.println("ArrayList Inserction time"+(endTime-startTime));
		startTime=System.nanoTime();
		// LinkedList inserction
		for(int i=0;i<1000;i++)
		{
			linked.add(i);
		}
		endTime=System.nanoTime();
		System.out.println("LinkedList Inserction time"+(endTime-startTime));
	
		// arrayList Fetching
		 startTime=System.nanoTime();
		for(int i=0;i<1000;i++)
		{
			array.get(i);
		}
		 endTime=System.nanoTime();
		System.out.println("ArrayList Traverse time"+(endTime-startTime));
		startTime=System.nanoTime();
		// LinkedList Fetching
		for(int i=0;i<1000;i++)
		{
			linked.get(i);
		}
		endTime=System.nanoTime();
		System.out.println("LinkedList Traverse time"+(endTime-startTime));
	    
		// arrayList remove
	    startTime=System.nanoTime();
	    for(int i=1000-1;i>0;i--)
		{
			array.remove(i);
		}
		endTime=System.nanoTime();
		System.out.println("ArrayList Remove time"+(endTime-startTime));
		startTime=System.nanoTime();
		// LinkedList remove
		for(int i=1000-1;i>0;i--)
		{
			linked.remove(i);
		}
		endTime=System.nanoTime();
		System.out.println("LinkedList Remove time"+(endTime-startTime));
	
		
	}

}
