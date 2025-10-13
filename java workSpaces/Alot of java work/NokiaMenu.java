import java.util.Scanner ;
public class NokiaMenu {

public static void main(String [] args){
Scanner input = new Scanner(System.in);

String prompt = """

1: Phone book
2: Messages
3: Chat
4: Call register
5: Tone
6: Setting
7: Call divert
8: Games
9: Calculator
10: Reminder
11: Clock
12: Profile
13: SIM services
14: Exit 
""";

System.out.println(prompt);
System.out.println( "Enter a number");
int input1 = input.nextInt(); 

switch(input1){ 
case 1:System.out.println("""
     1: Search
     2: Service nos
     3: Add name
     4: Erase
     5: Edit
     6: Assign tone
     7: Send b'card
     8: Options
     9: Speed dial
    10: Voice tags""");

    System.out.println( "Select an option or Enter 0 to go back");
    int input2 = input.nextInt();
    if (input2 == 1) 
    switch (input2){

  case 1: System.out.println("Search");
           int input3 = 0;
           }else if(input2 == 0)  {System.out.println("""
           1: Search
           2: Service nos
           3: Add name
           4: Erase
  	   5: Edit
           6: Assign tone
           7: Send b'card
           8: Options
           9: Speed dial
           10: Voice tags
""");

}          else if(input2 == 2){System.out.println( "Service nos or\n Enter 0 for home page");
}          else if(input2 == 3){System.out.println( "Add name or\n Enter 0 for home page");
}          else if(input2 == 4){System.out.println( "Erase");
}          else if(input2 == 5){System.out.println( "Edit or\n Enter 0 for home page");
}          else if(input2 == 6){System.out.println( "Assign Tone or\n Enter 0 for home page");
}          else if(input2 == 7){System.out.println( "Send b'card or\n Enter 0 for home page");
}          else if(input2 == 10){System.out.println( "Voice tag or\n Enter 0 for home page");
}          else if(input2 == 9){System.out.println( """Speed dail or\n Enter Select 1 or 2 or 0 for home page
          case 8: System.out.println(""" 
          1->Type of view 
          2-> Memory status
                                           """);
          System.out.println("Enter an options");
                      int input4 = input.nextInt();
                      switch (input4){
                case 1: System.out.println("""
	                Type of view""");
                case 2: System.out.println("""
                        Memory status""");""")
}
                
break;
             
    

}            case 2: System.out.println("""    
	               1: Write messages
                       2: Inbox
                       3: Outbox
                       4: Picture messages
                       5: Templates
                       6: Smileys
                       7: Message Settings
                       8: Info Service
                       9: Voice Mailbox Number
                      10: Service Command Editor """);
                        System.out.println("Enter 0 to return to menu page");
                        int input5 = input.nextInt();
                        switch (input5){
                case 0: System.out.println("""
	                   1: Search
                           2: Service nos
                           3: Add name
                           4: Erase
               	           5: Edit
                           6: Assign tone
                           7: Send b'card
                           8: Options
                           9: Speed dial
                          10: Voice tag""");
                        System.out.println("Enter 00 to return to main menu page");
                        int input6 = input.nextInt();
                        switch (input6){
                case 0: System.out.println("""
                          
                           1: Phone book
                           2: Messages
                           3: Chat
                           4: Call register
                           5: Tone
                           6: Setting
                           7: Call divert
                           8: Games
                           9: Calculator
                           10: Reminder
                           11: Clock
                           12: Profile
                           13: SIM services
                           14: Edit""");
}
}
}







}
}
 




