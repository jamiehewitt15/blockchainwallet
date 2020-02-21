package com.klevoyatask;

public class Token {
    private int value;
    private int memory;

    public Token(int value, int memory){
        this.setValue(value);
        this.setMemory(memory);
    }

    public void setMemory(int memory) { this.memory = memory; }
    public void setValue(int value) { this.value = value; }

    public int getMemory() { return this.memory; }
    public int getValue() { return this.value; }
}
