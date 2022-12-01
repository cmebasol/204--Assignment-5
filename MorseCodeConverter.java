package newproject;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MorseCodeConverter {
	private MorseCodeTree tree;
	/**
	 * constructs a morse code converter
	 */
	public MorseCodeConverter() {
		tree = new MorseCodeTree();
		
	}
	/**
	 * returns all the letters in the tree following in-order traversal 
	 * @return string that contains the letters with a space between each letter
	 */
	public static String  printTree() {
		//string to be returned
		MorseCodeTree  tree = new MorseCodeTree();

		String ret = new String();
		for (String each: tree.toArrayList()) {
			ret +=( each + " ");
		}
		return ret.substring(0, ret.length()-1);
	}
	/**
	 * converts code string to english
	 * @param code string that contains the morse code
	 * @return the string that contains the english translation of the morse code
	 */
	public static String convertToEnglish(String code) {
		if (code.equals(""))
			return "";
		else {
			MorseCodeTree  tree = new MorseCodeTree();
			String english = new String ();
		for (String each: code.split("/")) {
			for (String let: each.split(" ")) {
				english += tree.fetch(let);
			}
			english += " ";
		}
		
		return english.substring(0, english.length()-1);
			
		}

		
		
		
	}
	/**
	 * converts morse code to enlish
	 * @param codeFile file to read form
	 * @return english translation of the code
	 * @throws FileNotFoundException thrown if the file to be read can not be found
	 */
	public  static String convertToEnglish(File codeFile) throws FileNotFoundException {
		
		String ret = new String();
//		String temp = "";
		
		Scanner inputfile = new Scanner (codeFile);
//		while(inputfile.hasNext()) {
//			System.out.println(inputfile.nextLine));
//			temp =+ (inputfile.next());
//
//		}
//		inputfile.nextLine();
		while(inputfile.hasNextLine()) {
			ret += convertToEnglish(inputfile.nextLine());
			ret += " ";
		}
		inputfile.close();
		return ret.substring(0,ret.length() - 1);
		
	}

}
