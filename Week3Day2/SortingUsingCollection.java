import java.util.Arrays;
import java.util.Collections;

public class SortingUsingCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] arr= {"HCL","Wipro","Aspire Systems","CTS"};
		int length=arr.length;
		Collections.sort(Arrays.asList(arr));
		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.println(arr[i]);
		}
		

	}

}
