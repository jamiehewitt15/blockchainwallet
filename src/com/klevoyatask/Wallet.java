package com.klevoyatask;

public class Wallet {
    private int maxStorage;
    private int maxMemory;

    public Wallet(int maxStorageInput, int maxMemoryInput) {
        this.setMaxMemory(maxMemoryInput);
        this.setMaxStorage(maxStorageInput);
    }

    public void setMaxMemory(int maxMemory) { this.maxMemory = maxMemory;}
    public void setMaxStorage(int maxStorage) { this.maxStorage = maxStorage; }

    public int getMaxMemory() { return this.maxMemory; }
    public int getMaxStorage() { return this.maxStorage; }
}
