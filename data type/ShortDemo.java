//size = 2 byte(16 bits)
//range -2^15 to 2^15-1(-32768 to 32767)

/* Usage: we rarely use in mordern programing
why it is rare?
-originally used in 16 bit processors (like intel 8086) to save memory
-now,it replaced mostly by int (because mordern processors are 32 bits or 64 bits)
note:
-use short whenever required memory optimization is critical...*/

class ShortDemo{
	public static void main(String [] args){

			short s1=10;
			short s2= 32767;
			//short s3 = 32768;//error: incompatible types: possible lossy conversion from int to short
			
			byte b1 =50;
			short s4= b1; // Winending Conversion
			
			//short s5= "Manoj"; // error: incompatible types: String cannot be converted to short
			
			short s6 = 'z';
			//short s7 = false;// error: incompatible types: boolean cannot be converted to short
			
			short [] shortNumber= {10,20,-32765};//works
			//short [] shortNumber= {10,20,-32765,32768}; /*error: incompatible types: possible lossy conversion from int to short
                                                        
			for(int i=0; i<shortNumber.length; i++){
				System.out.println(shortNumber[i]);
			}
			
	}
}

/* Output 10 

C:\java\java1\data type>java ShortDemo
10
20
-32765  */