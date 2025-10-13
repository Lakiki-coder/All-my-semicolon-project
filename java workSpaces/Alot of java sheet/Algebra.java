import java.util.Scanner;
public class Algebra {

public static void main(String [] args){
Scanner input = new Scanner(System.in);

System.out.print("Enter number(a)");
double letterA = input.nextDouble();

System.out.print("Enter number(b)");
double letterB = input.nextDouble();

System.out.print("Enter number(c)");
double letterC = input.nextDouble();

double max = (letterB * letterB) - 4 * letterA * letterC;

double x1 = (-letterB + Math.sqrt (max)) / (2 * letterA);

double x2 = (-letterB - Math.sqrt (max)) / (2 * letterA);

if(max >= 0){

System.out.printf("root is: %.2f%n ", x1);
System.out.printf("root is: %.2f ", x2);
} else {
System.out.print("no root");
}
}
}