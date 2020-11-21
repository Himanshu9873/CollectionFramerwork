import java.util.Comparator;

public class AddressComp implements Comparator 
{

	@Override
	public int compare(Object arg0, Object arg1) {
		Employee3 str=(Employee3) arg0;
		Employee3 str1=(Employee3) arg1;
		return str.address.compareTo(str1.address);
			
	}

}
