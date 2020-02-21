package com.klevoyatask;

public class Main {

    public static void main(String[] args) {

        Token bitcoin = new Token(15, 4);
        Token ethereum = new Token(10, 3);
        Token zCash = new Token(5,3);
        Token ripple = new Token(3,1);

        Wallet mainWallet = new Wallet(8);
    }
}
