import java.util.Scanner;

public class VowelsCounter{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the string to count vowels: ");
    String my_text = scanner.nextLine();
    String vowels = "aeiouAEIOU";
    char[] my_text_as_array = my_text.toCharArray();
    int count = 0;
    for(char character : my_text_as_array){
      if(vowels.contains(String.valueOf(character))){
        count++;
      }
    }
    System.out.print("There are "+count+" vowels in the text you provided");
  }
}