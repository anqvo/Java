import java.util.ArrayList;

/**
 *	This method takes in two lists and determines whether the second is a sublist of the first.
 *		i.e.: contains all the same elements in the same order, but not necessarily contigously
 *
 *	@require:	all lists != null;
 *	@ensure: return list != null;
 **/
public class DetermineList {
	
	public boolean subList(ArrayList<Integer> list1, ArrayList<Integer> list2) {
		boolean result = true;
		boolean match = false;
		int previousMatch = -1;
		
		for(int j = 0; j < list2.size(); j++) {
			match = false;
			for(int i = (previousMatch + 1); i < list1.size(); i++) {
				while(match == false) {
					if(list1.get(i) == list2.get(j)) {
						previousMatch = i;
						match = true;
					}
				}
			}
		}
		
		if(!match) {
			result = false;
		}
		
		return result;
	}	// end method subList()
	
}	// end class DetermineList
