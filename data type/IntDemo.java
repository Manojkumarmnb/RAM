//size = 4 byte(32 bits)
//range -2^31 to 2^31-1(-2147483648 to 2147483647)

/*usage:
-most commonly used in mordern programming
	1.default data type for all integers
	2. offers a good balance between range and memory usage.
	3.efficiently handled by morden 32 bit and 64 bit processors. */

class IntDemo{
	public static void main(String [] args){

			int i1=10;
			int i2= 32767;
			//int i3 = 2147483648;// error: integer number too large
			
			byte b1 =50;
			int i4= b1; 
			
			System.out.println(i1);
			System.out.println(i4);
			//int s5= "Manoj"; //error: incompatible types: String cannot be converted to int
			
			int s6 = 'z';
			//int s7 = false;// error: incompatible types: boolean cannot be converted to int
			
			int [] intNumber= {10,20,-32765};//works
			//int [] intNumber= {10,20,-32765,2147483648} //error: incompatible types: possible lossy conversion from int to int};
                                                        
			for(int i=0; i<intNumber.length; i++){
				System.out.println(intNumber[i]);
			}
			
	}
}

/* result

C:\java\java1\data type>java IntDemo
10
50
10
20
-32765  */