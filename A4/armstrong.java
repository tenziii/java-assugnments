import java.util.Scanner;
class armstrong
{
   public static void main(String args[])
   {
      int n, sum = 0, temp, r, d= 0;
 
      Scanner s = new Scanner(System.in);
      System.out.println("Enter the number :");      
      n = s.nextInt();
 temp = n;
  while (temp != 0) {
         r = temp%10;
         sum = sum + r*r*r;
         temp = temp/10;
      }
 
      if (n == sum)
         System.out.println(n + "Armstrong");
      else
         System.out.println(n + " Not Armstrong");         
   }
   }
