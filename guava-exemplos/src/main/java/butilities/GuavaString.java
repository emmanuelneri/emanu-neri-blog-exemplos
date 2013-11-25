package butilities;

import com.google.common.base.Strings;

public class GuavaString {

	public static void main(String args[]) {
		nullEmpty();
	}

	private static void nullEmpty() {
		String stringNull = null;
		String stringEmpty = "";

		System.out.println(Strings.isNullOrEmpty(stringNull));  //true
		System.out.println(Strings.isNullOrEmpty(stringEmpty));  // true

		System.out.println(Strings.nullToEmpty(stringNull));  // ""(vazio)
		System.out.println(Strings.emptyToNull(stringEmpty)); // null
	}
}
