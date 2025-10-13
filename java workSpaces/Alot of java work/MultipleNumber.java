import java.util.Scanner;
public class MultipleNumber {

public static void main(String [] args){
Scanner input = new Scanner(System.in);

System.out.print("Enter Num");
int number = input.nextInt();

if(number % 6 || number % 7  == 0){
System.out.println("number is a multiple of 6 or 7");
}

}
}