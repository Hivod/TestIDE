/*  Slumpar en int mellan 1-100 och låter användaren gissa numret
    Olof Rydh
    2017-11-06
*/

package com.company;
import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        int randomNumber = (int) Math.ceil(Math.random()*100);
        int guess = 0;
        while(guess < 1 || guess > 100) {
            guess = Integer.parseInt(JOptionPane.showInputDialog("Guess a number between 1-100"));
        }

        if(guess == randomNumber) {
            JOptionPane.showMessageDialog(null, "Correct");
        } else if(guess > randomNumber) {
            JOptionPane.showMessageDialog(null, "Too large");
        } else {
            JOptionPane.showMessageDialog(null, "Too small");
        }
    }
}
