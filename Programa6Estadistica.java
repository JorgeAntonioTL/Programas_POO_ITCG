//Programa 6: Elaborar un programa que calcule la media, varianza y desviación estándar, usando variables locales en los métodos.
//Además utilice un método para leer números y métodos que regresen valor para calcular el valor de cada medida.
import java.util.Scanner;
public class Programa6Estadistica
{ 
   static Scanner leer = new Scanner(System.in);
   public static void main(String args[])
   {
      lectura();      
   }
   public static void lectura()
   {
      System.out.print("Ingresa la cantidad de numeros que ingresaras: ");
      int cant = leer.nextInt();
      float num[]=  new float[cant];
      float med=0; 
      double desvia=0, varian=0;
      for(int i=0; i<cant; i++)
      {
         System.out.print("Ingresa un numero: ");
         num[i] = leer.nextFloat();
      }
      med=media(num, cant);
      System.out.printf("La media es: %.2f\n", med);
      desvia=desviacion(med, num, cant);
      System.out.printf("La Desviacion estandar es: %.2f\n", desvia);
      varian=varianza(desvia);
      System.out.printf("La Varianza es: %.2f\n", varian);

      
      
   }
   public static float media(float num[], int cant)
   {
      float medi=0, suma=0;
      for(int i=0; i<=num.length-1; i++)
      {
         suma+=num[i];
      }
      medi=suma/cant;
      return (medi);
   }
   public static double desviacion(float media, float num[], int cant)
   {
      double desv=0, suma=0;
      for(int i=0; i<=num.length-1; i++)
      {
         suma+=Math.pow(num[i]-media, 2);
      }
      suma=suma/cant;
      desv = Math.sqrt(suma);
      return (desv);
   }
   public static double varianza(double desvia)
   {
      double vari=0;
      vari = Math.pow(desvia, 2);
      return (vari);
   }
 } 