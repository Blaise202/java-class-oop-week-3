import java.util.Scanner;
public class ReversedNumber{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a number to reverse: ");
    String number = scanner.nextLine();
    char[] numberAsArray = number.toCharArray();
    int arrayLength = numberAsArray.length;
    String reversedNumber = "";
    for(int i = arrayLength - 1; i >= 0; i--){
      reversedNumber += numberAsArray[i];
    }
    System.out.print("The reversed number becomes: "+reversedNumber);
  }
}