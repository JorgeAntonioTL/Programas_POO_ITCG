import java.util.Scanner;
public class Programa1Calculadora
{ 
   static Scanner leer = new Scanner(System.in);
   public static void main(String args[])
   {
      menu();      
   }
   public static void menu()
   {
      int opc=0, num1=0, num2=0;
      do
      {
         System.out.println("\nCALCULADORA");
         System.out.println("[1] Sumar");
         System.out.println("[2] Restar");
         System.out.println("[3] Multiplicar");
         System.out.println("[4] Dividir");
         System.out.println("[5] SALIR");
         System.out.print("Opcion deseada? [1-5]");
         opc=leer.nextInt();
         switch(opc)
         {
            case 1:
               Suma(num1,num2);
            break;
            case 2:
               Resta(num1, num2);
            break;
            case 3:
               Multiplicacion(num1,num2);
            break;
            case 4:
               Division(num1, num2);
            break;
            case 5:
               System.out.println("Saliendo...");
            break;
            default:
               System.out.println("Valor fuera de rango");
            break;
         }  
      }while(opc != 5);
   }
   public static void Suma(int num1, int num2)
   {
      // leer = new Scanner(System.in);
      System.out.print("Ingresa un numero a sumar:");
      num1 = leer.nextInt();
      System.out.print("Ingresa otro numero a sumar:");
      num2 = leer.nextInt();
      System.out.printf("La suma de los dos numeros es: %d", num1+num2);
   }
   
   public static void Resta(int num1, int num2)
   {
      //Scanner leer = new Scanner(System.in);
      System.out.print("Ingresa un numero a restar:");
      num1 = leer.nextInt();
      System.out.print("Ingresa otro numero a restar:");
      num2 = leer.nextInt();
      int resta = 0;
      if(num2>num1)
      {
         resta = num2 - num1;
      }
      else
      {
         resta = num1 - num2;
      }
      System.out.printf("La resta de los dos numeros es: %d", resta);
   }
   public static void Multiplicacion(int num1, int num2)
   {
      //Scanner leer = new Scanner(System.in);
      System.out.print("Ingresa un numero a Multiplicar:");
      num1 = leer.nextInt();
      System.out.print("Ingresa otro numero a Multiplicar:");
      num2 = leer.nextInt();
      System.out.printf("El producto de los dos numeros es: %d", num1*num2);
   }
   
  public static void Division(int num1, int num2)
   {
      //Scanner leer = new Scanner(System.in);
      System.out.print("Ingresa un numero a dividir:");
      num1 = leer.nextInt();
      System.out.print("Ingresa otro numero a dividir:");
      num2 = leer.nextInt();
      float division = (float) num1 / num2;
      System.out.printf("El cociente de los dos numeros es: %.2f", division);
   }



}