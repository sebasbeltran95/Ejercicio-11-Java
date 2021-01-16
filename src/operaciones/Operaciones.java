package operaciones;

/**
 *
 * @author sebas
 */
import java.util.Scanner;
public class Operaciones {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int a , b, resultado, clave = 0;
        Scanner in = new Scanner(System.in);
        
        System.out.println("Porfavor ingrese el primer numero");
        a = in.nextInt();
        
        System.out.println("Porfavor ingrese el segundo numero");
        b = in.nextInt();
        
        System.out.println("Porfavor escoja una de las soguientes opciones");
        System.out.println("1 suma");
        System.out.println("2 resta");
        System.out.println("3 multiplicacion");
        System.out.println("4 division");
        
        System.out.println("Porfavor escoja una opcion");
        clave = in.nextInt();
        
        switch(clave){ 
        
            case 1 :
                resultado = a + b;
                System.out.println("El resultado de la suma es: " + resultado);
                break;
            case 2:
                resultado = a - b;
                System.out.println("El resultado de la resta es: " + resultado);
                break;
            case 3:
                resultado = a * b;
                System.out.println("El resultado de la multiplicacion es: " + resultado);
                break;
            case 4:
                resultado = a / b;
                System.out.println("El resultado de la division es: " + resultado);
                break;
            default:
                System.out.println("Error al digitar la opcion");
                break;
        }
        
    }
}
