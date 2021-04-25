package JavaDoc;

/**
 * Una clase para representar c�rculos situados sobre el plano.
 * Cada c�rculo queda determinado por su radio junto con las 
 * coordenadas de su  centro.
 * @author <jesusvillaMoli>
 * @version 1.1
 */

public class Circulo {
    protected double x,y; // coordenadas del centro
    protected double r;  // radio del c�rculo
    
    /** 
     * Crea un c�rculo a partir de su origen su radio.
     * @param x La coordenada x del centro del c�rculo.
     * @param y La coordenada y del centro del c�rculo.
     * @param r El radio del c�rculo. Debe ser mayor o igual a 0.
     */
    public Circulo(double x, double y, double r) {
        this.x=x; this.y = y; this.r = r;
    }   
    
    /** 
     * C�lculo del �rea de este c�rculo.
     * @return El �rea (mayor o igual que 0) del c�rculo.
     */
     public double �rea() {
        return Math.PI*r*r;
     }
     
     /** 
      * Indica si un punto est� dentro del c�rculo.
      * @param px componente x del punto
      * @param py componente y del punto
      * @return true si el punto est� dentro del c�rculo o false en otro caso.
      */
     public boolean contiene(double px, double py) {
        /* Calculamos la distancia de (px,py) al centro del c�rculo (x,y),
           que se obtiene como ra�z cuadrada de (px-x)^2+(py-y)^2 */
        double d = Math.sqrt((px-x)*(px-x)+(py-y)*(py-y));
        
        // el c�rculo contiene el punto si d es menor o igual al radio
        return  d <= r;
     }
}