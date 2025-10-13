import java.util.Scanner ;
public class Nokia03 {

public static void main(String [] args) {


String prompt = """


			
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
	13-> SIM services
	14-> exit""";

System.out.println(prompt);
System.out.println("Select an option above");
Scanner input = new Scanner(System.in);


int firstInput = input.nextInt();
switch(firstInput){
	

	case 1: phoneBookMenu();break;

	case 2: messages();break;

	case 3: chat();break;

	case 4: callRegister();break;	

	case 5: tones();break;

	case 6: setting();break;

	case 7: callDivert();break;

	case 8: games();break;

	case 9: calculator();break;

	case 10: reminder();break;

	case 11: clock();break;

	case 12: profiles();break;

	case 13: simServices();break;

	case 14: exit();break;

}

}

public static void phoneBookMenu(){
Scanner input = new Scanner(System.in);
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

 System.out.println("click an options");
 int input1 = input.nextInt();


}
public static void messages(){
Scanner input = new Scanner(System.in);
System.out.println("""

		MESSAGES-->
                    1-> Write message
                    2-> Inbox
                    3-> Outbox
                    4-> Picture messages
                    5-> Templates
                    6-> Smilets
                    7-> Message setting
                    8-> Info service
                    9-> Voice mailbox number
                    10-> service command editor""");

System.out.println("click an options");
int input2 = input.nextInt();
switch(input2){

case 8: System.out.println("""                                                  	1 ->Type of view
	2 ->Momory status
""");
}

}

public static void chat(){
Scanner input = new Scanner(System.in);
System.out.println("""

1-> Chat
""");


System.out.println("click an options");
int input3 = input.nextInt();

}


public static void callRegister(){
Scanner input = new Scanner(System.in);
System.out.print("""

			CALL REGISTER-->
                             1-> Missed calls
                             2-> Received calls
                             3-> Dialled call
                             4-> Erase recent calls
                             5-> Show call duration
                             6-> Show call cost
                             7-> call cost setting 
                             8-> Prepaid credit

""");
System.out.println("click an options");
int input12 = input.nextInt();

		     
}

public static void tones(){
Scanner input = new Scanner(System.in);
System.out.println("""

				TONES-->
                           
                                  1: Ringing tone
                                  2: Ringing volume
                                  3: Incoming alart
                                  4: Composer
                                  5: Message alart tone
                                  6: Keypad tones
                                  7: Warning and game tone
                                  8: Vibrating alart
				  9: Screen saver
""");
System.out.println("Select an option from above number");
int input4 = input.nextInt();
}

public static void setting(){
Scanner input = new Scanner(System.in);
System.out.println("""

				SETTING-->
                                 1-> Call settings
                                 2-> Phone setting
                                 3-> Security setting 
                                 4-> Restore factory setting

""");
System.out.println("Select an option from above number");
int input5 = input.nextInt();
}


public static void callDivert(){
Scanner input = new Scanner(System.in);
System.out.println("""


1-> Call divert
""");
System.out.println("Select an option from above number");
int input6 = input.nextInt();
}


public static void games(){
Scanner input = new Scanner(System.in);
System.out.println("""

1-> Games

""");
System.out.println("Select an option from above number");
int input7 = input.nextInt();
}


public static void calculator(){
Scanner input = new Scanner(System.in);
System.out.println("""

1-> Calculator

""");
System.out.println("Select an option from above number");
int input8 = input.nextInt();
}

public static void reminder(){
Scanner input = new Scanner(System.in);
System.out.println("""

1-> Reminder

""");
System.out.println("Select an option from above number");
int input9 = input.nextInt();
}

public static void clock(){
Scanner input = new Scanner(System.in);
System.out.println("""


		CLOCK-->
                        1-> Alarm Clock
                        2-> Clock setting
                        3-> Date setting 
                        4-> Stopwatch
                        5-> Countdown timer
                        6-> auto update of date time
""");
System.out.println("Select an option from above number");
int input10 = input.nextInt();
}

public static void profiles(){
Scanner input = new Scanner(System.in);
System.out.println("""

1 -> Profile

""");
System.out.println("Select an option from above number");
int input11 = input.nextInt();
}


public static void simServices(){
Scanner input = new Scanner(System.in);
System.out.println("""

1 -> SIM services

""");
System.out.println("Select an option from above number");
int input12 = input.nextInt();
}

public static void exit(){
Scanner input = new Scanner(System.in);
System.out.println("Thanks. GOOD BYE");
}

}