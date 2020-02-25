import java.util.Scanner;
public class Programa3ConversioPeso
{ 
   static Scanner leer = new Scanner(System.in);
   static double pesos=0;
   public static void main(String args[])
   {
      menu();      
   }
   public static void menu()
   {
      int opc=0;
           do
      {
         System.out.println("\n CONVERTIR PESO A:");
         System.out.println("[1] Euros");
         System.out.println("[2] Libras");
         System.out.println("[3] Esterlinas");
         System.out.println("[4] Yenes");
         System.out.println("[5] Dolares");
         System.out.println("[6] SALIR");
         System.out.print("Opcion deseada? [1-5]");
         opc=leer.nextInt();
         switch(opc)
         {
            case 1:
               euros();
            break;
            case 2:
               libras();
            break;
            case 3:
               esterlinas();
            break;
            case 4:
               yenes();
            break;
            case 5:
               dolares();
            break;
            case 6:
               System.out.println("Saliendo...");
            break;
            default:
               System.out.println("Valor fuera de rango");
            break;
         }  
      }while(opc != 6);
   }
   public static void euros()
   {
      double pesos=0;
      do
      {
         System.out.print("Ingresa la cantidad de pesos a convertir a euros: $");
         pesos = leer.nextDouble();
      }while (pesos<=0);
      System.out.printf("$%.2f son equivalentes a %.2f euros", pesos, pesos*0.049);
   }
   
   public static void libras()
   {
      do
      {
         System.out.print("Ingresa la cantidad de pesos a convertir a libras egipcias: $");
         pesos = leer.nextDouble();
      }while(pesos<=0);
      System.out.printf("$%.2f son equivalentes a %.2f libras egipcias", pesos, pesos*0.84);
   }
   public static void esterlinas()
   {
      do
      {
         System.out.print("Ingresa la cantidad de pesos a convertir a libras Esterlinas: $");
         pesos = leer.nextDouble();
      }while(pesos<=0);
      System.out.printf("$%.2f son equivalentes a %.2f libras esterlinas", pesos, pesos*0.041 );
   }
   public static void yenes()
   {
      do
      {
         System.out.print("Ingresa la cantidad de pesos a convertir a yenes: $");
         pesos = leer.nextDouble();
      }while(pesos<=0);
      System.out.printf("$%.2f son equivalentes a %.2f yenes", pesos, pesos*5.84);
   }
  public static void dolares()
   {
      do
      {
         System.out.print("Ingresa la cantidad de pesos a convertir a dolares: $");
         pesos = leer.nextDouble();
      }while(pesos<=0);
      System.out.printf("$%.2f son equivalentes a %.2f dolares", pesos, pesos*0.053 );
   }
}