class ByteDemo{
		public static void main(String [] args){
			byte b1=1;
			byte b2=127;
			
			//byte b3= 128;//compile error: incompatible types: possible lossy conversion from int to byte
			byte b4=-128;
			
			//byte b5= -129;//compile error: incompatible types: possible lossy conversion from int to byte
			
			//byte b6 = 10.5:// compile error: incompatible types: possible lossy conversion from double to byte
			
			//byte b7 = "manoj";// compile error: incompatible types: String cannot be converted to byte
			System.out.println("b1: " + b1 + " b2: " +b2 + " b4: " + b4 );
			
			byte b8 = 'A';
			System.out.println("b8: " + b8);// b8: 65 i,e it will give ASIC code VAlue
			
			byte b9 = 'a';
			System.out.println("b8: " + b9);//  b9: 97 i,e it will give ASIC code VAlue
			
			byte b10 = '*';
			byte a1 = '9';
			System.out.println("b10: " + b10 + " a1: " +a1 );//b10: 42 a1: 57 i,e it will give ASIC code VAlue
			
			//byte bd =  null; //compile error: incompatible types: <null> cannot be converted to byte
			
			byte [] bytenum = {10,20,30};//works
			//byte [] bytenum = {10,20,30,150};//compile error: incompatible types: possible lossy conversion from int to byte
			System.out.println(bytenum[2]);
			for(int i=0; i< bytenum.length; i++){
			System.out.println(bytenum[i]  );
			}
			
		}
}