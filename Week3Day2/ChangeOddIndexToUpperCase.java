
public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "changeme";
		String name = "";
		char[] arr = test.toCharArray();

		for (int i = 0; i < arr.length; i++) {
			if (!(i % 2 == 0)) {
				// System.out.println(Character.toUpperCase(arr[i]));
				name = name + Character.toUpperCase(arr[i]);
			} else {
				name = name + arr[i];
			}

		}
		System.out.println("odd index to upper case: " + name);

	}

}
