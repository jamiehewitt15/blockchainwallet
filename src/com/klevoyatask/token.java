package com.klevoyatask;

public class token {
    private int value;
    private int memory;

    public token(int valueInput, int memoryInput){
        this.setValue(valueInput);
        this.setMemory(memoryInput);
    }

    public void setMemory(int memory) { this.memory = memory; }
    public void setValue(int value) { this.value = value; }

    public int getMemory() { return this.memory; }
    public int getValue() { return this.value; }
}
