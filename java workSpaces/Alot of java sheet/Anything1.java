import java.util.Scanner; 
public class Anything1 {

public static void main(String [] args) {
Scanner input = new Scanner(System.in);

System.out.print("Enter small letter");
String userInput = input.nexLowet().toLowerCase();
String letter = userInput.charAt(0)+"";

char letter = userInput.charAt(0);
if(Character.isLetter(letter)){

if(letter.equals('a') || letter.isequals('e') || letter.isequals('i') || letter.isequals('o') || leter.isequals('u')){
System.out.print(letter+"is a vowel")
}else{
 System.out.print(letter + "is consonant");

}else{

Sytem.out.print("Invalid");

}
}
}
