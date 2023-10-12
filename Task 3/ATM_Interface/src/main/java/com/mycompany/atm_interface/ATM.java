/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atm_interface;

import java.util.Scanner;

/**
 *
 * @author anass
 */
public class ATM extends UserAccount {

    public static void main(String[] args) {

        System.out.println("\\t\\t***Welcome to the ATM Machine***");
        int choice = 0;
        while (choice < 4) {

            System.out.println("\nPress 1 for Withdraw."
                    + "\nPress 2 for Deposite."
                    + "\nPress 3 for Check balance."
                    + "\nPress 4 for Exit.");
            Scanner sc = new Scanner(System.in);

            choice = sc.nextInt();

            if (choice > 4 || choice < 1) {

                System.out.println("Invalid choice, Please Choose again.");
                choice = sc.nextInt();
            }

            switch (choice) {

                case 1 -> {
                    System.out.println("How mouch do you want to Withdraw?");
                    Scanner sc1 = new Scanner(System.in);
                    int amount = sc1.nextInt();
                    boolean transaction = withdraw(amount);
                    if (!transaction) {
                        System.out.println("\n\nTransaction Failed due to Insufficent Balance.");

                    } else {
                        System.out.println("\n\nTransaction Successfull, Collect your cash from the tray below.");
                        checkBalance();
                    }
                }
                case 2 -> {
                    System.out.println("How mouch do you want to Deposite?");
                    Scanner sc2 = new Scanner(System.in);
                    int amount_D = sc2.nextInt();
                    deposite(amount_D);

                    checkBalance();
                }
                case 3 -> {
                    checkBalance();
                }
                case 4 -> {
                    break;
                }
            }
        }

        System.out.println("\nThank You for Using Our ATM.");

    }

}
