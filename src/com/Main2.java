package com;

public class Main2 {
    public static void main(String[] args) {
        System.out.println("integers".matches("\\b(integer|insert|in)\\b"));
        System.out.println("integers".matches("\\b(?>integer|insert|in)\\b"));
    }
}
