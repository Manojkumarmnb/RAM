class ByteTask{
		public static void main(String [] args){
			byte b1=39;
			System.out.println("b1: " + b1 );
			
			byte b2=127;
			System.out.println("b2: " + b2 );
			
			//byte b3= 140;//compile error: incompatible types: possible lossy conversion from int to byte
			
			byte b4=-128;
			System.out.println("b4: " + b4 );
			
			//byte b5= -129;//compile error: incompatible types: possible lossy conversion from int to byte
			
			//byte b6 = "manoj";// compile error: incompatible types: String cannot be converted to byte
			
			byte b7 = 'p';
			System.out.println("b7: " + b7);// b7: 112 i,e it will give ASIC code VAlue
			
			//byte b8 = 12.1:// compile error: incompatible types: possible lossy conversion from double to byte
			
		
			byte b9 = '&';
			System.out.println("b9: " + b9);//  b9: 38 i,e it will give ASIC code VAlue
		
			/*byte b10= 128 - 1;
			byte b11= 1;
			byte  l10= b10+b11; //error: incompatible types: possible lossy conversion from int to byte
			System.out.println("l10: " +l10);*/
			
			//byte b10 =  null; //compile error: incompatible types: <null> cannot be converted to byte
			
		}
}
/*Result:-

C:\java\java1\Tasks\data types tasks>java ByteTask
b1: 39
b2: 127
b4: -128
b7: 112
b9: 38 */