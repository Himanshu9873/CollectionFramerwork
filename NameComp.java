import java.util.Comparator;

public class NameComp implements Comparator {
	@Override
	public int compare(Object arg0, Object arg1) {
		Employee2 str=(Employee2) arg0;
		Employee2 str1=(Employee2) arg1;
		return str.name.compareTo(str1.name);
	}
}
