import java.util.Scanner;

 public class Exercise11{
 public static void main(String [] args){
 Scanner scan = new Scanner(System.in);

System.out.println("enter first number");
int num1 = scan.nextInt();

System.out.println("enter second number");
int num2 = scan.nextInt();

System.out.println("enter third number");
int num3 = scan.nextInt();

System.out.println("enter forth number");
int num4 = scan.nextInt();

System.out.println("enter fifth number");
int num5 = scan.nextInt();

int Largest = num1;
if (num2 > Largest){
Largest = num2;
}
if (num3 > Largest){
Largest = num3;
}
if(num4 > Largest){
Largest = num4;
}
if(num5 > Largest){
Largest = num5;
}
System.out.println("largest" + Largest);

int secondlagest = num1;
if(num2 <= SecondLargest){
num2 = secondLargest;
}
if(num3 <= secondLargest){
num3 <= secondLargest;
}
if(num4 <= secondLargest){
num4 <= secondLargest;
}
if(num5 <= secondLargest){
num5 <= secondLargest;
}

System.out.println("second" + SecondLargest);
}
}
