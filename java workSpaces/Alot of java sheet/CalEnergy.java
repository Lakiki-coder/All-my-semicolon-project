import java.util.Scanner;
public class CalEnergy {

public static void main(String[] args){
Scanner input = new Scanner(System.in);

System.out.print("Enter amount of water: ");
double M input.nextDouble();

System.out.print("Enter initial temp: ");
double initialTemp = input.nextDouble();

System.out.print("Enter final temp: ");double finalTemp = input.nextDouble();

double Q = M* (finalTemp initialTemp) * 4184;
System.out.print("The energy needed is " + Q + " joules"); "

}

}