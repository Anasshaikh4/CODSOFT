package com.mycompany.number_game;

import java.util.*;
import static java.lang.Thread.sleep;

/**
 *
 * @author anass
 */
public class Game {

    public static void main(String[] args) throws InterruptedException {

        System.out.println("""
                           \t\t*** Welcome to the Number Game: ***
                           Instructions for Playing are as follow:-
                           
                           1)Enter a number between 1 to 100 & press Enter.
                           2)You are given maximum 5 tries to guess a number.
                           3)If you guessed it right, you WON & the game ends.
                           
                           """);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Name: ");
        String userName = sc.nextLine();

        boolean result = true;

        do {
            result = Run();

            System.out.println(userName + " do you wish to play Again? Enter yes/No ");
            Scanner sc2 = new Scanner(System.in);
            String again = sc2.nextLine();

            if (!again.equals("yes")) {

                result = false;
            }

        } while (result);

    }

    static boolean Run() throws InterruptedException {

        int orignalNum;
        int userNum;

        orignalNum = (int) (Math.random() * (101 - 1 + 1) + 1);

        for (int i = 1; i <= 5; i++) {

            System.out.println("Enter Your " + i + " Guess: ");
            Scanner sc = new Scanner(System.in);
            userNum = sc.nextInt();

            String approach = (orignalNum > userNum) ? ("Low") : ("High");

            if (orignalNum == userNum) {
                System.out.println("Your " + i + " Guess is Correct, You Won.\n"
                        + "Your Score is " + (5 - (i - 1)) + " out of 5.");
                sleep(1000);
                return true;
            }
            System.out.println("Your " + i + " Guess is wrong, Try again:\n"
                    + "Tip: Your Guess was " + approach + " . ");
            sleep(1000);

            if (i == 5) {
                System.out.println("""
                                   
                                   Your Score is 0 (Zero) out of 5.
                                   
                                   =>The orignal Number was """ + orignalNum);
            }
        }

        return true;
    }
}
