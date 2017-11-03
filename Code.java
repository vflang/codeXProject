package com.company;
import java.util.Arrays;
/**
 * use 2 arrays; the replace method
 * Created by Veronica Lang on 11/2/2017.
 */
public class Code {
    private String myCode;
    public String trueCode;
    public int p1;
    public int p2;
    public char transformedWord[];
    public String code;
    //additional instance variables

    public Code(String code) {
        myCode = code;
        code = trueCode;
    }

    public String getCode() {
        return myCode;
    }

    //precondition: p1 >=0, p1 < p2
    //                           p2 <= myCode.length()
    //Replaces the characters in the code starting at
    //position p1 until position p2-1 inclusive with an X
    public void hide(int p1, int p2) {
        //to be implemented
        if (p1 >= 0 && p1 < p2 && p2 <= myCode.length()) {
            char word[] = myCode.toCharArray();
            char xHide[] = new char[word.length];
            Arrays.fill(xHide, 'X');
            System.arraycopy(xHide, 0, word, p1, p2);
            transformedWord = word.clone();
        }
    }

    //precondition: p1>= 0, p1 < p2
    //                          p2 <= myCode.length()
    //Restores to their original values the charcters in
    //the code strating at position p1 until position
    //p2-1 inclusive
    public void recover(int p1, int p2) {
        if (p1 >= 0 && p1 < p2 && p2 <= myCode.length()) {
            char recoverword[] = myCode.toCharArray();
            System.arraycopy(recoverword, p1, transformedWord, p1, p2);

                //to be implemented
                //replace method
            }
        }
    }
}
