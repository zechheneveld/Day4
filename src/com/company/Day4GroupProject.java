package com.company;

import java.util.Scanner;

public class Day4GroupProject {

    public static void main(String[] args) {

        System.out.println("Welcome to Happy Employee System. We provide the salary information for each employee based on specific information entered by that employee.");

        Boolean ask = true;
        while(ask){

            //Store these questions in an Array, and use a loop to ask the user each question.
            //Use another array to store the user responses.

        System.out.println("Please enter employees first name");

        Scanner robot = new Scanner(System.in);

        String firstName = robot.nextLine();

        System.out.println("Please enter employee last name");

        String lastName = robot.nextLine();

        System.out.println("Please enter employee number");

        String employeeField = robot.nextLine();

        System.out.println("Please enter employee annual salary");

        String annualSalary = robot.nextLine();

        int convertedNumber = Integer.parseInt(annualSalary);

        int Month = 12;
        int bimonth = 24;
        int biweek = 26;

        System.out.println("Monthly Pay: " + convertedNumber/Month);
        System.out.println("BiMonthly Pay: " + convertedNumber/bimonth);
        System.out.println("Biweekly Pay: " + convertedNumber/biweek);

        System.out.println("Would you like to view another employee's salary?");

        Scanner robot2 = new Scanner(System.in);

        String answerByUser = robot2.nextLine();

        //Research how to have multiple conditions, specifically the 'or' operator. Then use that information,
        //to handle the case of 'YES', 'y', and 'Yes'.

        if(answerByUser.equals("yes")) {
            ask = true;
        } else {
            ask = false;
        }


        }

    }
}
