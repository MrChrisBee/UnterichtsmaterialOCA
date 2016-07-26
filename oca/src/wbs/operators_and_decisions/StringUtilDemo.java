package wbs.operators_and_decisions;

public class StringUtilDemo {

	public static void main(String[] args) {
		System.out.println("Wir testen Palindrome");
		System.out.println("ist Palindrome eins? " + StringUtil.isPalindrom("Palindrome", true));
		System.out.println("Case Sensitiv = Off; Ist Otto eins? " + StringUtil.isPalindrom("Otto", true));
		System.out.println("Case Sensitiv = On; Ist Otto eins? " + StringUtil.isPalindrom("Otto", false));
		System.out.println("*****************************************************************************");
		StringUtil.isSatzPalindrom("Gewebe weg!");
		StringUtil.isSatzPalindrom("Grasmitte, da kniet ein Kadett im Sarg");
		StringUtil.isSatzPalindrom("Grasmitte, da kriet ein Kadett im Sarg");
		StringUtil.isSatzPalindrom("Nie, Knabe, nie grub Nero neben Orenburg eine Bank ein!");
		StringUtil.isSatzPalindrom("123456789A");
	}
}
