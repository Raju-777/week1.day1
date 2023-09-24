package week1.day1;

public class FibonacciSeries {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0;
		int b=1;
		int n=10;
		System.out.println(a);
		for(int i=1; i<n;i++) {
			int sum=a+b;
			a=b;
			b=sum;
		System.out.println(sum);

	}
}
}
