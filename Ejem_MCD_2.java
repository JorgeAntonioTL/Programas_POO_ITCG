import java.util.*;
public class Ejem_MCD_2
{
   //static int num1=0, num2=0;
   public static void main(String args[])
   {
      int mcd, nu1, nu2;
      Scanner leer = new Scanner(System.in);
      do
      {
         System.out.println("Dame el primer numero");
         nu1 = leer.nextInt();   
      }while(nu1<=0);
      do
      {
         System.out.println("Dame el primer numero");
         nu2 = leer.nextInt();   
      }while(nu2<=0);
      System.out.printf("El maximo comun divisor de %d y %d es: %d", nu1, nu2, mcd(nu1, nu2));

   }
   /*public static void capturar()
   {
      Scanner leer = new Scanner(System.in);
      do
      {
         System.out.println("Dame el primer numero");
         num1 = leer.nextInt();   
      }while(num1<=0);
       do
      {
         System.out.println("Dame el primer numero");
         num2 = leer.nextInt();   
      }while(num2<=0);

   }*/
   public static int mcd(int n1, int n2)
   {
      int max=0, min=0, num1=n1, num2=n2;
      if(num1<num2)
         min = num1;
      else
         min=num2;
      for(int i = min; i>=1; i--)
         if(num1%i==0 && num2%i==0)
         {
            max=i;
            break;
         }
         return max;
   }
}