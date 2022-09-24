import java.util.Scanner;
import java.util.Random;
/*
 * Programmer Name:         Henry Nguyen 
 * Class:                   1068
 * Section:					4
 * Due Date:                Monday, September 26, 2022
 * Assignment:              Assignment 4
 * Assignment Name:         A Game
 * Assignment Description: 	
 */

public class Game {
	public static Scanner input = new Scanner (System.in);//Declare Scanner as public object 
	
	public static void main(String[] args) {
		game_intro();
		continue_quit();
		// user_move();
		// computer_move();
		
		
		game_rules(user_move(), computer_move());
		
		
		
		
		System.out.println("Do you want to play another round?");
		continue_quit();
		
		
		
		
		
		/*
		int result = game_rules(user_move(), computer_move());;
		System.out.println("Result is: "  + result);
		*/
		

		
	}
	
	
	/*
	public static int validate_input ( String u_move) {
		
		if (u_move.substring(0, 1) == input.next().toUpperCase()) {
			
			return 1;
		}
		else if((u_move.substring(1)) ==  input.next().toLowerCase()){
			return 1;
			
		}
		/*
		else if ( u_move.substring(0, 1) != input.next().toUpperCase() && u_move.substring(1) !=  input.next().toLowerCase() ) {
			System.out.println("Invalid!");
			return 0;
		}
		
		
		
		
		
		return 0;
		
		
	}

	
	public static void winner () {
	
		
		String computermove = computer_move();
		String usermove = user_move ();
		
		String validate_result = validate_input (usermove);
		
	}
	*/
	public static void quit( int game_times, int win_times) {
		
		int lose_times = game_times - win_times;
		System.out.println("Game time: " + game_times);
		System.out.println("Win time: " + win_times);
		System.out.println("Lose time " + lose_times);
		
		
		
		
	}
	
	
	public static void game_rules ( String move, String c_move ) {
		
		int user_wintime = 0;
		
		if ( move.equals (c_move) ) {
			System.out.println("TIE! Computer won!");
		
		}
		if (move.equals("Skadis")) {
				if((c_move.equals("Hovolm") || (c_move.equals("Klyket")))) {
					System.out.println("User won!");
					System.out.println("Winner is user");
	
					System.out.println("User won times: " + (user_wintime++));
				
			
				}
				else {
					System.out.println("User lost!");
					System.out.println("Winner is computer");

				}
				
		}
		
		if (move.equals("Klyket")) {
			if ((c_move.equals("Tjusig") || (c_move.equals("Hovolm")))) {
				System.out.println("User won!");
				System.out.println("Winner is user");
				user_wintime++;
			
			}
			else {
				System.out.println("User lost!");
				System.out.println("Winner is computer");
				
			}
		}
		
		if (move.equals("Tjusig")) {
			if ((c_move.equals("Pershult") || (c_move.equals("Skadis")))) {
				System.out.println("User won!");
				System.out.println("Winner is user");
				user_wintime++;
		
			}
			else {
				System.out.println("User lost!");
				System.out.println("Winner is computer");
		
			}
		}
		
		if (move.equals("Pershult")) {
			if ((c_move.equals("Klyket") || (c_move.equals("Skadis")))) {
				System.out.println("User won!");
				System.out.println("Winner is user");
				user_wintime++;
	
			}
			else {
				System.out.println("User lost!");
				System.out.println("Winner is computer");
			
			}
		}
		
		if (move.equals("Hovolm")) {
			if ((c_move.equals("Pershult") || (c_move.equals("Tjusig")))) {
				System.out.println("User won!");
				System.out.println("Winner is user");
				user_wintime++;
			
			}
			else {
				System.out.println("User lost!");
				System.out.println("Winner is computer");
				
			}
		}
		
		
	}
	
	
	
	public static String computer_move() {
		String c_move = null;
		Random generator = new Random ();
		int number = generator.nextInt(4);
		
		switch (number) {
		
			
			case 0: c_move = "Skadis"; System.out.println("Computer move: " + c_move); break;
			case 1:	c_move = "Tjusig"; System.out.println("Computer move: " + c_move); break;
			case 2: c_move = "Klyket"; System.out.println("Computer move: " + c_move); break;
			case 3: c_move = "Hovolm"; System.out.println("Computer move: " + c_move); break;
			case 4: c_move = "Pershult"; System.out.println("Computer move: " + c_move); break;
		
		}
		return c_move;
		
	}
	
	public static String user_move () {
		
		System.out.println("Please enter a move:");
		String u_move = input.next();

		if (!u_move.equals("Skadis") && !u_move.equals("Tjusig") && !u_move.equals("Klyket") && !u_move.equals("Hovolm") && !u_move.equals("Pershult")) {
			System.out.println("INVALID! Please enter a valid Move: ");
			u_move = input.next();
			System.out.println("You entered: " + u_move);
		}
		return u_move;
		
	}
	
	
	public static void continue_quit () {
		
		System.out.println("Type 'y' to play or 'n' to quit: ");
		char respond = input.next().charAt(0);
		System.out.println("You entered: " + respond);
		
		while (respond != 'y' && respond != 'n') {
			System.out.println("Invalid. Type 'y' to play or 'n' to quit: ");
			respond = input.next().charAt(0);
			System.out.println("You entered: " + respond);
		}
		
		if (respond == 'y') {
			System.out.println("Let's begin Player!");
			//user_move();
		}
		else if ( respond == 'n') {
			
			System.out.println("See you again soon!");
			System.exit(0);
	
		}
	}
	
	public static void game_intro () {
		System.out.println("The rules of the game are: ");
		System.out.println("Pershult beats Klyket, Skadis\n");
		System.out.println("Klyket beats Tjusig, Hovolm\n");
		System.out.println("Tjusig beats Pershult, Skadis\n");
		System.out.println("Skadis beats Hovolm, Klyket\n");
		System.out.println("Hovolm beats Pershult, Tjusig\n");
	}
	
	
}
