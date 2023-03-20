package factorial;
import javax.swing.JOptionPane;

public class Factorial {

    public static void main(String[] args) {
        int numero;
        int factorial = 1;
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digita un numero: "));
        
        for (int i=1; i<=numero;i++){
            factorial = factorial * i;
        }
        
        JOptionPane.showMessageDialog(null,"El factorial de "+numero+" es: "+factorial);
    }
    
}
