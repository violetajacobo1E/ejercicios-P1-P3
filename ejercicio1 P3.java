package ejercicio1;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
           Scanner keyboard = new Scanner(System.in);
           int password;
           do {
           System.out.println("Introduzca su contraseña numerica:");
           password = keyboard.nextInt();
           if (password != 1234)
               System.out.println("la contraseña no es valida.");
            }
           while (password != 1234);
    }
    
}
