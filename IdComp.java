import java.util.Comparator;

public class IdComp implements Comparator {

	@Override
	public int compare(Object arg0, Object arg1) {
		Employee3 id1=(Employee3)arg0;
		Employee3 id2=(Employee3)arg1;
		if(id1.id>id2.id)
		{
			return 1;
		}
		else if(id1.id<id2.id)
		{
			return -1;
		}
		else
		{
			return 0;
		}
	}

}
