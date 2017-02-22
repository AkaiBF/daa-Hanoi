/**
 * <H1> Towers of Hanoi </H1>
 * 
 * This program resolves by the method of Divide&Conquer the problem of the 
 * Towers of Hanoi.
 * 
 * For further information contact the author via e-mail:
 * alu0100881622@ull.edu.es
 * 
 * @author Ernesto Echeverría González
 * @version 1.0.0
 * @since 22-02-2017
 */

public class Hanoi {
  
  /**
   * Recursive function to move a disk from a tower to another one.
   * 
   * @param from Specifies the tower we are taking the disk from.
   * @param to Specifies the tower we are taking the disk to.
   * @param other Specifies the tower that we use as support.
   * @param n Specifies the number of disks left unmoved in the first tower.
   */
  static void hanoi(char from, char to, char other, int n) {
    if(n == 0) return;
    hanoi(from, other, to, n-1);
    System.out.println("Movemos disco de " + from + " a " + to + ".");
    hanoi(other, to, from, n-1);
  }
  
  public static void main(String[] args){
    final int DISCOS = Integer.parseInt(args[0]);
    hanoi('A', 'B', 'C', DISCOS);
  }
}