package com.ObjectPool;

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 15; i++) {
            Restaurant customer = new Restaurant();
            customer.start();
        }
    }
}
