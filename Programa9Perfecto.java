/*Programa 9: Un número es perfecto si “la suma de sus divisores excepto el mismo es igual al propio número”. 
Realice un programa que solicite un número N y diga si es perfecto o no. 
Ejemplo: 6, sus divisores son: 3, 2, 1; si sumamos 1 + 2 + 3 = 6, entonces es un número perfecto. 
Utilizar un método para indicar si es perfecto o no, recibiendo el número a evaluar.*/

import java.util.Scanner;
public class Programa9Perfecto
{ 
   static Scanner leer = new Scanner(System.in);
   public static void main(String args[])
   {
      int num=lectura();   
      boolean perfecto=false;
      perfecto=perfecto(num);  
      if(perfecto==true)
         System.out.println("El numero es perfecto");
      else
         System.out.println("El numero no es perfecto");
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
   public static boolean perfecto(int num1)
   {
      boolean perfecto=false;
      int suma=0;
      for(int i=num1-1; i>0; i--)
      {
         if (num1 % i == 0)
         {
            suma+=i;
         }
      }
      if(suma==num1)
      perfecto=true;
      return (perfecto);
   }
 }