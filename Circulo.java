package JavaDoc;

/**
 * Una clase para representar círculos situados sobre el plano.
 * Cada círculo queda determinado por su radio junto con las 
 * coordenadas de su  centro.
 * @author <jesusvillaMoli>
 * @version 1.1
 */

public class Circulo {
    protected double x,y; // coordenadas del centro
    protected double r;  // radio del círculo
    
    /** 
     * Crea un círculo a partir de su origen su radio.
     * @param x La coordenada x del centro del círculo.
     * @param y La coordenada y del centro del círculo.
     * @param r El radio del círculo. Debe ser mayor o igual a 0.
     */
    public Circulo(double x, double y, double r) {
        this.x=x; this.y = y; this.r = r;
    }   
    
    /** 
     * Cálculo del área de este círculo.
     * @return El área (mayor o igual que 0) del círculo.
     */
     public double área() {
        return Math.PI*r*r;
     }
     
     /** 
      * Indica si un punto está dentro del círculo.
      * @param px componente x del punto
      * @param py componente y del punto
      * @return true si el punto está dentro del círculo o false en otro caso.
      */
     public boolean contiene(double px, double py) {
        /* Calculamos la distancia de (px,py) al centro del círculo (x,y),
           que se obtiene como raíz cuadrada de (px-x)^2+(py-y)^2 */
        double d = Math.sqrt((px-x)*(px-x)+(py-y)*(py-y));
        
        // el círculo contiene el punto si d es menor o igual al radio
        return  d <= r;
     }
}