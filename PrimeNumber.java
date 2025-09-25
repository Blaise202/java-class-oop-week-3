import java.util.Scanner;
public class PrimeNumber{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    System.out.print("Please enter the number to check: ");
    int number = scanner.nextInt();
    boolean is_prime = true;
    for(int i = 2; i<number; i++){
      if(number % i == 0){
        is_prime = false;
        break;
      }
    }
    if(is_prime){
      System.out.print(number+" is 'prime'");
    }else{
      System.out.print(number+" is 'not prime'");
    }
  }
}