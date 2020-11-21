import java.util.*;
public class LinkedHashSetDemo {

	public static void main(String[] args) {
		Set set=new LinkedHashSet();
		set.add(12);
		set.add(113);
		set.add(14);
		set.add(10);
		set.add(19);
		System.out.println(set);
		
	}

}
// same but indexing preserved
/* for sorting we used 
 * 1. Comperable interface
 * 2. compareTo(Object o)
 * 3. Collections.sort()
 * 4.arrays.sort;*/
