/*long l1=561489864L;
	float f8= l1;
	System.out.println(" float f8: " +f8); // float f8: 5.6148986E8 ouput  Y ? */

class FloatTask {
	public static void main(String [] args){
		
		//float f1 = 1.5; //error: incompatible types: possible lossy conversion from double to float};
		float f2= 1.5f; // u need to add prefix as F or f at end to treat as float
		System.out.println("f2: " +f2);
		
		float f3 =10;
		System.out.println("f3: " +f3);
		
		float f4 = 'a'; // internally it convert using ascii
		System.out.println("f4: " +f4);
		
		byte b1 = 100;
		float f5= b1;
		System.out.println("f5: " +f5);
		
		short s1=5675;
		float f6= s1;
		System.out.println("f6: " +f6);
		
		float f7 = 100011L;
		System.out.println("f7: " +f7);
		
		long l1=561489864L;
		float f8= l1;
		System.out.println("float f8: " +f8); // float f8: 5.6148986E8  Y ?
		
		
		//float f9 = true;// error: incompatible types: boolean cannot be converted to float
		
		float f10=22/7f;
		System.out.println("Float f10 : " +f10);
		
		float f11=23/4f;
		System.out.println("Float f11: " +f11);
	}
}
/* Result:

C:\java\java1\Tasks\data types tasks>java FloatTask
f2: 1.5
f3: 10.0
f4: 97.0
f5: 100.0
f6: 5675.0
f7: 100011.0
float f8: 5.6148986E8
Float f10 : 3.142857
Float f11: 5.75   */