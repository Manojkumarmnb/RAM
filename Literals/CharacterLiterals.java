class CharacterLiterals{
	public static void main(String[] args){
		
		//1. single charecter in single quotes
		
		char c1 = 'A';
		//char c2 = "A"; //error: incompatible types: String cannot be converted to char
		//char c2 = 'Aa'; //error: unclosed character literal
		//char c2 = "A";//error: incompatible types: String cannot be converted to char
		char c2 = '1';
		int add = c2+1; //50 = 1 in int is 49 = 49+1 = 50
		System.out.println(c1+ " - "+ c2+ " - "+ add);
		
		char c3 = ' ' ;
		System.out.println(c3);
		
		//2.using integers
		
		char i1 = 65; // A
		char i2 = 97;// a
		char i3 = 0102; // 66 in decimal = B
		char i4 = 65; // 85 in decimal = U
		System.out.println(i1+ " - "+ i2+ " - "+  i3+ " - "+ i4);
		
		//3. using unicode sequence sequence
		// syntax '\u0000' after u 4 digits
		
		char e1 = '\u000f';
		char e2 = '\u0065';
		System.out.println(e1+ " - "+ e2);
		
		//4. Escape sequence - defined by JAVA
		/* \n=new line   
				\t= tap  
				\r= carriage return
				\f= form feed
				\b= backspace
				\\= \
				\" = "
				\' = '      */
		
		char newLine= '\n';
		char tap= '\t';
		char carriage= '\r';
		char form= '\f';
		char backspace= '\b';
		char backslach= '\\';
		char doubleQuote= '\"';
		char singleQuote= '\'';
		System.out.println("newLine: "+ newLine+ "tap: "+tap+"carriage: "+carriage+"form: "+form+"backspace: "+backspace
		+"backslach: "+backslach+"doubleQuote: "+doubleQuote+"singleQuote: "+singleQuote);
		
		System.out.println("Manoj says,\"Don't be hessy\"");
		System.out.println("Manoj says,"+ '\"'+"Don't be hessy"+'\"');
		
		
	}
}
/*Result:

C:\java\java1\Literals>java CharacterLiterals
A - 1 - 50

A - a - B - A
☼ - e
newLine:
form: ♀backspace:backslach: \doubleQuote: "singleQuote: '
Manoj says,"Don't be hessy"
Manoj says,"Don't be hessy"   */