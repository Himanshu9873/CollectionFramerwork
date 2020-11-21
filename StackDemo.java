import java.util.Stack;
import java.util.Enumeration;
public class StackDemo {

	public static void main(String[] args) {
		Stack stack=new Stack();
		System.out.println(stack.capacity());
		stack.add(1);
		stack.add(2);
		stack.add(3);
		stack.add(4);
		stack.add(5);
		stack.add(6);
		stack.add(7);
		stack.add(8);
		stack.add(9);
		stack.add(10);
		stack.add(1);
		System.out.println(stack.capacity());
		//System.out.println(stack);
		System.out.println("Removing Element "+stack.remove(0));
		//System.out.println(stack);
		// fteching element one by one from the array by using Iterator , ListIterator ,Enumeration,
		//Lambda expression using forEach , for each loop , for loop and sop method also but i will use enumeartion
		
		Enumeration enumeration=stack.elements();
		while(enumeration.hasMoreElements())
		{
			Object object= (Object)enumeration.nextElement();
			System.out.print(object+" ");
		}
	}

}
