/*in java7:

	1.binary literals:
		0 =0
		1 = 1
		2 = 10
		3 = 11
		4 = 100
		- add prifix as 0b or 0B 
		
	2.underscore:
		10_00_00_000
		
		*/
class Java7Enhancements{
	public static void main(String[] args){
		
		//binary
		int i1 = 0b10; //2
		int i2 = 0b111; //7
		
		System.out.println(i1+" - "+i2);
		
		//underscore
		int i3 = 1_00_00_000;
		//int i4 = _1_00_00_000; //error: cannot find symbol
		//int i4 = 1_00_00_000_; //error: illegal underscore
		
		double i4 = 1_00_00_000.00_50_3;
		//double i5 = 1_00_00_000_._00_50_3_; // error: illegal underscore
		
		System.out.println("i3: "+i3);
		System.out.println("i4: "+i4);
	}
}
/*Result:

C:\java\java1\Literals>java Java7Enhancements
2 - 7
i3: 10000000
i4: 1.000000000503E7  */