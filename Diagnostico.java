import java.util.Scanner;
public class Diagnostico
{
   public static void main(String args[])
   {
      Scanner leer = new Scanner(System.in);
      int num=0, equi=0, lapi=0, opc=0, vend1=0, vend2=0, vend3=0;
      float casa1=0, casa2=0, casa3=0, total1=0, total2=0, total3=0, totalVentas;
      boolean acceso=true;
      
      while(acceso==true)
      {
         System.out.println("\n[1] Capturar precio de los tipos de casas");
         System.out.println("[2] Calcular venta por cada tipo de casa");
         System.out.println("[3] Calcular venta total de todas las casas");
         System.out.println("[4] Salir\n");
         System.out.print("Ingresa una opcion: ");
         opc = leer.nextInt();
         switch(opc)
         {
            case 1:
               System.out.println("Ingresar precio de venta de cada tipo de casa: ");
               System.out.print("Casas de 2 recamaras: ");
               casa1 = leer.nextFloat();
               System.out.print("Casas de 3 recamaras: ");
               casa2 = leer.nextFloat();
               System.out.print("Casas de lujo: ");
               casa3 = leer.nextFloat();
            break;
            
            case 2:
               System.out.println("[1] casas de 2 recamaras: ");
               System.out.println("[2] casas de 3 recamaras: ");
               System.out.println("[3] casas de lujo: ");
               System.out.print("Seleccione una opcion: ");
               opc = leer.nextInt();
               if(opc==1)
               {
                  System.out.print("casas de 2 recamaras vendidas: ");
                  vend1= leer.nextInt();
                  total1 = casa1 * vend1;
                  System.out.printf("El dinero total acumulado de casas de 2 recamaras es: $%.2f\n", total1);
               }
               if(opc==2)
               {
                  System.out.print("casas de 3 recamaras vendidas: ");
                  vend2 = leer.nextInt();
                  total2 = casa2 * vend2;
                  System.out.printf("El dinero total acumulado de casas de 3 recamaras es: $%.2f\n", total2);
               }
               if(opc==3)
               {
                  System.out.print("casas de lujo vendidas: ");
                  vend3= leer.nextInt();
                  total3 = casa3 * vend3;
                  System.out.printf("El dinero total acumulado de casas de lujo es: $%.2f\n", total3);
               }
            break;
            
            case 3:
               totalVentas = total1 + total2 + total3;
               System.out.printf("El dinero TOTAL de las ventas es: $%.2f\n", totalVentas);
            break; 
            
            case 4:
               System.out.println("Saliendo...");
               acceso = false;
            break; 
            
            default:
               System.out.println("Valor fuera de rango");
            break;
         }
      }     
   }
}