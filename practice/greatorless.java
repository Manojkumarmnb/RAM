class greatorless {
    public static void main(String[] args) {
		int [] num={0,1,2,3,4,10,23,23,15};
        
		
		for(int i =0; i<num.length-1; i++){
        if(num[i] > num [i+1])
            System.out.println(num[i]+" is "  +"greater than " + num[i+1]);
        else if(num[i] < num [i+1])
            System.out.println(num[i]+" is "  +"less than " + num[i+1]);
		else
			 System.out.println(num[i]+" is "  +"equal to  " + num[i+1]);
		}
    }
}