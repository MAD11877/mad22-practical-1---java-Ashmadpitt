import java.util.Scanner;

public class Question4
{
  public static void main(String[] args)
  {
    /**
     * Prints a right angle triangle with *. The base of the triangle depends on the integer given.
     *    e.g.
     *     > 5
     *     *****
     *     ****
     *     ***
     *     **
     *     *
     * 
     * Hint: 2 loops are required. System.out.print(...) to print on single line.
     */
     
    Scanner in = new Scanner(System.in);
    System.out.print("Enter Inverted Mirrored Right Triangle Pattern Rows = ");
		int rows = in.nextInt();
		in.close();
		System.out.println("-- Printing Inverted Mirrored Right Triangle Star Pattern --");
		int n,i,j = rows; 
		for (i = rows; i >= 1; i--)
    {
        for (j = 1; j <= i; j++) {
            System.out.print("*");
        }
 
        System.out.print("\n");
    }
  }
}
