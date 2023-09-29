/**
 * Clase que sera ejecutada
 */

public class Principal {
    /**
     * Primer metodo que se ejecutara en la aplicacion
     * @param args
     */
    public static void main (String [] args){
        Hombre juan = new Hombre("Juan","Me gustan todas" );
        Hombre kamilo = new Hombre("Kamilo","Me gusta poner cachos");
        Hombre david = new Hombre("David","Soy re calidoso");
        Hombre esteban = new Hombre ("Esteban", "Soy muy fiel");

        juan.decirFrase();
        kamilo.decirFrase();
        david.decirFrase();
        esteban.decirFrase();
    }

}
