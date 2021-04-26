import java.util.Scanner;
// TODO: Auto-generated Javadoc

/**
 * The Class ExerciseFive.
 */


/*
 * @author <villarroelMolinaJesusDavid>
 * 
 * Escribe un programa que calcule el área de un trinagulo.
 */

public class ExerciseFive {

  /**
   * The main method.
   *
   * @param args the arguments
   */
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.println("Vamos ha calcular el area de un triangulo.");
    System.out.println("------------------------------------------");
    System.out.println("Introduce la base: ");
    int base = s.nextInt();
    
    System.out.println("Introduce la altura: ");
    int altura = s.nextInt();
    
    int area = (base*altura)/2;
    System.out.println("El area de tu triangulo es : " + area);
    
  }

}
