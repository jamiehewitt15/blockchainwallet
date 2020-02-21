package com.klevoyatask;

public class Token {
    private String name;
    private int value;
    private int memory;

    public Token(String name, int value, int memory){
        this.setName(name);
        this.setValue(value);
        this.setMemory(memory);
    }

    private void setName(String name) { this.name = name;}
    private void setMemory(int memory) { this.memory = memory; }
    private void setValue(int value) { this.value = value; }

    public String getName() { return name; }
    public int getMemory() { return this.memory; }
    public int getValue() { return this.value; }
}
