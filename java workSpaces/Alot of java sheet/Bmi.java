import java.util.Scanner;
public class Bmi {

public static void main(String [] args) {
Scanner input = new Scanner(System.in);

System.out.println("Enter weight in pound:");
double a = input.nextDouble();

System.out.println("Enter feet:");
double b = input.nextDouble();

System.out.println("Enter inches:");
double c = input.nextDouble();



double measure = (b * 12) * c;

double bmi = a / b;

System.out.print("Your  BMI is " + bmi);

  }
 }