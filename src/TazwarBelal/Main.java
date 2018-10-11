package TazwarBelal;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner input = new Scanner(System.in) ;
        System.out.print("What is your name?");
        String name = input.nextLine();
        System.out.println("Hello"+" "+name);
        System.out.print("Guess My Number between 1 and 10");

        while(!(input.nextLine().equals("3"))){
            System.out.println("Guess my number again"+" "+ name);
        }
        System.out.println("You guessed my number"+" "+name);
    }
}
