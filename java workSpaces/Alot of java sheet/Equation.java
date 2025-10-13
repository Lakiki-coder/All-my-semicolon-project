import java.util.Scanner;
public class Equation {

public static void main(String [] args) {
Scanner input = new Scanner(System.in);

System.out.println("Enter first number:");
double a = input.nextDouble();

System.out.println("Enter second number:");
double b = input.nextDouble();

System.out.println("Enter third number:");
double c = input.nextDouble();

System.out.print("Enter forth numbers");
double d = input.nextDouble();

System.out.println("Enter fifth number:");
double e = input.nextDouble();

System.out.print("Enter sixth numbers");
double f = input.nextDouble();

double solv = a*d - b*c;

if(solv = 0){
System.out.println("equation has no root");
} 
if(solv != 0){
double X = e * d - b * f / a * d - b * c;
double Y = a * f - e * c / a * d - b * c;

System.out.print("There for x = " + X "and y = " + Y");
   }
 }
}



