
import javax.swing.JOptionPane;

public class vehiculo {

    //atributos
    String color;
    String marca;
    int km;
    String modelo;
    
    //crear objeto
    public static void main(String[] args) {
        vehiculo automovil = new vehiculo();
        automovil.color = " Gris";
        automovil.marca = " Audi";
        automovil.km = 0;
        automovil.modelo = "A3";
        System.out.println("El color del carro es" + automovil.color);
        System.out.println("La marca del carro es" + automovil.marca);
        System.out.println("El el modelo es" + automovil.modelo);
        System.out.println("El Kilometraje del auto es es" + automovil.km);

        vehiculo bus = new vehiculo();
        bus.color = JOptionPane.showInputDialog("Digite color del bus");
        bus.marca = JOptionPane.showInputDialog("Digite la marca del bus");
        bus.km = Integer.parseInt(JOptionPane.showInputDialog("Digite el km del bus"));
        bus.modelo = JOptionPane.showInputDialog("Digite el modelo del bus");
        
        System.out.println("el color del bus es"+bus.color);
        JOptionPane.showMessageDialog(null,"El color del bus es :"+bus.color );
        
    }
}
