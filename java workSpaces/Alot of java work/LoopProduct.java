public class LoopProduct {

public static void main(String [] args){

int multiple = 1;
int number = 1;
while(number <= 10 ){

if(number % 2 == 0){
multiple = multiple * number;
}number++;

}
System.out.println(multiple);
  

}
}


