import javax.swing.JOptionPane;

public class Calculadora {
    public static void main(String[]args){
        int n1=Integer.parseInt(JOptionPane.showInputDialog("Digita un numero guapo: "));
        int n2=Integer.parseInt(JOptionPane.showInputDialog("Digita un numero guapo: "));

        Operaciones op=new Operaciones();
        int suma=op.suma (n1,n2);
        int resta=op.resta (n1,n2);
        int multiplicacion=op.multiplicacion(n1,n2);
        int division=op.division(n1,n2);
        int modulo=op.modulo(n1,n2);

        op.mostrarResultados(suma, resta, multiplicacion, division, modulo);

        op.mostrarResultados (op.suma(n1,n2),op.resta(n1,n2),op.multiplicacion(n1,n2),op.division(n1,n2),op.modulo(n1,n2));
    }

}
