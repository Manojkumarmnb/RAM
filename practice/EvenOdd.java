
class EvenOdd {
    public static void main(String[] args) {
		int [] nu={0,1,2,3,4,10,23,15};
        
		
		for(int i =0; i<nu.length; i++)
        if(nu[i] % 2 == 0)
            System.out.println(nu[i]+" - "  +"Even Number");
        else
            System.out.println(nu[i]+" - "+"Odd Number");
    }
}
