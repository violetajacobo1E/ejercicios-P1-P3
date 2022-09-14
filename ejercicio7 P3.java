import java.util.Scanner;
public class ejercicio3 {
public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Introduce un número: ");
        n = sc.nextInt();
        System.out.println("\nNumeros del 1 al " + n + ": ");                                           
        int i;
        for (i = 1; i <= n; i++) {
            System.out.println(i); 
    }
    }
}
 
