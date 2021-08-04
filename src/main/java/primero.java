
import java.util.Scanner;

public class primero {    // Edad, trycatch

    public static void main(String[] args) {
        Scanner dato = new Scanner(System.in);
        try {
            int edad;
            final int edadmaxima = 120;
            System.out.println("Ingrese edad");
            edad = dato.nextInt();
            if (edad < edadmaxima) {
                System.out.println("Ingreso de edad correcta");
            } else {
                System.out.println("Digite una edad valida");

            }
        } catch (Exception e) {
        }
   finally{
            System.out.println("Proceso terminado");
    }
}
}
