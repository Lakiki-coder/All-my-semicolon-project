import java.util.Scanner;
public class NonDecreasing {

public static void main(String [] args) {
Scanner input = new Scanner(System.in);

System.out.println("Enter first number:");
double a = input.nextDouble();

System.out.println("Enter second number:");
double b = input.nextDouble();

System.out.println("Enter third number:");
double c = input.nextDouble();

if(a > b ) && (a > c ) && ( b > c );{
int first = a , b , c ;
System.out.println(first + "is in non decreasing other");
}
if(b > a ) && (b > c) && (a > c);{
int second = b , a , c;
System.out.println(second + "is in non decreasing other");
}
if(c > a) && (c & b) && (a > b);{
int third = c , a , b;
System.out.println(third + "is in non decreasing other");
}
if(a > b ) && (a > c ) && ( c > b );{
int forth = a , c , b ;
System.out.println(forth + "is in non decreasing other");
}
if(b > a ) && (b > c) && (c > a);{
int fifth = b , c , a;
System.out.println(fifth + "is in non decreasing other");
}
if(c > a) && (c & b) && (b > a);{
int sixth = c , b , a;
System.out.println(sixth + "is in non decreasing other");
  }
 }
}


