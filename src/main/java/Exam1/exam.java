package Exam1;

import java.util.Arrays;
import java.util.Scanner;

public class exam {
    public static void main(String[] args) {
        //Q1
        oddNumbers(); // no sout because void its in oddNumbers method already
        //Q2
        int[] arrayOfNumbers = {17, 20, 22, 35};
        int sum = returnSum(arrayOfNumbers);
        System.out.println("The sum is " + sum);
        //Q3
        int avg = returnAvg(arrayOfNumbers);
        System.out.println("The average is " + avg);
        //Q4
        randomNum();
        //Q5
        int total = evenSum(arrayOfNumbers);
        System.out.println("The total sum of evens are: " + total);
        //Q6
        int volume = cubeVolume(6);
        System.out.println("The volume of the cube is: " + volume);
        //Q7
        int letterS = countLetter("Sally sells seashells by the seashore");
        System.out.println("The amount of letter 'S' is: " + letterS);
        //Q8
        boolean sen = palindrome("kayak");
        System.out.println("It is " + sen + " that this is a palindrome");
        //Q9
        boolean leap = leapCheck(2012);
        System.out.println("It is " + leap + " that this is a leap year");
        //Q10
        trip();




    }// end main
    //Q1
    public static void oddNumbers () { // Void bc we are not doing a return
        for(int i = 10; i >= 1 ; i--)// // decrement because we're counting down
            if (i % 2 != 0) { // "!" means not equal to (Not divisible by 2)
            System.out.println(i);
    }
}
    //Q2
    public static int returnSum (int[] total) {
        int sum = 0;
        for (int num : total) {
            sum += num;
        }
        return sum;
    }
    //Q3
    public static int returnAvg (int[] total) {
        int sum = 0;
        for (int num : total) {
            sum += num;
        }
        return sum/4; // dividing by amount of numbers to get avg
    }
    //Q4
    public static void randomNum () {
        int rand = (int)(Math.random() * 7); // 7 is the limit - math.random function generates random number under the limit
        System.out.println("Your random number is " + rand);
    }
    //Q5
    public static int evenSum (int[] evens) {
        int sum = 0;
        int count = 0;
        for (int num : evens) {
            if (num % 2 ==0) { // If number is divisible by 2
                sum += num;
                count++;
            }
        }
        return sum;
    }
    //Q6
    public static int cubeVolume (int side) {
        int vol = side * side * side; // all sides of a cube are equal

        return vol;
    }
    //Q7
    public static int countLetter (String input) {
        int character = 0;
        for(int x =0; x < input.length(); x++) {
            char letter = Character.toLowerCase(input.charAt(x));
            if (letter == 's') { // use of char because we're checking single charcter
                character++;
            }
        }
        return character;
    }
    //Q8
    public static boolean palindrome (String sentence) {
        int left = 0;
        int right = sentence.length() -1;
        while (left < right) {
            if (sentence.charAt(left) != sentence.charAt(right)) { // return false if characters are not equal
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    //Q9
    public static boolean leapCheck (int year) {
        if (year % 4 ==0) {
            if (year % 100 !=0 || year % 400 ==0) { // Not all years that are divisible by 4 are leap years
                return true; // leap years are divisible by both 4 & 400
            }
        }
        return false;
    }
    //Q10
    public static void trip () {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to Philadelphia International Airport! Please enter your ticket number");
            int tix = scan.nextInt();
            System.out.println("Please enter your vacation destination");
            String destination = scan.next();
            System.out.println("Now serving customer number " + tix + "." + " Enjoy your trip to " + destination + "!");

    }

}
// end class
