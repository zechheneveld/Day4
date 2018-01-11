package com.company;

public class ArrayLoops {

    public static void main(String[] args) {
    String[] months = {"Jan", "Feb", "Mar", "Apr", "May", "June", "July", "Aug", "Sept", "Oct", "Nov", "Dec"};
// Arrays start at 0, not 1: A array is a list of strings
        // Arrays start when [] is entered
        //ex.
//        Boolean[] list = {true, false, true, false}
//        int[] monthsNum = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};

// to print Jan, you must enter 0
    System.out.println(months [0]);

    //Basic Loops
        //       index      How long      What count?
        //  for(_____ ,   ___________  ,  _________ ){

        for(int index = 0; index < 10; index++) {
            System.out.println("Hello Beta! " + index);
            // usually the middle part is the only part changing
            // ++ just shows that it adds 1 each time
        }
            for(int index = 0; index < 10; index++) {
                System.out.println("Hello Beta! " + index);
                if (index == 0) {
                    System.out.println("Hey");
                } else {
                    System.out.println("Goodbye");
                }
                }
//months.length = 12 because there are 12 months in a year
//        notes: month [0] = "Jan"
//                month [11] = "Dec"
                for(int i = 0; i < months.length; i++){
                    System.out.println(months[i]);
                }

            }

        }