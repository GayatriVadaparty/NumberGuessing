

import javax.swing.*;
 
public class NumberGuessing
 {
    public static void main(String[] args) 
       {
        int computerNumber = (int) (Math.random()*1000 + 1);
        int userAnswer = 0;
        
        int count = 1;

        while (userAnswer != computerNumber)
        {
            String response = JOptionPane.showInputDialog(null,"Enter a guess between 1 and 1000", "Guessing Game", 3);
            userAnswer = Integer.parseInt(response);
            JOptionPane.showMessageDialog(null, ""+ determineGuess(userAnswer, computerNumber, count));
            count++;
        }  
    }

    public static String determineGuess(int userAnswer, int computerNumber, int count)
    {
        if (userAnswer <=0 || userAnswer >100) {
            return "Your guess is invalid";
        }
        else if (userAnswer == computerNumber ){
            System.out.println("The correct guess would be " + computerNumber);
            return "Correct!\nTotal Guesses: " + count;
        }
        else if (userAnswer > computerNumber) {
            return "Your guess is  high, try again.\nTry Number: " + count;
        }
        else if (userAnswer < computerNumber) {
            return "Your guess is low, try again.\nTry Number: " + count;
        }
        else {
            return "Your guess is incorrect\nTry Number: " + count;
        }
    }
}