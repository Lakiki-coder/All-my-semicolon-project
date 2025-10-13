import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTesting{

@Test
public void testToMultiplyTwoNumbers(){


	//Arrange
        int firstNumber = 4;
	int secondNumber = 5;
	
	//Act
	Calculator calculator = new Calculator();
	//then save And open another note pad
	//then call d method by using the name of the class in the other notepad
	
	int result = calculator.multiply(firstNumber,secondNumber);

	//Assaert
	assertEquals(result,20);
}




@Test
public void testToSubstractTwoNumbers(){


	//Arrange
        int firstNumber = 5;
	int secondNumber = 5;
	
	//Act
	Calculator calculator = new Calculator();
	int result = calculator.substract(firstNumber,secondNumber);

	//Assaert
	assertEquals(result,6);
}







}