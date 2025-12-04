class LongTask{
	public static void main(String [] args){
			long l1=10;
			System.out.println("l1: " + l1);
			
			long l2= 2147483647; // internaly int value convert to long
			System.out.println("l2: " + l2);
			
			//long l3 = 56147483648;// error: integer number too large because in java all num treat as int firestly 
			
			long l4= 56147483648L;// u need to add prefix as L or l at end to treat as long
			System.out.println("l4: " + l4);
			
			long l5 = 'z';
			System.out.println("l5: " +l5);//  16: 122 i,e it will give ASIC code VAlue
			
			//long l6 = false;// error: incompatible types: boolean cannot be converted to long
			
			short s1=3642;
			long l7 = s1;
			System.out.println("l7: " +l7);
			
			//byte b1=128;// error: incompatible types: possible lossy conversion from int to byte
			byte b2= 100;
			long l8 = b2;
			System.out.println("l8: " +l8);
			
			//long l9= "Manoj"; //error: incompatible types: String cannot be converted to long
			
			
			//byte b3=127 + 1; //error: incompatible types: possible lossy conversion from int to byte
			byte b3= 128 - 1;
			byte b4= 1;
			long l10= b3+b4;
			System.out.println("l10: " +l10);
	}
}
/* Result:-

C:\java\java1\Tasks\data types tasks>java LongTask
l1: 10
l2: 2147483647
l4: 56147483648
l5: 122
l7: 3642
l8: 100
l10: 128 */