package butilities;

import com.google.common.base.Optional;
import com.google.common.base.Strings;

public class GuavaOptional {

	public static void main(String args[]) {
		teste();
	}

	private static void teste() {
		Optional<Integer> optional = Optional.of(10);
		System.out.println(optional.isPresent()); //true
	}

}
