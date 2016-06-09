import java.util.*;
import javax.swing.*;

public class SAMPLE2a
{
    int[] myCards = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10};
    public void sampleMethod()
    {
        Random randomno = new Random();

        int pick1, card1, pick2, card2, total;
        boolean gameOver;
        String response;

        pick1 = randomno.nextInt(12);
        card1  = myCards[pick1];
        myCards[pick1] = 0;
        
        total = card1;
        System.out.println("card: " + card1);
        System.out.println("total: " + total);

        pick2 = randomno.nextInt(12);
        while (myCards[pick2] == 0) {
            pick2 = randomno.nextInt(12);
        }
        card2  = myCards[pick2];
        myCards[pick2] = 0;

        total = total + card2;
        System.out.println("card: " + card2);
        System.out.println("total: " + total);

        gameOver = false;

        while (gameOver == false) {
            response = JOptionPane.showInputDialog("Twist? (Y/N)");
            while ( !(response.equals("Y")) && !(response.equals("N"))){
                response = JOptionPane.showInputDialog("enter Y/N");
            }
            if (response.equals("Y")) {
                pick2 = randomno.nextInt(12);
                while (myCards[pick2] == 0) {
                    pick2 = randomno.nextInt(12);
                }
                card2  = myCards[pick2];
                myCards[pick2] = 0;
                total = total + card2;
                System.out.println("card: " + card2);
                System.out.println("total: " + total);

                if (total > 21) {
                    System.out.println("Bust!");
                    gameOver = true;
                }
            }
            else
            {
                gameOver = true;

            }
        }
        System.out.println("Goodbye!");
    }

}
