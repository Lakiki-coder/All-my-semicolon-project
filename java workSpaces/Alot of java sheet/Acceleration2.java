import java.util.Scanner;
public class Acceleration2 {

public static void main(String[] args){
Scanner Input = new Scanner(System.in);

System.out.print("Initial velocity: ");
double v0 = Input.nextDouble();

System.out.print("Final velocity: ");
double v1 = Input.nextDouble();

System.out.print("Enter time taken: ");
double t = Input.nextDouble();

double a = v1 - v0/t;

System.out.print("The average acceleretion is " + a);
}
}