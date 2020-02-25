/*Programa 8: Elaborar un programa que convierta un número decimal a binario, octal y hexadecimal. Utilizando métodos y variables locales.*/
import java.util.Scanner;
import javax.swing.JOptionPane;
public class Programa8conversionesDecimal
{
   static Scanner leer = new Scanner(System.in);
   public static void main(String args[])
   {
      menu();
   }
   public static void menu()
   {
      int opc=0, num=0;
           do
      {
         System.out.println("\n CONVERTIR Decimal A:");
         System.out.println("[1] Binario");
         System.out.println("[2] Octal");
         System.out.println("[3] Hexadecimal");
         System.out.println("[4] SALIR");
         System.out.print("Opcion deseada? [1-4]: ");
         opc=leer.nextInt();
         switch(opc)
         {
            case 1:
               System.out.print("Ingresa un numero decimal: ");
               num = leer.nextInt();
               String bin;
               bin=binario(num);
               System.out.printf("El numero %d es igual a %s", num,  bin);
            break;
            case 2:
               System.out.print("Ingresa un numero decimal: ");
               num = leer.nextInt();
               String octa;
               octa=octal(num);
               System.out.printf("El numero %d es igual a %s", num,  octa);
            break;
            case 3:
               System.out.print("Ingresa un numero decimal: ");
               num = leer.nextInt();
               String hexa;
               hexa=hexadecimal(num);
               System.out.printf("El numero %d es igual a %S", num,  hexa);
            break;
            case 4:
               System.out.println("Saliendo...");
            break;
            default:
               System.out.println("Valor fuera de rango");
            break;
         }  
      }while(opc != 4);
   }
   public static String octal(int num)
   {
      String octa = Integer.toOctalString(num);
      return(octa);
   }
   public static String binario(int num)
   {
      String bin = Integer.toBinaryString(num);
      return(bin);
   }
   public static String hexadecimal(int num)
   {
      String hexa = Integer.toHexString(num);
      return(hexa);
   }


}
