/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atm_interface;

/**
 *
 * @author anass
 */
public class UserAccount {

    private static double amount = 500000;

    static boolean withdraw(int amount) {

        if (amount > UserAccount.amount) {
            return false;
        }
        UserAccount.amount = UserAccount.amount - amount;

        return true;

    }

    static void deposite(int amount) {

        UserAccount.amount = UserAccount.amount + amount;

    }

    static void checkBalance() {

        System.out.println("\nYour Present Account Balance is: " + UserAccount.amount);

    }
}
