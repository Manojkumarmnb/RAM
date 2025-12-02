//Sum of  Numbers
class sumofnum{
		public static void main(String[] args){
			int [] num = {0,1,2,31,2,23,4,5};
			int sum = 0;
			
			for(int i=0; i <= num.length; i++){
				sum =  num[i] + num [i+1];
				System.out.println(num[i] + "+" + num [i+1]+ " = " + "sum :  " + sum);
			}
		}
}	