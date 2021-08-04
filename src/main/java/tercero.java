
public class tercero {
// control de error en programa con try catch
    public static void main(String[] args) {
        int array[] = new int[3];
        try {
            array[-2] = 20;
        } catch (Exception e) {
            System.out.println("Error de indice de arreglo");
        } finally {
            System.out.println("Se termino el proceso");
        }
    }
}
