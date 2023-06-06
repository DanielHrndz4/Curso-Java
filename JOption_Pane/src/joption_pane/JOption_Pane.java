package joption_pane;
import javax.swing.JOptionPane;

public class JOption_Pane {

    public static void main(String[] args) {
        String nombre, apellido;
        int edad;
        
        nombre = JOptionPane.showInputDialog("Digite su nombre: ");
        apellido = JOptionPane.showInputDialog("Digite su apellido: ");
        edad = Integer.parseInt(JOptionPane.showInputDialog("Digite su edad: "));
        
        //SALIDA
        JOptionPane.showMessageDialog(null,"Nombre: "+nombre+" "+apellido+"\n"+"Edad: "+edad); 
    }
    
}
