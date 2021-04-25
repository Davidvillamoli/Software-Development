
package JavaDoc;
/**
 * Clase para trabajar con una variable que almacena un precio
 * @author <JesusVillaMoli>
 * @version 1.1
 */
public class Precio2
{
    // Variable miembro
    public double euros;
 
    /**
     * Devuelve el valor almacenado en euros
     * @return el valor almacenado
     */
    public double da() {
        return euros;
    }
 
    /**
     * Almacena un valor
     * @param x el valor a almacenar
     */
    public void pone(double x) {
        euros=x;
    }
}