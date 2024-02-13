import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

       // Exercise (Loop)
        //--------------------------------1---------------------------------
        /*1.Write a program that prints the numbers from 1 to 100 such that:
        If the number is a multiple of 3, you need to print "Fizz" instead of that
        number.If the number is a multiple of 5, you need to print "Buzz" instead of that
        number. If the number is a multiple of both 3 and 5, you need to print "FizzBuzz"
        instead of that number.*/

//            for (int i = 1; i <= 100; i++) {
//                if(i % 3 == 0){
//                System.out.println("Fizz");}
//                else if (i % 5 == 0){
//                    System.out.println("Buzz");}
//                else if(i % 3 == 0 && i % 5 == 0){
//                    System.out.println("FizzBuzz");}
//                else {
//                    System.out.println(i);}
//            }

        //--------------------------------2----------------------------------
       /* 2.Write a Java program to reverse a string.
        Test Data: Input a string: The quick brown fox Expected Output: Reverse
        string: xof nworb kciuq ehT*/

//        System.out.print("Input a string:");
//        String str = input.nextLine();
//
//        StringBuilder reversed = new StringBuilder();
//        int i = str.length() - 1;
//        while (i >= 0) {
//            reversed.append(str.charAt(i));
//            i--;
//        }
//        System.out.println("Reverse string:" + reversed.toString());

        //--------------------------------3----------------------------------
        /*3.Write a program to find the factorial value of any number entered
        through the keyboard.*/
//        System.out.print("Enter any number to find the factorial value :");
//        int num = input.nextInt();
//        int i=1;
//        int factorialValue=1;
//        while (i <= num) {
//            factorialValue=factorialValue * i;
//            i++;
//        }
//        System.out.println("factorial value="+factorialValue);

        //--------------------------------4------------------------------------
        /*4.Two numbers are entered through the keyboard. Write a program to find
        the value of one number raised to the power of another. (Do not use Java
        built-in method)*/
//        System.out.println("Enter Two numbers:");
//        int num1= input.nextInt();
//        int num2= input.nextInt();
//        int i=1;
//        int power=1;
//        while (i <= num2) {
//            power *= num1;
//            i++;
//        }
//            System.out.println("num1 raised to the power of num2="+" "+power);

        //--------------------------------5------------------------------------
        /*5.Write a program that reads a set of integers, and then prints the sum of
        the even and odd integers.*/
//        System.out.println("Enter integers or to stop process 0:");
//
//        int sumEven = 0;
//        int sumOdd = 0;
//
//        int num;
//        do {
//            num = input.nextInt();
//            if (num != 0) {
//                if (num % 2 == 0) {
//                    sumEven += num;
//                } else {
//                    sumOdd += num;
//                }
//            }
//        } while (num != 0);
//
//
//        System.out.println("Sum of the even : " + sumEven);
//        System.out.println("Sum of the odd : " + sumOdd);

        //--------------------------------6------------------------------------
        /*6.Write a program that prompts the user to input a positive integer. It
        should then output a message indicating whether the number is a prime
        number*/
//        System.out.print("Enter a positive integer: ");
//        int number = input.nextInt();
//
//        boolean isPrime = true;
//
//        if (number <= 1) {
//            isPrime = false;
//        } else {
//            for (int i = 2; i < number; i++) {
//                if (number % i == 0) {
//                    isPrime = false;
//                    break;
//                }
//            }
//        }
//
//        if (isPrime) {
//            System.out.println(number + " is a prime number.");
//        } else {
//            System.out.println(number + " is not a prime number.");
//        }

        //--------------------------------7------------------------------------
       /* Use a for loop to print headings for four weeks (Weeks 1 - 4). Then use
        another for loop to print the days (Days 1 -7) for each week */
//        for (int week = 1; week <= 4; week++) {
//            System.out.println("Week " + week);
//
//            for (int day = 1; day <= 7; day++) {
//                System.out.println("Day" + day);
//
//            }
//        }

        //--------------------------------8-------------------------------------
       /* 8.Write a program thats check if the word is a palindrome or not. hint: A
        string is said to be a palindrome if it is the same if we start reading it from
        left to right or right to left.*/
//
//        System.out.print("Enter a word: ");
//        String word = input.nextLine();
//
//        String reversedWord = "";
//        for (int i = word.length() - 1; i >= 0; i--) {
//            reversedWord += word.charAt(i);
//        }
//
//        if (word.equals(reversedWord)) {
//            System.out.println("The word " + word + " is a palindrome.");
//        } else {
//            System.out.println("The word " + word + " is not a palindrome.");
//        }









           }

            }
































