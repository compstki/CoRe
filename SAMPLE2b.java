// game of pontoon, try to get total card value of 21
import java.util.*;
import javax.swing.*;
public class SAMPLE2b  {
    // store card values, update value to 0 when card is played
    int[] myCards = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10};

    Random randomno = new Random();  // random number generator
    int pick, card, total;           // position, value, total score
    boolean gameOver;                // track game progress
    String response;                 // Y/y for another card

    public void sampleMethod() {
        dealCard("Deal first card: ");  // call method, deal 1st card
        dealCard("Deal second card: "); // call method, deal 2nd card

        // loop until game over
        gameOver = false;               // start game
        while (gameOver == false) {
            // display total and prompt user to respond
            System.out.println("Total: " + total);
            response = JOptionPane.showInputDialog("Y/y to twist)");
            // check if player wants another card
            if ((response.equals("Y"))||(response.equals("y"))) {
                // deal again
                dealCard("Deal another card: ");
                // check total to decide what happens next
                if (total > 21) {
                    System.out.println("Bust! " + total);
                    gameOver = true;
                }
                else {
                    if (total == 21) {
                        System.out.println("Pontoon! " + total);
                        gameOver = true; 
                    }
                }
            }
            // player wants to stop (pressed key other than Y/y)
            else {
                System.out.println("Final score: " + total);
                gameOver = true;
            }
        }
        System.out.println("Goodbye!");
    }

    // method to deal another card, message describe which deal
    public void dealCard(String message) {
        System.out.print(message);       // dealing message
        pick = randomno.nextInt(12);     // choose card porition
        while (myCards[pick] == 0) {     // check if already played
            pick = randomno.nextInt(12); // pick another position
        }
        card  = myCards[pick];           // get value of card
        myCards[pick] = 0;               // mark as played
        total = total + card;            // update total
        System.out.println(card);        // display card value
    }
}