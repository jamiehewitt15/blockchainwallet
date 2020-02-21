package com.klevoyatask;

import java.util.ArrayList; // import the ArrayList class

public class Wallet {
    private ArrayList<Token> storedTokens = new ArrayList<Token>();
    private int storedValue;
    private int maxMemory;
    private int usedMemory;

    public Wallet( int maxMemory) {
        this.setMaxMemory(maxMemory);

    }

    public void setMaxMemory(int maxMemory) { this.maxMemory = maxMemory;}
    public void setStoredValue(Token token) { this.storedValue = this.storedValue + token.getValue(); }
    public void setUsedMemory(Token token) { this.usedMemory = this.usedMemory + token.getMemory(); }


    public int getMaxMemory() { return this.maxMemory; }
    public int getStoredValue() { return this.storedValue; }

    public void addToken(Token token) {
        if(token.getMemory() + this.usedMemory <= this.getMaxMemory()){
            this.storedTokens.add(token);
            setStoredValue(token);
            setUsedMemory(token);
        } else{
            for (Token i: storedTokens ) {

            }
        }

    }
}
