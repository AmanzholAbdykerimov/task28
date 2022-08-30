package com.company;

public class Main {
    public static void main(String[] args) {
        int x=81;
        UnaryOperator san=new UnaryOperator() {
            @Override
            public void sqrt() {
                System.out.println(Math.sqrt(x));
            }};
        san.sqrt();
    }
    }