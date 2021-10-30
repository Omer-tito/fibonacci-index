
//FRESH START!!
package com.fibo;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        double a = 1, b = 1, c = 0, i = 1;
        boolean isTh = false, answer = true;
        while (answer) {
            System.out.println("please enter A whole positive whole index number to receive the correct fibonacci's sequence result");
            int indexNum = userInput.nextInt();

            while (indexNum < 1) {
                System.out.println("that is not a whole & positive number. please try again");
                int tryAgain = userInput.nextInt();
                indexNum = tryAgain;
            } if (indexNum == 1) {
                System.out.println("the " + indexNum + "st fibonacci's index is :" + c);
            } else if (indexNum == 2) {
                System.out.println("the" + indexNum + "nd fibonacci's index is :" + a);
            } else if (indexNum == 3) {
                System.out.println("the " + indexNum + "rd fibonacci's index is :" + a);
            } else {
                isTh = true;
                while (indexNum > i) {
                    c = a + b;
                    a = b;
                    b = c;
                    i++; }
            }
            if (isTh) {
                System.out.println("the index of the #" + indexNum + "th is:" + a);
            }
            System.out.println("would you like to try again? yes/no (anything else)");
            String yesNO = userInput.next();
            if (yesNO.equals("yes")) {
                System.out.println("again!");
            } else {
                answer = false;
                    System.out.println("thanks for playing!");
                }
        }
    }
    }




