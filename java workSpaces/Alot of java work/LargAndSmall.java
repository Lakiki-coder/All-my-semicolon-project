import java.util.Scanner;
public class LargAndSmall {

public static void main(String[] args){
Scanner input = new Scanner(System.in);

System.out.print("Enter first number");
int num1 = input.nextInt();

System.out.print("Enter second number");
int num2 = input.nextInt();

System.out.print("Enter third number");
int num3 = input.nextInt();

System.out.print("Enter forth number");
int num4 = input.nextInt(); 

System.out.print("Enter fifth number");
int num5 = input.nextInt();


int Largest = num1;

if(num2 > Largest){Largest = num2;}
if(num3 > Largest){Largest = num3;}
if(num4 > Largest){Largest = num4;}
if(num5 > Largest){Largest = num5;}

System.out.println(" the Largest" + Largest);


int Smallest = num1;

if(num2 < Smallest){Smallest = num2;}
if(num3 < Smallest){Smallest = num3;}
if(num4 < Smallest){Smallest = num4;}
if(num5 < Smallest){Smallest = num5;}

System.out.println(" the Smallest" + Smallest);

}
}