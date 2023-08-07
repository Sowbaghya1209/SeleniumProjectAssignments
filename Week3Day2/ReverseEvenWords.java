
public class ReverseEvenWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "I am a software tester"; 
		String[] arr=test.split(" ");
		String[] inner;
		String reverse="";
		for(int i=0;i<arr.length;i++)
		{
			if(!(i%2==0))
			{
				inner=arr[i].split("");
				for(int j=inner.length-1;j>=0;j--)
				{
					reverse=reverse+inner[j];
				}
			}
			else
			{
				reverse=reverse+" "+arr[i]+" ";
			}
		}
		System.out.println(reverse);

	}

}
