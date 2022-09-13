package ejercicio2p2;
public class Ejercicio2P2 {
    public static void main(String[] args) {
        String Branch = "CSE";
        int year = 2;
         switch(year)
        {
            case 1:
                System.out.println("Curso electivos: Ingles, Calculo");
                break;
            case 2: 
                switch (Branch)
                {    
                    case "CSE":
                    case "CCE":
                        System.out.println("Curso electivos: Machine Learning, Big data");
                    break;

                    case "ECE":
                        System.out.println("Curso electivos : Programacion");
                    break;

                    default: 
                        System.out.println("Curso electivos : Ingenieria de Software");
        }    
    }

}
