import java.util.*;
public class Ejem_MCD
{
   static int num1=0, num2=0;
   public static void main(String args[])
   {
      //int mcd;
      capturar();
      //mcd=mcd();
      //System.out.printf("El maximo comun divisor de %d y %d es: %d", num1, num2, mcd);
      System.out.printf("El maximo comun divisor de %d y %d es: %d", num1, num2, mcd());

   }
   public static void capturar()
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

   }
   public static int mcd()
   {
      int max=0, min=0;
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