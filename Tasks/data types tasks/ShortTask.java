class ShortTask{
	public static void main(String [] args){
		short s1=10;
		System.out.println("short s1: " +s1);
		
		short s2= 32763;
		System.out.println("short s2: " +s2);
		
		//short s3 = 32770;//compile error: incompatible types: possible lossy conversion from int to short
			
		byte b1 =30;
		short s4= b1; // assigning byte to short
		System.out.println("short s4: " +s4);
			
		//short s5= "Manoj"; // compile error: incompatible types: String cannot be converted to short
			
		short s6 = 'a';
		System.out.println("short s6: " +s6);
		
		//short s7 = false;// compile error: incompatible types: boolean cannot be converted to short
		//short s8 = null; // compile error: incompatible types: <null> cannot be converted to short
		
		//short s9 = True; //compile error: cannot find symbol
		
		//short [] shortNumber= {10,20,-32765,32768}; /*compile error: incompatible types: possible lossy conversion from int to short	
		short [] shortNumber= {10,20,-123,456,-32765};//works
		for(int i=0; i<shortNumber.length; i++){
			System.out.println(shortNumber[i]);
			}
	}
}
/*Result:-

C:\java\java1\Tasks\data types tasks>java ShortTask
short s1: 10
short s2: 32763
short s4: 30
short s6: 97
10
20
-123
456
-32765  */

                                                        