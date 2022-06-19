package Game.src;
import java.util.Scanner;

public class User_Interface {
    
    // Allows program to aquire input.
    public Scanner input = new Scanner(System.in);

    // A list of valid actions the player can take.
    private String[] validChoices = {"W", "A", "S", "D", "E", "B", "P", "Q"};

    // The player's current desired choice. 
    private String choice = "";

    // Validates the player's input.
    public boolean validChoice(String c){
        for (String x : validChoices){
            if (x.equals(c)){
                return true;
            }
        }
        
        return false;
    }
    
    // Gets the player's desired action.
    public String getChoice(){
        choice = input.next().toUpperCase();

        while(!validChoice(choice)){
            System.out.print("Please enter a valid option: ");
            choice = input.next().toUpperCase();
        }
        return choice;
    }
    
    public String[] getValidChoices(){ return validChoices; }

    // Displays the available actions the player can take.
    public void displayChoices(){
        System.out.println("Move: W / A / S / D");
        System.out.println("Interact: E");
        System.out.println("Check Bag: B");
        System.out.println("Display Board: P");
        System.out.println("Quit: Q");
        System.out.print("What will you do?: ");
    }
}
