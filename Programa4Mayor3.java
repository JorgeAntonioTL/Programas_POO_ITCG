//Programa 4: Calcular el mayor de tres n�meros en Java, utilizando un m�todo para leer los n�meros, otro m�todo para obtener y devolver el mayor.
import java.util.Scanner;
public class Programa4Mayor3
{ 
   static Scanner leer = new Scanner(System.in);
   public static void main(String args[])
   {
      lectura();      
   }
   public static void lectura()
   {
      System.out.print("Ingresa el primer numero: ");
      int num1 = leer.nextInt();
      System.out.print("Ingresa el primer numero: ");
      int num2 = leer.nextInt();
      System.out.print("Ingresa el primer numero: ");
      int num3 = leer.nextInt();
      
      mayor(num1, num2, num3);

   }
   public static void mayor(int num1, int num2, int num3)
   {
      if(num1>num2 && num1>num3)
         System.out.printf("El numero mayor es: %d", num1);
      else if(num2>num1 && num2>num3)
         System.out.printf("El numero mayor es: %d", num2);
      else
         System.out.printf("El numero mayor es: %d", num3);
   }
  }