class AllIntegerLiterals{
	public static void main(String[] args){
		
		
		int i1 = 0;
		int i2 = 554;
		int i3 = 1000;
		int i4=0xffffffff;
		//int i5=0xfffffffff; //error: integer number too large
		
		System.out.println(i1 + "-" +i2+ "-" +i3+ "-" +i4  );
		
		//for byte
		byte b1=10;
		byte b2=010;
		byte b3 = 0x10;
		System.out.println(b1 + "-" +b2+ "-" +b3 );
		
		//for short
		short s1=10;
		short s2=010;
		short s3 = 0x10;
		//short s4 = 0xffff; //error: incompatible types: possible lossy conversion from int to short
		System.out.println(s1 + "-" +s2+ "-" +s3 );
		
		//for long
		long l1=10;
		long l2=010;
		long l3=0x10;
		long l4=0xffffffff;
		long l5=0xfffffffffl;
		System.out.println(l1 + "-" +l2+ "-" +l3+ "-" +l4+ "-" +l5   );
		
	}
}
/* Result:

C:\java\java1\Literals>java AllIntegerLiterals
0-554-1000--1
10-8-16
10-8-16
10-8-16--1-68719476735 */