import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String company = "PayPal India";
		company = company.replace(" ", "");
		company = company.toLowerCase();

		char[] arr = company.toCharArray();
		Set<Character> set = new TreeSet<Character>();
		Set<Character> dupSet = new HashSet<Character>();
		for (int i = 0; i < arr.length; i++) {
			// set.add(arr[i]);
			if (set.contains(arr[i])) {

				dupSet.add(arr[i]);
			} else {
				set.add(arr[i]);
			}

		}

		System.out.println("Set " + set);
		System.out.println("Duplicate Set " + dupSet);

		for (Character dup : dupSet) {
			
			if (set.contains(dup)) {
				set.remove(dup);
			}
		}
		System.out.println("Set After removing duplicates " + set);
		

	}

}
