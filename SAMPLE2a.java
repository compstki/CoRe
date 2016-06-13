// game of pontoon, try to get total card value of 21
import java.util.*;
import javax.swing.*;
public class SAMPLE2a  {
    // store card values, update value to 0 when card is played
    int[] myCards = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10};

    Random randomno = new Random();        // random number generator
    int firstPick, firstCard, anotherPick, anotherCard, total;
    String response = "Y";                 // Y/y for another card

    public void sampleMethod() {
        // deal the first card
        System.out.print("Deal first card: ");
        firstPick = randomno.nextInt(12);         // pick position
        firstCard  = myCards[firstPick];          // get card value
        myCards[firstPick] = 0;                   // mark as chosen
        total = firstCard;                        // update total
        System.out.println(firstCard);            // tell player
        System.out.println("total: " + total);    // card value, total

        System.out.print("Deal another card: ");  // deal again
        dealCard();                               // call method: deal

        // loop until bust or pontoon or player quits
        while ((total < 21) && (response.equals("Y"))) {
            response = JOptionPane.showInputDialog("Twist? (Y/N)");
            if (response.equals("Y")) {
                //deal again
                System.out.print("Deal another card: ");
                dealCard();
                // check total to decide what happens next
                if (total > 21) {
                    System.out.println("Bust!");
                }
                if (total == 21) {
                    System.out.println("Pontoon! " + total);
                }
            }
        }
        System.out.println("Goodbye!");
    }

    // method to deal another card
    public void dealCard() {
        anotherPick = randomno.nextInt(12);       // choose position
        while (myCards[anotherPick] == 0) {       // already played?
            anotherPick = randomno.nextInt(12);   // pick again
        }
        anotherCard  = myCards[anotherPick];      // get card value
        myCards[anotherPick] = 0;                 // mark as played
        total = total + anotherCard;              // update total
        System.out.println("card: " + anotherCard);// display value
        System.out.println("total: " + total);    // display total
    }
}