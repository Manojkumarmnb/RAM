class IntegerLiterals{
	public static void main(String[] args){
		
		System.out.println("1. Using Number/Decimal System: 0-9");
		int n1 = 0;
		int n2 = 5;
		int n3 = 10;
		
		System.out.println(n1 + "-" +n2+ "-" +n3 );
		
		System.out.println("2. Using Octal System: 0-7");
		int o1 = 00;
		int o2 = 011;
		//int o3 = 09; //CE: prefix 0 is only for ocatl numbers(0-7), here 9 is not allowed for octal
		int o4 = 020;
		int o5 = 030;
		int o6 = 0100;
		
		System.out.println(o1); //0
		System.out.println(o2); //9
		System.out.println(o4); //16
		System.out.println(o5); //24
		System.out.println(o6); //64
		
		System.out.println("3. Using Hexadecimal System: 0-9, A-F/a-f");
		//use prefix as 0x.
		
		int x1 = 0x0;
		int x2 = 0X10; //16
		int x3 = 0xface;
		int x4 = 0xffff;
		//int x5 = 0xrahul; //CE: hexadecimal numbers must contain at least one hexadecimal digit
		//int x5 = 0x1rahul; //CE: ';' expected
		int x6 = 0xffffffff; 
		//int x7 = 0xfffffffff; // CE: integer number too large 
		// int x8 = 0xBEER; //CE: ';' expected, R is not allowed in hexadecimal
		int x9 = 0xBeef;
		//int x10 = 0xaabbccddeeff; //CE:  integer number too large
		System.out.println(x1); //0
		System.out.println(x2); //16
		System.out.println(x3); //64206
		System.out.println(x4); //65535
		System.out.println(x6); //-1 becuase 32bits and two's compliment(Invert bits then Add 1)
		System.out.println(x9); //48879
	}
}

/* Result:

C:\java\java1\Literals>java IntegerLiterals
1. Using Number/Decimal System: 0-9
0-5-10
2. Using Octal System: 0-7
0
9
16
24
64
3. Using Hexadecimal System: 0-9, A-F/a-f
0
16
64206
65535
-1
48879    */