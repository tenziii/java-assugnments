import java.util.Scanner;
class even
{
	public static void main(String[] args)
	{
	 System.out.print("Enter the number :");
	 Scanner s=new Scanner(System.in);
	 int a=s.nextInt();
	for(int i=1;i<=a;i++)
	{
	if(i%2==0)
	{
		System.out.println(i);
	}
	}
	}
}