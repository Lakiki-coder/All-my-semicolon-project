import java.util.Scanner ;
public class Counter {

public static void main(String [] args){
Scanner input = new Scanner(System.in);

int positive = 0;
int negative = 0;
int zero = 0;
int counter = 0;

  while(counter < 20){

System.out.println("Enter your Figures");
int figure = input.nextInt();

if(figure > 0){
positive++;
}else if(figure < 0){
negative++;
}else if(figure == 0){
zero++;
 }
}

System.out.println(positive);
System.out.println(negative);
System.out.print(zero);


  }
 }