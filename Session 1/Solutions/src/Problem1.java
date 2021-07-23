public class Problem1 {
    public static void main(String [] args){
        // Write your code here
        Scanner input =new Scanner(System.in);
		int a= input.nextInt();
		int b= input.nextInt();
		int year=0;
		while(a<=b) {
	     a = a*3;
	     b = b*2;
	    year++;		 
		}
		System.out.print(year);
    }
}
