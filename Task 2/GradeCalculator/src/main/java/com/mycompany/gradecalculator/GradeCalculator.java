/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gradecalculator;

import java.util.Scanner;

/**
 *
 * @author anass
 */
public class GradeCalculator {
    public static void main(String[] args) {
        System.out.println("\t***Welcome to the Student Grade Calculator*** \n\nEnter Student's Name: ");
    
    Scanner sc = new Scanner(System.in);
    String S_name = sc.nextLine();
    
    System.out.println("Enter total Number of Courses: ");
    int totalCourses = sc.nextInt();    
    int marksObtained = 0;
        for (int i = 1; i <= totalCourses; i++) {
            System.out.println("\nEnter course no "+i+" marks obtained out of 100: ");
            marksObtained+=sc.nextInt();
            
        }
        
        int avgPercentage= marksObtained/totalCourses;
        
        System.out.println("\n\n");
        if(avgPercentage <= 100 && avgPercentage >= 90)
            System.out.println(S_name +" Your Grade is A+");
        else if(avgPercentage<=89 && avgPercentage>=80)
            System.out.println(S_name +" Your Grade is A");
        else if(avgPercentage<=79 && avgPercentage>=70)
            System.out.println(S_name +" Your Grade is B");
        else if(avgPercentage<=69 && avgPercentage>=60)
            System.out.println(S_name +" Your Grade is C");
        else if(avgPercentage<=59 && avgPercentage>=50)
            System.out.println(S_name +" Your Grade is D");
        else if(avgPercentage<=49)
            System.out.println(S_name +" Your Grade is F");
        
        System.out.println("Your Total marks are: " + marksObtained + " out of "+totalCourses*100+"\nYour Average Percentage is: "+ avgPercentage);
        
        
    }
}
