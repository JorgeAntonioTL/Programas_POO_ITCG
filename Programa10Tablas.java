/*Programa 10: Elaborar un programa que calcule la tabla de multiplicar de un número entero N, solicitar N y el rango que se desea obtener, 
realizar el cálculo de la multiplicación y las impresiones en diferentes métodos.*/
import java.util.Scanner;
public class Programa10Tablas
{ 
   static Scanner leer = new Scanner(System.in);
   public static void main(String args[])
   {
      int num=lectura1();
      int rangoi = lectura2(); 
      int rangof = lectura3();
      int res[]=new int[rangof-rangoi+1];  
      resultados(res, num, rangoi, rangof);  
      int cont=0;
      for(int i=rangoi; i<=rangof; i++)
      {
         System.out.printf("%d X %d = %d\n", num, i, res[cont]);
         cont++;
      }
   }
   public static int lectura1()
   {
      int num1=0;
      System.out.print("Ingresa el numero de la tabla de multiplicar que deseas conocer: ");
      num1 = leer.nextInt();
      return num1;
   }
   public static int lectura2()
   {
      int rangoi=0;
      System.out.print("Ingresa el rango inicial de los numeros que quieres visualizar: ");
      rangoi=leer.nextInt();
      return rangoi;
   }
   public static int lectura3()
   {
      int rangof=0;
      System.out.print("Ingresa el rango final de los numeros que quieres visualizar: ");
      rangof=leer.nextInt();
      return rangof;
   }
   public static void resultados(int res[], int num, int rangoi, int rangof)
   {
      int cont=0;
      for(int i=rangoi; i<=rangof; i++)
      {
         res[cont]=i*num;
         cont++;
      }
   }
 }