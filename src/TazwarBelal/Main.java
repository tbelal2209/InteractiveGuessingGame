package TazwarBelal;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int x = Math.random(0,10);
        Scanner input = new Scanner(System.in) ;
        System.out.print("What is your name?");
        String name = input.nextLine();
        System.out.println("Hello"+name);
        System.out.print("Guess My Number");

        while(!(x==3)){
            System.out.println("Guess my number again"+name);
        }
        System.out.println("You guessed mu number"+name);
    }
}
