import java.util.Scanner;
public class Factorial{
  public static void main(String[] args){
    Scanner  scanner = new Scanner(System.in);
    System.out.print("Please find the number to find it's factorial: ");
    int number = scanner.nextInt();
    int fact = 1;
    for(int i = number; i > 0; i--){
      fact *= i;
    }
    System.out.print("The factorial of "+ number +" is "+fact);
  }
}