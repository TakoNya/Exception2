package excepcion2;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Excepcion2 {

        public static void main(String[] args) {
            Scanner teclado = new Scanner(System.in);
            int n;
            do{
                try{
                    System.out.print("Introduce un número entero mayor a cero: ");
                    n = teclado.nextInt();
                    System.out.println("Número introducido: " + n);
                } catch (InputMismatchException e){
                    n = 0;
                    System.out.println("Debe introducir un número entero " + e.toString());
                }
            } while (n<= 0);
        
    }
    
}
