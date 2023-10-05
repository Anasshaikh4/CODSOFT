/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.number_game;
import java.util.*;  
import static java.lang.Thread.sleep;


/**
 *
 * @author anass
 */
public class Game {
    
    public static void main(String[] args) throws InterruptedException {
        
    
        
        System.out.println("\t\t*** Welcome to the Number Game: ***\nInstructions for Playing are as follow:-\n"
                + "\n1)Enter a number between 1 to 100 & press Enter.\n"
                + "2)You are given maximum 5 tries to guess a number.\n"
                + "3)If you guessed it right, you WON & the game ends.\n\n");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Name: ");
        String userName = sc.nextLine();
        
        
       
        int result = Run();
        
    }
    
    static int Run() throws InterruptedException{
        
        int orignalNum;
        int userNum;
        
       orignalNum = (int) (Math.random()*(101-1+1)+1); 
        orignalNum=59;
        System.out.println(orignalNum);
        
        for(int i = 1; i<=5;i++){
            
            System.out.println("Enter Your "+i+" Guess: ");
            Scanner sc = new Scanner(System.in);
            userNum=sc.nextInt();
            
            String approach=(orignalNum>userNum) ? ("Low"):("High");
            
            if(orignalNum==userNum){
                System.out.println("Your "+i+" Guess is Correct, You Won.\n"
                        + "Your Score is "+(5-i)+" out of 5.");
                sleep(1000);
                return 0;
            }
            System.out.println("Your "+i+" Guess is wrong, Try again:\n"
                    + "Tip: Your Guess was "+ approach +" . ");
            sleep(1000);
            
            if(i==5){
                System.out.println("Your Score is 0 (Zero) out of 5.");
            }
        }
        
        
        return 0;
    }
}
