//Programa 5: Un número entero es primo si es divisible sólo por la unidad y por sí mismo. Elaborar un programa que reciba el valor en un método, 
//en otro método calcule si es primo o no y en el principal imprima si es primo o no.
import java.util.Scanner;
public class Programa5Primo
{ 
   static Scanner leer = new Scanner(System.in);
   public static void main(String args[])
   {
      int num=lectura();   
      boolean primo=false;
      primo=primo(num);  
      if(primo==true)
         System.out.println("El numero no es primo");
      else
         System.out.println("El numero es primo");
   }
   public static int lectura()
   {
      int num1=0;
      do
      {
         System.out.print("Ingresa un numero: ");
         num1 = leer.nextInt();
         return (num1);
      }while(num1<=0);
   }
   public static boolean primo(int num1)
   {
      boolean primo=false;
      for(int i=2; i<num1; i++)
      {
         if (num1 % i == 0)
         {
            primo = true;
         }
      }
      return (primo);
   }
 }