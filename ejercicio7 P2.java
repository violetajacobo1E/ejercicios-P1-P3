package ejercicio7p2;
public class Ejercicio7p2 {
    public static void main(String[] args) {
        int contador = 0;
        for (int i =0; i <= 10000; i++)
        {
            if(i % 20 == 0)
            {
                contador++;
            }    
        }
        
        System.out.println(contador);
    }
    
}
