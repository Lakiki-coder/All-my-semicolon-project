import java.util.Scanner;
public class Qequation {

public static void main(String [] args) {
Scanner input = new Scanner(System.in);

System.out.println("Enter first number:");
int a = input.nextInt();

System.out.println("Enter second number:");
int b = input.nextInt();

System.out.println("Enter third number:");
int c = input.nextInt();

System.out.print("Enter forth numbers");
int d = input.nextInt();

System.out.println("Enter fifth number:");
int e = input.nextInt();

System.out.print("Enter sixth numbers");
int f = input.nextInt();

int solv = a*d - b*c;

if(solv = 0){
System.out.println("equation has no root");
} 
if(solv != 0){
int X = e * d - b * f / a * d - b * c;
int Y = a * f - e * c / a * d - b * c;

System.out.print("There for x = " + X "and y = " + Y");
   }
 }
}



