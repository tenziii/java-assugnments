import java.util.Scanner;
class sort
{
	public static void main(String[] args)
	{
		int[] array={1,1,1,1,0,0,1,0};
		int temp;
		for(int i=0;i<array.length;i++)
		{
		for(int j=0;j<array.length-i-1;j++)
		{
			
		
				if(array[j]>array[j+1])
				{
					temp=array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
				}
			}
			}
		for(int i=0;i<array.length;i++)
		{
			System.out.print(array[i]);
		}
	}
}