import java.util.Scanner;
public class Multiple {

public static void main(String [] args) {
Scanner input = new Scanner(System.in);

System.out.println("Enter a number between 0,1,2,3,4 or 5:");
int number = input.nextInt();

if(number == 0 ){
int result5 = number ;
System.out.println("squared of your input is " + result5);
  }
if(number == 1 ){
int result =  number + number - number;
System.out.println("squared of your input is " + result);
  }
if(number == 2 ){
int result1 = number + number;
System.out.println("squared of your input is " + result1);
  }
if(number == 3 ){
int result2 = number + number + number;
System.out.println("squared of your input is " + result2);
  }
if(number == 4 ){
int result3 = number + number + number + number;
System.out.println("squared of your input is " + result3);
  }
if(number == 5 ){
int result4 = number + number + number + number + number;
System.out.println("squared of your input is " + result4);
  }else {
System.out.print("invalid number");
  }

 }
}