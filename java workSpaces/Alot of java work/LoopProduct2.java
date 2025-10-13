import java.util.Scanner;

public class LoopProduct2 {

public static void main(String [] args){

Scanner scanner = new Scanner(System.in);

System.out.print("Enter any number");

int number1 = scanner.nextInt();

int multiple = 1;

for(int number = number1; number <= number1; number++){

if(number %2 == 0){

multiple = multiple * number;
}
System.out.println(multiple);
  
}
}
}


