
public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "Madam";
		char[] arr=name.toCharArray();
		String rev="";
		for(int i=arr.length-1;i>=0;i--)
		{
			rev=rev+arr[i];
		}
		if(name.equalsIgnoreCase(rev))
		{
			System.out.println("String is Palindrome");
		}
		else
		{
			System.out.println("String is not a Palindrome");
		}
		System.out.println(rev);
	}

}
