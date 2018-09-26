import java.util.Scanner;
class reverse
{
	public static void main(String[] args)
	{
		int r=0,m;
		System.out.print("Enter the number :");
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		while(n!=0)
		{
			m=n%10;
			r=r*10+m;
			n=n/10;
		}
		System.out.print(r);
	}
}