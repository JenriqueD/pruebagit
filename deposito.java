package cuentas;


/*
En el proyecto Java "Deposito", hay definida una Clase llamada CCuenta, que 
tiene una serie de atributos y métodos. El proyecto cuenta asimismo con una 
Clase Main, donde se hace uso de la clase descrita.
 */

/**
 *
 * @author enriquedelgado
 */
public class deposito {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CCuenta cuenta1;
        double saldoActual;
        cuenta1 = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
        saldoActual = cuenta1.estado();
        System.out.println("El dinero que hay es: "+ saldoActual );
    
        operaciones(cuenta1);
 
        saldoActual = cuenta1.estado();
        System.out.println("El dinero que hay es: "+ saldoActual );
    } 

    private static void operaciones(CCuenta cuenta1) {
        // Operaciones de ingreso y retiro
        cuenta1.retirar(2300);
        cuenta1.ingresar(685);
    }
}
   