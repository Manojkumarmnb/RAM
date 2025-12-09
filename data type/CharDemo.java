/* char = single 16bit unicode characters
	size: 2bytes/16bits
	range: 0 to 65537(\u0000 to \uFFFF)
	
	ASCIII system: symbols + engish numbers & alphabets
	Unicode system: symbols + all over world languages
	number(Base 10) system: 0-9
	octal(Base 8) system: 0-7
	Hexadecimal (Base 16) system: 0-9 A, B, C, D, E, F */
	
class CharDemo {
	public static void main(String[] args){
		char c1 = 1;
		char c2 = 65; //A // int is converting to char based on unicode system
		char c3 = 97; //a 
		
		System.out.println(c1 +" - " + c2 +" - " + c3  );
		
		char c4 = 'A';
		// char c5 = "A"; // compile error: incompatible types: String cannot be converted to char
		
		//char c6 = true; //  compile error: incompatible types: boolean cannot be converted to char
		
		byte b1 = 25; 
		//char c7 = b1; //compile error: incompatible types: possible lossy conversion from byte to char
		
		short s1 = 25;
		//char c8 = s1; // compile error: incompatible types: possible lossy conversion from short to char
		
		int i1 = 25;
		// char c9 = i1; // compile error: incompatible types: possible lossy conversion from short to char
		
		char c10 = 25;
		System.out.println(c10);
		
		char c11 = 2309;
		System.out.println(c11);// अ - a vowels in Devanagiri using decimal value
		
		char c12 = '\u0905';
		System.out.println(c12); // अ  - using unicode hex value
		
		
		char c13 = '\u0969';
		System.out.println(c13); // ३ - 3 in devanagiri
		
		char c14 = 3205;
		System.out.println(c14); // ಅ - vowel in Kannada

		//char c15 = null;
		//System.out.println(c15); // compile error: incompatible types: <null> cannot be converted to char
		// char c16 = 'null';
		
		
	}	
}

/* Result:

C:\java\java1\data type>java CharDemo.java
☺ - A - a
↓
?
?
?
? */