import java.util.ArrayList;

public class removeRange extends ArrayList{

	public static void main(String[] args) {
	
		removeRange ar = new removeRange();
		ar.add(11);
		ar.add(22);
		ar.add(33);
		ar.add(44);
		ar.add(55);
		
		ar.removeRange(1, 3);

		for(Object e:ar)
		{
			System.out.println(e);
		}
	}

}
