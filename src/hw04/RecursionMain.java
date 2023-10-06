package hw04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RecursionMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int stopGame = 0;
        while (stopGame != 5) {
            System.out.println("Choose a game!");
            System.out.println("1.Bunny Ears\n2. Zeno's Race Paradox\n3.Substrings\n4.Pair Sums\n5.Exit Program");
            int userIn = scanner.nextInt();

            switch (userIn){
                case 1: 
                System.out.println("How many bunnies are on the planet Bunnytopia?");
                int bunnyIn = scanner.nextInt();
                try {
                    System.out.println(Recursion.bunnyEars(bunnyIn));  
                } catch (Exception e) {
                    System.out.println(e);
                }
                break;

                case 2: 
                System.out.println("How many times would you like this to iterate?"); 
                int n = scanner.nextInt();
                System.out.println("Then input how far the runner must run");
                double totalDistance = scanner.nextDouble();
                try {
                    System.out.println(Recursion.zenosRaceParadox(n, totalDistance));
                } catch (Exception e) {
                    System.out.println(e);
                }
                break;

                case 3: 
                System.out.println("Input a sentence.");
                scanner.nextLine();
                String sentence = scanner.nextLine();
                System.out.println("OK, now enter a word or letter inside of the string.");
                String subString = scanner.nextLine();
                try {
                    System.out.println(Recursion.subString(sentence, subString));
                } catch (Exception e) {
                    System.out.println(e);
                } 
                break;

                case 4:
                System.out.println("Enter a sequence of positive integers with -1 to signify the end."); 
                try {
                    List<Integer> list = new ArrayList<>();
                    int input;
                    while ((input = scanner.nextInt()) != -1) {
                        list.add(input);
                    }
                    int[] arr = new int[list.size()];
                    for (int i = 0; i < arr.length; i++) {
                        arr[i] = list.get(i);
                    }
                    List<Integer> sums = new ArrayList<>();
                    System.out.println(Recursion.pairSums(arr, sums));
                } catch (Exception e) {
                    System.out.println(e);
                }
                break;

                case 5: 
                System.out.println("Thank you for Playing!");
                stopGame = 5;
                break;
            }
        }
        scanner.close();
    }
}
