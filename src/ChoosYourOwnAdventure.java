/*Joshua Tucker
 * This is a small text based adventure game
 */
import java.util.Scanner;

public class ChoosYourOwnAdventure {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		String choice;
		
		//Game opening
		System.out.println("Welcome to the adventure of a lifetime");
		System.out.println("You've been dared to walk into a creepy house, "
				+ " of course you accept");
		System.out.println("You Enter and the door slams behind you");
		System.out.println(" You see Stairs leading up, and a door to the kitchen");
		//First choice
		System.out.print("Where Would you like to go, upstairs or to the kitchen or you can quit\n Enter Your Choice");
		choice = keyboard.next();
		
		//UPSTAIRS DECISION TREE
		if(choice.equals("upstairs")){
			System.out.println("Upstairs there is a hallway."
					+ "\nAt the end of the hallway is the master bedroom,"
					+ "\nOff the hallway is a bathroom");
			System.out.println("Where would you like to go ");
			
			choice =keyboard.next();
			if(choice.equals("bedroom")){
				System.out.println("You are in a plush bedroom"
						+ "The bed is unmade."
						+ "\n You then Notice the closet door is ajar."
						+ "\n Would you like to open it, yes or no?");
				
				choice =keyboard.next();
				if(choice.equals("yes")){
					System.out.println("You open the closet door and wham!"
							+ "a cat jumps from the shelf and onto your head");
				}
				if(choice.equals("no")){
					System.out.println(" you leave the building quickly and scared"
							+ " never to return");
				}
			}
			if(choice.equals("bathroom")){
				System.out.println("In the bathroom, water is running from the faucet"
						+ "the window is open and air is blowing"
						+ "\n Next you look at the mirror and realize your reflection is gone."
						+ "\n Do you stay or do you run away?");
				
				choice =keyboard.next();
				if(choice.equals("stay")){
					System.out.println("You decided to stay and explore the rest of the house."
							+ "\n Never to be heard from again");
				}
				if(choice.equals("Runaway")){
					System.out.println("You run away screaming from the house");
				}
			}
		}
		//Kitchen decision tree
		else if (choice.equals("kitchen")){
			System.out.println("In the kitchen there is a long countertop with "
					+ "dirty dishes everywhere.  Off to one side "
					+ "there is, as you'd expect, a refrigerator and a cabinet");
			System.out.println("Would you like to open the cabinet or look in the fridge?");
			
			choice =keyboard.next();
			if(choice.equals("fridge")||choice.equals("refridgerator")){
				System.out.println("You see a lot of food. most of it look pretty nasty "
						+ "but some of it looks really good");
				System.out.println(" Do you take the chance and eat? Yes or No?");
				
				choice =keyboard.next();
				if(choice.equals("Yes")){
					System.out.println("You eat an apple that looks good."
							+ "\n But the apple was poisoned and you died");
				}
				if(choice.equals("No")){
					System.out.println("You dont eat anything and leave the house hungry");
				}
			}
			if(choice.equals("cabinet")){
				System.out.println("the cabinet is empty"
						+ "\n Would you like to leave? Yes or No");
				
				choice =keyboard.next();
				if(choice.equals("Yes")){
					System.out.println("You leave the house and returned home safely");
				}
				if(choice.equals("No")){
					System.out.println("You dont want to leave? Good. Because you are now trapped "
							+ "forever");
				}
			}
		}
		System.out.println("thanks for playing");
	}

}
