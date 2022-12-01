package newproject;

public class Driver {
	public static void main (String [] args ) {
		System.out.println("hello");
		MorseCodeTree tree = new MorseCodeTree();
		for (String each: tree.toArrayList()) {
			System.out.print(each );
		}
		
		
	}
}
