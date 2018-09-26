import java.util.Scanner;
class array
{
	public static void main(String[] args)
	{
	int[] my_array = new int[10];
	for(int i=0;i<10;i++)
	{
		my_array[i]=i+1;
	System.out.println(my_array[i]);
	}
	int  j,flag=0;
	Scanner A=new Scanner(System.in);
	System.out.print("Enter the number you want to search:");
	int n=A.nextInt();
	int k;
	for(k=1;k<my_array.length;k++)
	{
		if(my_array[k]==n)
		{
			flag=1;
			break;
		}
	}
	if(flag==1)
	{
		System.out.print("No. found at :"+k);
	}
	else
	{
		System.out.print("No. not found");
	}
	}
}