package ejercicio3p2;
import java.util.Scanner;
public class Ejercicio3p2 {
    public static void main(String[] args) {
        int suma = 0, num;
        double promedio;
        Scanner ingresar = new Scanner(System.in);
        for(int i=1; i<=5; i++){
            System.out.println("ingresar el numero " + i);
            num = ingresar.nextInt();
            suma = suma + num; 
        }
        promedio = suma / 5;
        System.out.println("El promedio es: " + promedio);
    }

}
