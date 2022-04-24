import java.util.Scanner;

public class Question2
{
  public static void main(String[] args)
  {
    /**
     * Prompts user for height and weight, calculate and print out the BMI of the user
     * 
     * Hint: in.nextDouble() to read double
     */
    Scanner in = new Scanner(System.in);
    System.out.println("Input height in meters: ");
    double height = in.nextDouble();
    System.out.println("Input weight in kilogram: ");
    double weight = in.nextDouble();
    double BMI = weight / (height * height);
    System.out.println("The Body Mass Index (BMI) in kg/m2 is ");
    System.out.println(BMI);
  }
}
