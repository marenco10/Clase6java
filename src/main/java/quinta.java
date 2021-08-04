
import javax.swing.JOptionPane;


public class quinta { //operacion
    // atributos
    int numero1;
    int numero2;
    int suma;
    int resta;
    int multiplicacion;
    float division;
    // metodos
    // metodos leer numeros
    public void leernumeros(){
        numero1=Integer.parseInt(JOptionPane.showInputDialog("Digite primer numero"));
        numero2=Integer.parseInt(JOptionPane.showInputDialog("Digite segundo numero"));
        
    }
    public void sumar(){
    suma=numero1+numero2;
}
    public void restar(){
        resta=numero1-numero2;
    }
 public void multiplicar(){
     multiplicacion=numero1*numero2;
 }   
 public void divisiones(){
     division= (float) numero1/numero2;
 }
 public void mosresultado(){
     System.out.println("La suma es: "+suma);
     
     JOptionPane.showInternalMessageDialog(null,"la suma es : "+suma);
     JOptionPane.showInternalMessageDialog(null,"la resta es : "+resta);
     JOptionPane.showInternalMessageDialog(null,"la multiplicacion es : "+multiplicacion);
     JOptionPane.showInternalMessageDialog(null,"la division es : "+division);
 }
}
