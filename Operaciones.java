public class Operaciones {
    //Atributos
    int suma;
    int resta;
    int multiplicacion;
    int division;
    int modulo;
    
    //metodos
    
    
    //metodo de suma
    public void suma(int numero1, int numero2){
        suma= numero1+numero2;

        
    }
        public void resta(int numero1, int numero2){
            resta= numero1-numero2;
        
    }
        public void multiplicacion(int numero1, int numero2){
            multiplicacion= numero1*numero2;
        
    }
        public void division(int numero1, int numero2){
            division= numero1/numero2;
        
    }
    public void modulo(int numero1, int numero2){
        modulo= numero1%numero2;
    
}
public void mostrarResultados(){
    System.out.println("La suma es: " + suma);
    System.out.println("La resta es: " + resta);
    System.out.println("La multiplicacion es: "+ multiplicacion);
    System.out.println("La division es : "+ division);
    System.out.println("El modulo es  : "+ modulo);
}
}


