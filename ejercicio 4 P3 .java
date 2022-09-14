package ejercicio4;
import java.util.Scanner;
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner objeto = new Scanner (System.in);
        int valor, conteo = 0;
        double suma = 0;
        boolean seguir = false;
         while (!(seguir))
        {
            System.out.println("Ingresar un valor entero, el proceso finalizara cunando imprese un multiplo de 8" );
            valor=objeto.nextInt();
            
            if((valor%8)==0)
            {
                seguir=true;
            } 
            else
            {
            conteo++;
            suma+=valor;
            }    
        } 
        
        if(conteo!=0)
        {
            System.out.println("La cantidad de valores ingresados es"+conteo);
            System.out.println("La suma de todos los valores es"+suma);
        }    
        else
            {
                System.out.println("chao, lea indicaciones :3");
            }
    }
    
    
}
