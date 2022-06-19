package Game.src;
/*
5/24/22
Runs the actual game. (hopefully)
Interprets the player's input.
*/
import Game.*;

import java.util.Scanner;

public class Play_Game {
    public static boolean playGame = true;
    public static Board board = new Board();
    public static Player player = new Player();
    public static User_Interface ui = new User_Interface();

    // Interprets the player's input and carries out the desired action.
    public static boolean doAction(String action){
        String[] possibleActions = ui.getValidChoices();
        int choice = 0;

        for (int i = 0; i < possibleActions.length; i++){
            if (possibleActions[i].equals(action)){
                choice = i;
                break;
            }
        }

        if (choice < 4){
            player.move(choice);
        } else if (choice == 4){
            //checkForInteractable();
        } else if (choice == 5){
            //displayBag();
        } else if (choice == 6){
            board.display();
        } else if (choice == 7){
            // Stops the game.
            System.out.println("Thanks for playing! Come again soon! :)");
            return false;
        }
        // Continues the game.
        return true;
    }

    public static void main(String[] args){
        board.setBoard();
        player.setCoord(4, 4);

        while (playGame){
            board.setTile(player.getCoord(), player.getLetter());
            board.display();
            ui.displayChoices();
            String action = ui.getChoice();

            playGame = doAction(action);
        }
    }
}
