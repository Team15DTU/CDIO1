package spil;
import java.util.Scanner;

/**
 * @author Karl Emil Jeppesen
 * StudyID: s180557
 * Date: 27-09-2018
 * University: DTU
 */
public class Turn {

    Scanner scanner = new Scanner(System.in);
    String input;

    public void turn (Player player, Die die1, Die die2) {
        System.out.println("Press 'r' to roll dice for "+player.name);
        input = scanner.next();
        die1.roll(); // Use the roll function on die1
        die2.roll(); // Use the roll function on die2
        boolean w = false;

        System.out.println("You rolled "+die1.getFaceValue()+" and "+die2.getFaceValue()); // Print out FaceValues of the twe dies
        player.score=player.score+die1.getFaceValue()+die2.getFaceValue(); // Loads the FaceValue into Players Score
        if (die1.getFaceValue() == 1 && die2.getFaceValue() == 1) { // If die1 & die2 are both equal 1 run code below
            player.score = 0; // Players score is set to 0
            System.out.println("You rolled two ones and your score has been reset"); // Explains that the roll of twe 1's have reset the plaers score
        } else if (die1.getFaceValue() == die2.getFaceValue()) { // If die1 & die2 is equal to each other it runs the code below.
            System.out.println("You rolled two similar and get an extra turn!"); // Explains that your roll of two equal facevalues give you an extra turn
            turn(player, die1, die2); // Run a extra turn
        }

    }

}
