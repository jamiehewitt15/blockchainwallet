package com.klevoyatask;

import java.util.ArrayList;

public class Wallet {

    private ArrayList<Token> storedTokens = new ArrayList<Token>();
    private int storedValue;
    private int maxMemory;
    private int usedMemory;
    private int availableMemory;


    public Wallet(int maxMemory) {
        this.setMaxMemory(maxMemory);
        this.setAvailableMemory();

    }


    private void setMaxMemory(int maxMemory) { this.maxMemory = maxMemory; }

    private void setStoredValue() {
        this.storedValue = 0;
        for (Token i : storedTokens){
            this.storedValue += i.getValue();
        }
    }

    private void setUsedMemory() {
        this.usedMemory = 0;
        for (Token i : storedTokens){
            this.usedMemory += i.getMemory();
        }
    }

    private void setAvailableMemory() { this.availableMemory = this.maxMemory - this.usedMemory; }

    private int getMaxMemory() { return this.maxMemory; }
    private int getStoredValue() { return this.storedValue; }
    private int getUsedMemory() { return this.usedMemory; }
    private int getAvailableMemory() { return this.availableMemory; }

    private void printWallet() {
        System.out.print("Wallet currently holds: ");
        for (Token i : storedTokens) {
            System.out.print(i.getName() + ", ");
        }
    }

    private void removeToken(Token token) {
        this.storedTokens.remove(token);
        System.out.println(token.getName() + " has been removed from the wallet");
    }

    private void updateStoredTokens(Token token) {
        this.storedTokens.add(token);
        setStoredValue();
        setUsedMemory();
        setAvailableMemory();
        System.out.println(token.getName() + " has been added to the wallet");
        printWallet();
        System.out.println("\nCurrent value stored in wallet is: " + this.getStoredValue());
        System.out.println("Current wallet memory stored is: " + this.getUsedMemory());
    }

    public void addToken(Token token) {
        if (token.getMemory() <= this.getAvailableMemory()) {
            this.updateStoredTokens(token);
        } else outerloop:for (Token i : storedTokens) {
            if (i.getMemory() + getAvailableMemory() >= token.getMemory() && i.getValue() < token.getValue()) {
                this.removeToken(i);
                this.updateStoredTokens(token);
                break;
            } else for (Token j : storedTokens) {
                if (i != j && i.getMemory() + j.getMemory() + getAvailableMemory() >= token.getMemory() && i.getValue() + j.getValue() < token.getValue()) {
                    this.removeToken(i);
                    this.removeToken(j);
                    this.updateStoredTokens(token);
                    break;
                } else for (Token k : storedTokens) {
                    if (i != j && j != k && i.getMemory() + j.getMemory() + k.getMemory() + getAvailableMemory() >= token.getMemory() && i.getValue() + j.getValue() + k.getValue() < token.getValue()) {
                        this.removeToken(i);
                        this.removeToken(j);
                        this.removeToken(k);
                        this.updateStoredTokens(token);
                        break;
                    } else {
                        System.out.println("No coins have been added to the wallet");
                        printWallet();
                        break outerloop;

                    }

                }

            }

        }
    }
}
