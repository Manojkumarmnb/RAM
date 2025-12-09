/*Literal: A literal is a fixed, constant value directly written in the code that can be assigned to a variable.
Types:
	1. Integer Literals
		- Number System/ Decimal System = 0-9
		- Octal System = 0-7, use prefix 0
		- Hexadecimal System = 0-9 a-f/A-F, use prefix 0x or 0X
	2. Floating-point Literals
	3. String Literals
	4. Character Literals
	5. Boolean Literals  */
	
	class LiteralsDemo {
	public static void main(String[] args){
		int x = 14; //Integer literals
		double y = 10.5; //Floating-point literals
		String institute = "Manoj"; // String literals
		char c = 'a'; // Character literals
		boolean isAttended = false; // Boolean literals
	
		System.out.println("int x: " + x);
		System.out.println("double y: " + y);
		System.out.println("string : " + institute);
		System.out.println("char c: " + c);
		System.out.println("boolean : " +isAttended);
		
	}
}
/* Result:

C:\java\java1\Literals>java LiteralsDemo
int x: 14
double y: 10.5
string : Manoj
char c: a
boolean : false  */