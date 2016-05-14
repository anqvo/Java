public class DynamicArray {
	private String[] dynamicArray;
	private int arrayCount;

	public DynamicArray() {
		this.dynamicArray = new String[10];
		this.arrayCount = 0;
	}

	public DynamicArray(int length) {
		this.dynamicArray = new String[length];
		this.arrayCount = 0;
	}

	public DynamicArray(String[] existingArray) {
		for(i = 0; i < existingArray.length - 1; i++) {
			this.dynamicArray[i] = existingArray[i];
		}
		this.arraycount = existingArray.length -1;
	}
	
	public void add(String element) {
		if(arrayCount < dynamicArray.length - 1) {
			dynamicArray[arrayCount] = element;
			arrayCount++;
		}
		else if(arrayCount == dynamicArray.length -1) {
			String[] biggerArray = this.expandArray();
			for(int i = 0; i < dynamicArray.length; i++) {
				biggerArray[i] = dynamicArray[i];
			}
			biggerArray[arrayCount] = element;
			arrayCount++;
		}			
	}
	
	public void add(String element, int destinationIndex) {
		if(destinationIndex > dynamicArray.length - 1) {
			System.out.println("The index is out of bounds.");
		else if(arrayCount < dynamicArray.length - 1) {
			dynamicArray[destinationIndex] = element;
			arrayCount++;
		}
		else if(arrayCount == dynamicArray.length - 1) {
			String[] biggerArray = this.expandArray();
			for(int i = 0; i < dynamicArray.length; i++) {
				biggerArray[i] = dynamicArray[i];
			}
			biggerArray[destinationIndex] = element;
			arrayCount++;
		}
	}
	
	private String[] expandArray() {
		int newSize = dynamicArray.length * 2;
		String[] biggerArray = new String[newSize];
		return biggerArray;
	}
	
	public void remove(int index) {
		for(int i = 0; i < dynamicArray.length; i++) {
			if(i > index) {
				dynamicArray[i] = dynamicArray[i - 1];
			}
		}
		arrayCount++;
	}
	
	public boolean isEmpty() {
		boolean answer = false;
		if(this.arrayCount == 0) {
			answer = true;
		}
		return answer;
	}
	
	public String get(int index) {
		String answer = "";
		answer = dynamicArray[index];
		return answer;
	}
	
	public int sizeOf() {
		return this.arrayCount;
	}
}
