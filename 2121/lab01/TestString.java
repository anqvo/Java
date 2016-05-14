import static org.junit.Assert.*;
import org.junit.Test;
// import junit.framework.TestCase;

public class TestString {
	private String letters;
	private String numbers;
	private String empty;
	private String simpleSentence;
	private String complexSentence;
	
	public void setUp() {
		this.letters = new String("abc");
		this.numbers = new String("123");
		this.empty = new String("");
		this.simpleSentence = new String("This is a sentence.\n");
		this.complexSentence = new String("%Punctuation!, Can cr\te8 <problems.$");
	}
	
	@Test
	public void testLength() {
		assertTrue(letters.length() == 3);
		assertEquals(numbers.length(), 3);
		assertEquals(empty.length(), 0);
		assertEquals(simpleSentence.length(), 20);
		assertTrue(complexSentence.length() == 36);
	}
	
	@Test
	public void testEquals() {
		assertTrue(letters.equals("abc"));
		assertTrue(numbers.equals("123"));
		assertTrue(empty.equals(""));
		assertTrue(simpleSentence.equals("This is a sentence.\n"));
		assertTrue(complexSentence.equals("%Punctuation!, Can cr\te8 <problems.$"));
	}
	
	@Test
	public void testToLowerCase() {
		assertTrue(letters.toLowerCase().equals("abc"));
		assertTrue(numbers.toLowerCase().equals("123"));
		assertTrue(empty.toLowerCase().equals(""));
		assertTrue(simpleSentence.toLowerCase().equals("this is a sentence.\n"));
		assertTrue(complexSentence.toLowerCase().equals("%punctuation!, can cr\te8 <problems.$"));
	}
}

