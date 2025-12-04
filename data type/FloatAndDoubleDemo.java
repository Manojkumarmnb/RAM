/*float :
	size = 4 bytes (32 bits)
	range = -3.4e38 to 3.4e38 (-3.4*10^38
	accuracy= 5-6 decimal places
	precision= single precision
	how to repesent = use prefix f/F 
	
	*/	
/*double:
	size = 4 bytes (32 bits)
	range = -1.7e308 to 1.7e308 
	accuracy= 10 - 15 decimal places
	precision= double precision
	how to repesent = use prefix d/
	how to repesent = use prefix d/
	
	*/
class FloatAndDoubleDemo {
	public static void main(String [] args){
		double d1 = 10.5;
		//float f1 = 10.5; ////error: incompatible types: possible lossy conversion from double to float};
		float f= 10.5f; // u need to add prefix as F or f at end to treat as float
		
		float f2 =10;
		float f3 = 'A'; // internally it convert using ascii
		
		byte b1 = 10;
		float f4= b1;
		
		short s1=1000;
		float f5= s1;
		
		float f6=1000L;
		//float f7 = true;// error: incompatible types: boolean cannot be converted to float
		
		float f8=22/7f;
		System.out.println("Float: " +f8);
		
		double d2=10; //int
		double d3= 'A'; // char
		double d4 = b1; // byte
		double d5 = s1; // short
		double d6 = 10.5f; //float
		//double d7 = false ;// error: incompatible types: boolean cannot be converted to double
		
		double d8 =22/7d;
		System.out.println("double: " +d8);
			
		
	}
}

/*result:

C:\java\java1\data type>java FloatAndDoubleDemo
Float: 3.142857
double: 3.142857142857143  */