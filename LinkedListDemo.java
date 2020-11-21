import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;
public class LinkedListDemo {

	public static void main(String[] args)
	{
		LinkedList  ll=new LinkedList();
		System.out.println(ll);
		ll.add("One");
		ll.add("Two");
		ll.push("Three");
		ll.add("Four");
		//Collections.sort(ll);
		//System.out.println(ll);
		System.out.println("Iterator method...");
		Iterator iterator=ll.iterator();
		while(iterator.hasNext())
		{
			Object object=(Object)iterator.next();
			System.out.print(object+" ");
		}
		System.out.println();
		System.out.println("Traversal using ListIterator.....");
		ListIterator listItr=ll.listIterator();
		while(listItr.hasNext())
		{
			System.out.print(listItr.next()+" ");
		}
		
		System.out.println();
		System.out.println("*******Reverse Traversal*******");
		while(listItr.hasPrevious())
		{
			System.out.print(listItr.previous()+" ");
		}
		System.out.println();
		System.out.println("******LinkedList Dequeue******");
		LinkedList lq=new LinkedList(ll);
		lq.add("Five");
		lq.add("Six");
		lq.add("Seven");
		lq.add("Eight");
		System.out.println(lq);
		lq.addFirst("First");
		System.out.println(lq);
		lq.addLast("Nine");
		System.out.println(lq);
		lq.removeFirst();
		System.out.println("It will Remove First...");
		System.out.println(lq);
		//System.out.println(lq.contains());
		System.out.println("*******LinkedList as a Stack*******");
		LinkedList ls=new LinkedList();
		ls.push("One");
		ls.push("Two");
		ls.push("Three");
		ls.push("Four");
		System.out.println(ls);
		ls.pop();
		ls.pop();
		System.out.println(ls);
		System.out.println("Peek Element is :"+ls.peek());
		System.out.println("Peek Last Element is :"+ls.peekLast());
		System.out.println("Peek Element is :"+ls.pollFirst());
		//System.out.println("Peek Element is :"+offerFirst(ls));
	}

}
