public class Problem3 {
    public static void main(String [] args){
        // Write your code here
        Scanner sc =new Scanner(System.in);
		int q= sc.nextInt();
		for(int i=0;i<q;i++) {
		int a= sc.nextInt();
		int b= sc.nextInt();
		int n= sc.nextInt();
	        int sum = a;
			for(int k=0;k<=n-1;k++) {
				sum = sum +(pow(2,k)*b);
				System.out.print(sum+" ");
			}	
			System.out.printf("%n"); 
		}
		}

	private static int pow(int i, int k) {

		return (int) Math.pow(i, k);
	}
}
