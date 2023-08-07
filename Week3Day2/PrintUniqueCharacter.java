import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class PrintUniqueCharacter {

	public static void main(String[] args) {
		String name = "Sowwbaghya";

		String[] arr = name.split("");
		Set<String> set = new LinkedHashSet<String>();
		
		for(int i=0;i<arr.length;i++)
		{
			//set.add(arr[i]);
			if (set.contains(arr[i])) {
				set.remove(arr[i]);
				
			}
			else
			{
			set.add(arr[i]);
			}
			
		}

		System.out.println(set);
	}
}
