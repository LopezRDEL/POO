/**
 * Clase hombres
 */
public class Hombre {
    /**
     * atributos:
     */
    String nombre;
    String frase;
    /**
     * Constructor de la clase
     *@param nombre Nombre del hombre
     *@param frase frase que hace el hombre
     *
     */
    public Hombre (String nombre, String frase){
        this.nombre=nombre;
        this.frase=frase;
    }

    /**
     * Imprime frase que dice el hombre
     */
    void decirFrase() {
        System.out.println("El " + nombre + " dice " + frase);


    }
}