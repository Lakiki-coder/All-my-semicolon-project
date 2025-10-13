import java.util.Scanner ;
public class Nokia3.0 {

public static void main(String [] args) {
Scanner input = new Scanner(System.in);


String prompt("""


			
		NOKIA
			NEW
				WORLD
		
Select->
	1-> Phone book
	2-> Messages
	3-> Chat
	4-> Call register
	5-> Tones
	6-> Setting
	7-> Call divert
	8-> Games
	9-> Calculator
	10-> Reminders
	11-> Clock
	12-> Profiles
	13-> SIM services""");

System.out.println(prompt);
System.out.println("Select an option above");

int firstInput = input.nextInt();
switch(firstInput){
	
	case 1: System.out.println(phonebookMenu());
	case 2: System.out.println(messageMenu());


}
}

Public static int phoneBookMenu(){
System.out.println("""


	     PHONE BOOK-->
                    1->search
                    2->Service Nos
                    3->Add name
                    4->Erase
                    5->Edit
                    6->Assign tone
                    7->Send b'card
                    8->Option
                    9->Speed dials
                    10->Voice tags""");
System.out.println("Select an option from above");
int phonebook = input.nextInt();
}

public static int messageMenu(){
System.out.println("""

		        1-> Write messages
			2-> Inbox
			3-> Outbox
			4-> Picture messages
			5-> Templates
			6-> Smiley
			7-> Message setting
			8-> Info service
			9-> Voice mailbox number
			10-> Service command editor
                        """);

}
}