//size = 8 byte(64 bits)
//range -2^63 to 2^63-1
// u need to add prefix as L or l at end to treat as long
class LongDemo{
	public static void main(String [] args){

			long l1=10;
			long l2= 2147483647; // internaly int value convert to long
			//long i3 = 2147483648;// error: integer number too large because in java all num treat as int firestly 
			long l3= 2147483648L;// u need to add prefix as L or l at end to treat as long
			
			System.out.println(l1);
			System.out.println(l2);
			System.out.println(l3);
	}
}

/*result:

C:\java\java1\data type>java LongDemo
10
2147483647
2147483648 */