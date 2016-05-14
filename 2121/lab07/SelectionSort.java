import java.util.List;

public class SelectionSort {
	private List<Integer> list;
	
	public SelectionSort(List<Integer> list) {
		this.list = list;
	}
	
	public void sort(int startIndex) {
		if(startIndex == this.list.size() - 1) {
			System.out.println(list);
		}
		else {
			int lowestIndex = this.linearSearch(startIndex);
			this.swap(startIndex, lowestIndex);
			this.sort(startIndex + 1);
		}
	}
	
	public int linearSearch(int startIndex) {
		int lowestVar = this.list.get(startIndex);
		int lowestIndex = startIndex;
		for(int i = startIndex; i < list.size(); i++) {
			if(this.list.get(i) < lowestVar) {
				lowestVar = this.list.get(i);
				lowestIndex = i;
			}
		}
		return lowestIndex;
	}
	
	public void swap(int firstIndex, int secondIndex) {
		 int tempVar = firstIndex;
		 firstIndex = secondIndex;
		 secondIndex = firstIndex;
	}
}
