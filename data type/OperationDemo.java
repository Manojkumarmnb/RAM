//operations for data types

class OperationDemo {
	public static void main(String[] args){
		byte b1  = 'A' + 1; 
		System.out.println(b1);
		
		//byte b2 = 'A' + 'B'; // CE: incompatible types: possible lossy conversion from int to byte
		// for byte 65 + 66 = 131 // if both add value is below 127 it will work
		
		short s1 = 'A' + 'B';
		System.out.println(s1);

		
		char c1 = 65; //'A'
		char c2 = 66; //'B';
		char c3 = 'A' + 10; // 65 + 10 = 75 ('K')
		System.out.println("c1: " + c1);
		System.out.println("c2: " + c2);
		System.out.println("c3: " + c3);

		//+ -> String Concatenation -> found right String
		//+ -> Arithmetic addition
		
		System.out.println("Manoj"+1+2+3); //Manoj123
		System.out.println(1+2+3+"Manoj"); //6Manoj
		
	}
}
/*Result:

C:\java\java1\data type>java OperationDemo
66
131
c1: A
c2: B
c3: K
Manoj123
6Manoj   */