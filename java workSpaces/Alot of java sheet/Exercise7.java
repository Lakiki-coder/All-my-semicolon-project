 import java.util.Scanner;

  public class Exercise7{
  public static void main(String[] args){

  Scanner input = new Scanner(System.in);
  System.out.print("Enter first number");
  int number1 = input.nextInt();
  
  System.out.print("Enter second number");
  int number2 = input.nextInt();

  int square1 = number1 * number1;
  int square2 = number2 * number2;
  System.out.println("Square1 is " + square1 + "and square2 is " + square2);

  int sum = square1 + square2;
  int difference = (square1 * square1)-(square2 * square2);
  System.out.println("The difference of squares is  " + difference);
 
}
}
  