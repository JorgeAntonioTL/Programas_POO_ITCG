import java.util.Scanner;
public class Programa2Areas
{ 
   static Scanner leer = new Scanner(System.in);
   public static void main(String args[])
   {
      menu();      
   }
   public static void menu()
   {
      int opc=0;
      do
      {
         System.out.println("\n CALCULAR AREAS DE FIGURAS:");
         System.out.println("[1] Triangulo");
         System.out.println("[2] Cuadrado");
         System.out.println("[3] Rectangulo");
         System.out.println("[4] Circulo");
         System.out.println("[5] SALIR");
         System.out.print("Opcion deseada? [1-5]");
         opc=leer.nextInt();
         switch(opc)
         {
            case 1:
               triangulo();
            break;
            case 2:
               cuadrado();
            break;
            case 3:
               rectangulo();
            break;
            case 4:
               circulo();
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
   public static void triangulo()
   {
      float b=0, h=0;
      do{
            System.out.print("Ingresa la base del triangulo: ");
            b = leer.nextFloat();
            System.out.print("Ingresa la altura del triangulo: ");
            h = leer.nextInt();
         }while(b<=0 && h<=0);
         System.out.printf("El area del triangulo es: %.2f", b*h/2);

   }
   
   public static void cuadrado()
   {
      float l=0;
      do
      {
         System.out.print("Ingresa la medida por lado del cuadrado: ");
         l = leer.nextFloat();
      }while(l<=0);
      System.out.printf("El area del cuadrado es: %.2f", l*l);
   }
   public static void rectangulo()
   {
      float b=0, h=0;
      do
      {
         System.out.print("Ingresa la base del rectangulo: ");
         b = leer.nextFloat();
         System.out.print("Ingresa la altura del rectangulo: ");
         h = leer.nextInt();
      }while(b<=0 && h<=0);
      System.out.printf("El area del rectangulo es: %.2f", b*h);
   }
   
  public static void circulo()
   {
      float r=0;
      do
      {
         System.out.print("Ingresa el radio del circulo: ");
         r = leer.nextFloat();
      }while(r<=0);
      System.out.printf("El area del circulo es: %.2f", r*r*3.1416);

   }
}