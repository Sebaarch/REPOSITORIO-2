import javax.swing.JOptionPane;

public class Calculadora {
    public static void main(String[]args){
        int n1=Integer.parseInt(JOptionPane.showInputDialog("Digita un numero guapo: "));
        int n2=Integer.parseInt(JOptionPane.showInputDialog("Digita un numero guapo: "));

        Operaciones op=new Operaciones();
        op.suma (n1,n2);
        op.resta (n1,n2);
        op.multiplicacion(n1,n2);
        op.division(n1,n2);
        op.modulo(n1,n2);

        op.mostrarResultados();
    }
}
