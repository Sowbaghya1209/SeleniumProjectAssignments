import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatesWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "We learn java basics as part of java sessions in java week1";
		String[] arr = text.split(" ");
		Set<String> set = new LinkedHashSet<String>();
		for (int i = 0; i < arr.length; i++) {
			set.add(arr[i]);
		}
		String dupText = "";
		for (String dup : set) {
			dupText = dupText.concat(dup + " ");
		}
		System.out.println("After removing Duplicates   :" + dupText);
		

	}

}
