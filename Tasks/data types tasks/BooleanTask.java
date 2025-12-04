class BooleanTask{
	public static void main(String [] args){
		boolean b1= true;
		System.out.println("b1: " +b1);
		
		boolean b2= false;
		System.out.println("b2: " +b2);
		
		//boolean b3 = 'A';//error: incompatible types: char cannot be converted to boolean
		
		//boolean b4 ="manoj"; // error: incompatible types: String cannot be converted to boolean
		
		//boolean b5= True; //error: cannot find symbol
		
		
		byte ba=10;
		//boolean b6 = ba;//error: incompatible types: byte cannot be converted to boolean
		
		
		//boolean b7 = 0;//error: incompatible types: int cannot be converted to boolean
		//boolean b8 = 1;//error: incompatible types: int cannot be converted to boolean
		
		
		int x =55;
		//if(x){ //error: incompatible types: int cannot be converted to boolean
		if(x == 15){
			System.out.println("hello");
		} else {
			System.out.println("hi");
		}
		
		int y =10;
		//while(y){//error: incompatible types: int cannot be converted to boolean
		while(y>0){
			System.out.println(y);
			y--;
		}
		
	}
}
/* Result:

C:\java\java1\Tasks\data types tasks>java BooleanTask
b1: true
b2: false
hi
10
9
8
7
6
5
4
3
2
1
*/