public class Problem4 {
    public static void main(String [] args){
        // Write your code here
        Scanner sc =new Scanner(System.in);
	 int a= sc.nextInt();
	 String s = sc.next();
	 int i=a;
		 for(int k=0;k<a;k++) { 
			 if (i%2==0) {
				 System.out.print(s.charAt(i/2-1));	
	} 
	 else {
		 System.out.print(s.charAt(i/2));
		}
			 i--;
	 }
    }
}
