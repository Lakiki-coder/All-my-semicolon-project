import java.util.Scanner ;
public class NokiaMannual {

public static void main(String [] args){
Scanner scan = new Scanner(System.in);
int menu1 = 0;
while(menu1 != 14){ 


		System.out.println("""
			
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

	System.out.println("Select a number from above");
	menu1 = scan.nextInt();
	switch(menu1){
	
	case 1:	int menu2 = 0;
	while(menu2 != 15){

		 System.out.print("""
     PHONE BOOK-->
                    1->search
                    2->Service Nos
                    3->Add name
                    4->Erasecl
                    5->Edit
                    6->Assign tone
                    7->Send b'card
                    8->Option
                    9->Speed dials
                    10->Voice tags""");
}      
                    System.out.print("Select an option from above");
                    menu2 = scan.nextInt();
		    switch(menu2){

	       
	case 1:	System.out.println("Search");break;
	case 2: System.out.println("Service Nos");break;
	case 3: System.out.println("Add name");break;
	case 4: System.out.println("Erase");break;
	case 5: System.out.println("Edit");break;
	case 6: System.out.println("Assign tone");break;
	case 7: System.out.println("Send b'card");break;
	







     
    }
    }
   }
  }
 }
