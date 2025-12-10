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
		
	}
}
/*Result:

C:\java\java1\Literals>java CharacterLiterals
A - 1 - 50

A - a - B - A    */