/* boolean:
	size : not precisely defined in JAVA(JVM dependent)
		- tipically/conceptually 1 bit
		- but stored as 1 byte or more
	range: can only be true or false , not defined.
	usage: to store logical values and control program flow in conditional statements and loops
	
	- JAVA enforces type safety 
*/

class BooleanDemo{
	public static void main(String [] args){
		boolean b1= true;
		boolean b2= false;
		
		System.out.println("boolean: " +b1);
		System.out.println("boolean: " +b2);
		
		//boolean b3 = 0;//error: incompatible types: int cannot be converted to boolean
		//boolean b4 = 1;//error: incompatible types: int cannot be converted to boolean
		
		//boolean b5 = 'a';//error: incompatible types: char cannot be converted to boolean
		
		//boolean b6 ="manoj"; // error: incompatible types: String cannot be converted to boolean
		
		//boolean b7= True; //error: cannot find symbol
		
		int x =10;
		//if(x){ //error: incompatible types: int cannot be converted to boolean
		if(x == 10){
			System.out.println("hello");
		} else {
			System.out.println("hi");
		}
		
		//while(x){//error: incompatible types: int cannot be converted to boolean
		while(x>0){
			System.out.println(x);
			x--;
		}
		
	}
}

/*result:

C:\java\java1\data type>java BooleanDemo
boolean: true
boolean: false
hello
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