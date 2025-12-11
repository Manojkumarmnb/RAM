class StringLiterals{
	public static void main(String[] args){
		String name= "Manoj";
		//String name1= 'Manoj';//error: unclosed character literal
								//because it is in single quotes
		String name1= "M";
		
		System.out.println("name: "+name+" - "+name1);
		
		
	}
}
/*Result:

C:\java\java1\Literals>java StringLiterals
name: Manoj - M  */