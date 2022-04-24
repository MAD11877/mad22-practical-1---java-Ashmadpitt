import java.util.Scanner;

public class Question3
{
  public static void main(String[] args)
  {
    /**
     * Reads integer entered by the user, multiplies the integer by itself and print out the result.
     * 
     * Hint: in.nextInt() to read integer
     */
     
    Scanner in = new Scanner(System.in);
    //System.out.print("Enter a number: ");
    int number = in.nextInt();
    //System.out.println("You entered: " + number);
    int number1 = number;
    in.close();
    int output = number*number1;
    //System.out.println("Output: " + number + "*" + number1 + "=" + output);
    System.out.println(output)
  }
}
