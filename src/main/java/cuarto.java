
import java.util.Scanner;

public class cuarto {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        try {
            int dato;
            System.out.println("Digite numero");
            dato = entrada.nextInt();
            System.out.println("El numero es :" + dato);
        } catch (Exception e) {
            System.out.println("Digite un dato entero");
        } finally {
            System.out.println("El proceso termino");
        }
    }
}
