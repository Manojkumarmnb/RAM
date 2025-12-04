class DoubleTask {
	public static void main(String [] args){
		double d1 = 10.5;
		System.out.println("d1: " +d1);
		
		double d2=100;
		System.out.println("d2: " +d2);
		
		double d3= 'A'; 
		System.out.println("d3: " +d3);
		
		//double d4 = false ;// error: incompatible types: boolean cannot be converted to double
		
		byte b1=126;
		double d5 = b1; 
		System.out.println("d5: " +d5);
		
		//double d6 = null;// error: incompatible types: <null> cannot be converted to double
		
		short s1 = 5675;
		double d7 = s1;
		System.out.println("d7: " +d7);		
		
		double d8 = 10.5f; 
		System.out.println("d8: " +d8);
		
		
		double d9 =22/7d;
		System.out.println("double d9: " +d9);
		
		long l1=561489864L;
		double d10= l1;
		System.out.println("float d10: " +l1);	
	}
}
/* Result:

C:\java\java1\Tasks\data types tasks>java DoubleTask
d1: 10.5
d2: 100.0
d3: 65.0
d5: 126.0
d7: 5675.0
d8: 10.5
double d9: 3.142857142857143
float d10: 561489864   */