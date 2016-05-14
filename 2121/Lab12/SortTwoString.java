import java.util.ArrayList;
import java.lang.StringBuilder;


/**
 *	This method takes a String as input, and returns an ArrayList<StringBuilder>
 *		containing at most two StringBuilder(s):
 *			1. composed of solely the numeric characters of input
 *			2. composed of solely of the non-numeric characters of input
 *
 *	@require:	input != null;
 *	@ensure:		ArrayList<StringBuilder> != isEmpty();
 **/
public class SortTwoString {
	
	public static ArrayList<String> stringSort(String input) {
		ArrayList<String> list = new ArrayList<String>();
		StringBuilder numberString = new StringBuilder();
		StringBuilder otherString = new StringBuilder();
		
		int inputLength = input.length();
		
		for(int i = 0; i < inputLength; i++) {
			char c = input.charAt(i);
			if(Character.isDigit(c)) {
				numberString.append(c);
			}
			else {
				otherString.append(c);
			}
		}
		list.add(numberString.toString());
		list.add(otherString.toString());
		
		return list;
		
	}	// end method stringSort()
	
}	// end class SortTwoString
