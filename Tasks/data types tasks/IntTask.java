class IntTask{
	public static void main(String [] args){

			int i1=100;
			System.out.println("i1: " +i1);
			
			int i2= 32767;
			System.out.println("i2: " +i2);
			
			//int i3 = 2147483648;// error: integer number too large
			
			byte b1 =100;
			int i4= b1; 
			System.out.println("i4: " +i4);
			
			//int i5= "Manoj"; //error: incompatible types: String cannot be converted to int
			
			int i6 = 'z';
			System.out.println("i6: " +i6);//  16: 122 i,e it will give ASIC code VAlue
			
			//int i7 = false;// error: incompatible types: boolean cannot be converted to int
			
			short s1=3642;
			int i8 = s1;
			System.out.println("i8: " +i8);
			
			//int i9 = *;//error: illegal start of expression
			
			int [] intNumber= {10,20,-70,-32765};//works
			for(int i=0; i<intNumber.length; i++){
				System.out.print(" intnum: " + intNumber[i]);
			}
			
	}
}
/*Result:

C:\java\java1\Tasks\data types tasks>java IntTask
i1: 100
i2: 32767
i4: 100
i6: 122
i8: 3642
 intnum: 10 intnum: 20 intnum: -70 intnum: -32765   */
