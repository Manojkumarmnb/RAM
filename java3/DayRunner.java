class DayRunner{
	public static void main(String [] args){
		Day today = Day.THUR;
		
		System.out.println(today);
		
		Day[] days = Day.values();
		for (int i=0; i<days.length; i=i+2)
			System.out.println(days[i]);
	}
}