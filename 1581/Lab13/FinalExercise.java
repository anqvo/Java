public class FinalExercise {
	public static void main(String[] args) {
		String text = "This is a test String.";
		System.out.println(text);
		String biggerString = FinalExercise.stringModifier(text);
		System.out.println(biggerString);
		
		StringBuilder builder = new StringBuilder(text);
		System.out.println(text);
		StringBuilder mod = FinalExercise.stringModifier(builder);
		System.out.println(mod);
	}
	
	public static String stringModifier(String text) {
		String modification = text.concat(" that has been modified.");
		return modification;
	}
	
	public static StringBuilder stringModifier(StringBuilder builder) {
		return builder.append(" that has been modified");
	}
}
