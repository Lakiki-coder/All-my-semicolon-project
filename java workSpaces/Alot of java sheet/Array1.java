import java.util.Scanner ;
public class Array1 {
public static void main(String [] args) {
Scanner input = new Scanner(System.in);
int[] scores = new int[5];

for(int i = 0; i < 5; i++){
System.out.println("Enter number");
scores[i] = input.nextInt();
}

System.out.println(scores[2]);

}



}



