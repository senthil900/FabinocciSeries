package basictraining;

public class FabinocciSeries {
	public static void main(String[] args) {
	int a=0;
	int b=1;
	int count=10;
	count =count-2;
	System.out.print(a+ " "+b);
	for(int i=1;i<=count;i++) {
		int c=a+b;
		System.out.print(" "+c);
		a=b;
		b=c;
	}
	

}
	
	
}
