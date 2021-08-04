
import java.util.Scanner;

public class primeroperoconerror { //Try catch controla los errores en la ejecucion

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero1, numero2;
        try {
            System.out.println("Ingrese primer numero");
            numero1 = entrada.nextInt();
            System.out.println("Ingrese segundo numero");
            numero2 = entrada.nextInt();
            float resultado = numero1 / numero2;
            System.out.println("El resultado es" + resultado);
        } catch (Exception e) {
            System.out.println("No se puede dividir por 0");
        } finally {
            System.out.println("Proceso terminado");
        }
    }
}
