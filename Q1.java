import java.util.*;
class Q1
{
 public static void main(String args[])
 {
  float n;
  Scanner src=new Scanner (System.in);
  System.out.println("Enter the value n");
  n=src.nextInt();
  float sum=1f;
  for(float i=2f;i<=n;i++)
  {
   if(i%2==0)
    {
     sum=sum-(1/i);
    }
    else 
     sum=sum+(1/i);
  }
  System.out.println("The sum is "+sum);
 }
}
