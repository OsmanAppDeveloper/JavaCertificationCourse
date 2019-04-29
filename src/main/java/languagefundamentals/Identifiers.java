package languagefundamentals;

public class Identifiers {

	// What is a Identifier in Java :- Any name which is used to identify a
	// datatype, method name, class name etc is called Identifier in Java.
	// Rules for Defining/Declaring Identifiers are
	// 1) a to z , A to Z , 0 to 9 , $ and underscore, if we use any other
	// characters apart from these we get compile time error.
	// 2) They cannot start with digits like 123IdentifierName,
	// 3) They are case sensitive since java language itself is treated as case
	// sensitive language.
	// 4) They don't have any max count character limitiation while declare/Defining
	// them.
	// 5) We cannot use reserved words as Identifiers.
	// 6) All predefined java class names and Interface names can be used as
	// Identifiers.Even though it is valid but it not a good programming practice
	// because it reduces readability and creates confusion.

	public void rule1() {
		int atoz = 10;
		long ATOZ = 10L;
		float $ = 10.5f;
		char _ = 'A';
		System.out.println(atoz);
		System.out.println(ATOZ);
		System.out.println($);
		System.out.println(_);
	}
	
	/*public void rule2() {
		int 123atoz = 10;
		long 123ATOZ = 10L;
		float 123$ = 10.5f;
		char 123_ = 'A';
		System.out.println(123atoz);
		System.out.println(123ATOZ);
		System.out.println(123$);
		System.out.println(123_);
	}
	*/
	public void rule3() {
		int number = 10;
		int Number = 11;
		System.out.println(number);
		System.out.println(Number);
	}
	
	public void rule4() {
		int aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaatozzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz = 10;
		long ATOZzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz = 10L;
		float $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ = 10.5f;
		char __________________________________________________________________________________________________________________________________ = 'A';
		System.out.println(aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaatozzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz);
		System.out.println(ATOZzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz);
		System.out.println($$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$);
		System.out.println(__________________________________________________________________________________________________________________________________);
	}
	
	/*public void rule5() {
		int if = 10;
		long else = 11L;
		double for = 10f;
	}
	*/
	
	public void rule6() {
		int String = 10;
		long Runnable = 10L;
		float Integer = 10.5f;
		System.out.println(String);
		System.out.println(Runnable);
		System.out.println(Integer);
	}
	
	
	public static void main(String[] args) {
		Identifiers rules = new Identifiers();
		rules.rule1();
		rules.rule3();
		rules.rule4();
		rules.rule6();
		
	}

}
