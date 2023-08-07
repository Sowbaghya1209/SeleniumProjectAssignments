import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class MissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] data = { 1,2,10,3,4,5,6,8,9,10,2,4,6}; 
		Set<Integer> set = new TreeSet<Integer>();
		for (int i = 0; i < data.length; i++) {
			set.add(data[i]);
			
		}
		System.out.println("Ordered Set " + set);
		int j=1;
		List<Integer> list = new ArrayList<Integer>(set);
		while(j<=10)
		{
			if(!list.contains(j))
			{
				System.out.println("Missing Number: "+j);
			}
			j++;
		}
		
	}

}
