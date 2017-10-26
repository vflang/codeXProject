package com.company;
/*So we want the computer to predetermine the guess from a list of dog breeds
print out the list before prompting user to change
insert higher or lower in the alphabet if the value of that character is too low or high (assign an int to each name)
remember to sort! before assigning the numbers

*/

public class Main {

    public static void main(String[] args) {
        GuessMyNum newNum = new GuessMyNum();
        newNum.list();
        newNum.gimmeGuess();
        newNum.compare();
    }
}
