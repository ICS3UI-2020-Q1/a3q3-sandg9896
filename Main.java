import java.util.Scanner;
/**
 * Calculate percentage with grade letter
 * @author Gavin Sandhar
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // Create a scanner or user input
    Scanner input = new Scanner(System.in);
    
    // ask user to input grade
    System.out.println("Please enter a letter grade");
    String grade = input.nextLine();

    // which grade equals what percentage
    switch(grade){
      case "A":
       System.out.println("This is between 80% and 100%");
       break;
      case "B":
       System.out.println("This is between 70% and 79%");
       break;
      case "C":
       System.out.println("This is between 60% and 69%");
       break;
      case "D":
       System.out.println("This is between 50% and 59%");
       break;
      case "F":
       System.out.println("This is between 0% and 49%");
       break; 
      default:
      System.out.println("Invalid choice"); 
    }
    
  }
}
