package ru.javacore;

public class Main {
    public static void main(String[] args) {
        System.out.println("Привет, Катя...");


        Tester tester = new Tester("Екатерина","Кулакова", 2, "А2", 800);
        tester.getFullName();
        tester.print();
    }
}