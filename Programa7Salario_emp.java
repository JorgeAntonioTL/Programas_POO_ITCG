/*Programa 7: Elaborar un programa que calcule el salario de un empleado. Utilizando un m�todo para darlo de alta, los datos a solicitar son 
No. Empleado, Nombre, Direcci�n, salario por hora y otro m�todo para calcular su salario, 
recibiendo como par�metro el n�mero de horas trabajadas y retornando el c�lculo del salario.*/
import java.util.Scanner;
public class Programa7Salario_emp
{
   static Scanner leer = new Scanner(System.in);
   public static void main(String args[])
   {
      int opc=0;
      float hor=0, salh=0, salar=0;
      System.out.print("Desea dar de alta [1]Si [2]No: ");
      opc = leer.nextInt();
      if(opc == 1)
      {
         salh=altas();
         do
         {
            System.out.print("Ingresa las horas trabajadas por el trabajador: $");
            hor = leer.nextFloat();
         }while(hor<=0);
         salar=salario(hor, salh);
         System.out.printf("El salario de es igual a: $%.2f",salar); 
      }
   }
   public static float altas()
   {
      float sal=0;
      System.out.print("Ingresa el numero de empleado: ");
      int numEmpleado = leer.nextInt();
      leer.nextLine();
      System.out.print("Inserta el nombre del empleado: ");
      String nom = leer.nextLine();
      System.out.print("Direccion del empleado: ");
      String dir = leer.nextLine();
      do
      {
         System.out.print("Salario por hora: $");
         sal = leer.nextFloat();
      }while (sal<=0);
      return(sal);
   }
   public static float salario(float hor, float salh)
   {
      float salario=0;
      salario = hor * salh;
      return (salario);
   }
}