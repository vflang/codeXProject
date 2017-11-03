package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Code codeStr = new Code("help");
        codeStr.getCode();
        codeStr.hide(1,3);
        codeStr.recover(1, 3);
    }
}
