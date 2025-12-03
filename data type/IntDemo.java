//size = 4 byte(32 bits)
//range -2^31 to 2^31-1(-2147483648 to 2147483647)

class IntDemo{
	public static void main(String [] args){

			int i1=10;
			int i2= 32767;
			//int i3 = 2147483648;// error: integer number too large
			
			byte b1 =50;
			int i4= b1; 
			
			//int s5= "Manoj"; // error: incompatible types: String cannot be converted to int
			
			//int s6 = 'z';
			//int s7 = false;// error: incompatible types: boolean cannot be converted to int
			
			//int [] intNumber= {10,20,-32765};//works
			//int [] intNumber= {10,20,-32765,32768}; /*error: incompatible types: possible lossy conversion from int to int
                                                        
			//for(int i=0; i<intNumber.length; i++){
				//System.out.println(intNumber[i]);
			//}
			
	}
}