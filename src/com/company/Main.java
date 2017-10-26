package com.company;
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;

/**
 * Created by Veronica Lang on 10/25/2017.
 * randomly pick a value in an array referenced from:
 * https://stackoverflow.com/questions/8065532/how-to-randomly-pick-an-element-from-an-array
 partner is Kiara; first commit? change? is my coding
 */
public class GuessMyNum {
    public static String dogBreeds[] = {"Shiba Inu", "Corgi", "Samoyed", "Golden Retriever", "Chow chows", "Pug",
            "Bernese Mountain Dog", "Akita", "Jack Russell Terrier", "St. Bernard", "French Bulldog", "Terrier",
            "Pomeranian", "Chihuahua", "Beagle", "Husky", "German Shepherd", "Sheep Dog", "Boxer", "Cocker Spaniel",
            "Gabe the dog", "Golden Labrador", "Chinook", "American Eskimo", "Japanese Chin", "Maltese",
            "Norwegian Elkhound", "Papillon", "Poodle", "Pekingese", "Portuguese Water Dog", "Rottweiler",
            "Russell Terrier", "Saluki", "Schipperke", "Dachshunds", "Yorkshire Terrier", "Mexican Hairless Dog",
            "Wirehaired Vizsla", "Wirehaired Pointing Griffon", "Whippet", "Weimaraner", "Vizsla",
            "Treeing Walker Coonhound", "Toy Fox Terrier", "Tibetan Mastiff", "Swedish Vallhund",
            "Soft-coated Wheaten Terrier", "Shih Tzu", "Clifford the big red dog"};
    public static int dogNum[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23,
            24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50};
    public String goal;
    public int g;
    public int guessIndex;

    public void list() {
        Arrays.sort(dogBreeds);
        for (int index = 0; index < dogBreeds.length; index++)
            System.out.println(dogBreeds[index]); //This is just printing out the list
        g = new Random().nextInt(dogNum.length); //this was referenced
        goal = dogBreeds[g];

    }

    public void gimmeGuess() {
        System.out.println("What dog breed am I thinking of? Take a guess from this list!\nYou only get 10 guesses!");
        //comparing the guess
        Scanner userInput = new Scanner(System.in);
        String guess = userInput.next();
        for (int i = 0; i < dogBreeds.length; i++) {
            Arrays.asList(dogBreeds).contains(guess); // is the list contains the guess; i dunno how to make it ignore the case
            guessIndex = i;
        }
    }

    public void compare() {//well this is Broken; i'll try to fix this later but i don't think i'll be able to do much
        for (int a = 0; a <= 10; a++) { //giving the user 10 guesses
            if (g == guessIndex) { //um i can't seem to get this to loop properly; i think that the scanner input
                // has to be redone for each one
                System.out.println("ay that's correct Am Proud");
            } else if (g > guessIndex) {
                System.out.println("A little higher (towards the bottom of the list)!");
                Scanner userInput = new Scanner(System.in);
                String guess = userInput.next();
                for (int i = 0; i < dogBreeds.length; i++) {
                    Arrays.asList(dogBreeds).contains(guess);
                    guessIndex = i;
                }
            } else if (g <= guessIndex) {
                System.out.println("A little higher (towards the top of the list)!");
                Scanner userInput = new Scanner(System.in);
                String guess = userInput.next();
                for (int i = 0; i < dogBreeds.length; i++) {
                    Arrays.asList(dogBreeds).contains(guess);
                    guessIndex = i;
                }
            }
        }
    }
}


