package week1.day1;

public class FindPrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=11;
		System.out.print("Enter the number");
		System.out.println(a);		
		boolean flag= true;
		for (int i = 2; i <= a/2; i++) {
			int n=a%i;
			if(n==0) {
				flag=false;
			}
		}
			if(flag) {
				
				System.out.println("Number is Prime");
			}
			else {
				System.out.println("Number is not prime");
			}
			
		}
	

}
