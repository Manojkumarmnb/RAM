//size = 8 byte(64 bits)
//range -2^63 to 2^63-1

class LongDemo{
	public static void main(String [] args){

			long i1=10;
			long i2= 2147483647;
			//long i3 = 2147483648;// error: integer number too large because in java all num treat as int firestly 
			long i3= 2147483648L;// u need to add prefix as L or l at end to treat as long
			
			
	}
}