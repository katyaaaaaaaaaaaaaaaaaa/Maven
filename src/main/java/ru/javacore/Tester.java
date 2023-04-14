package ru.javacore;

public class Tester {
    String name;
    String surname;
    int exp;
    String englishLevel;
    float salary;

    public Tester(String name, String surname, int expirienceInYears, String englishLevel, float salary){
        this(name, surname);
        this.name = name;
        this.surname = surname;
        this.exp = expirienceInYears;
        this.englishLevel = englishLevel;
        this.salary = salary;
    }
    public Tester(String name, String surname){
        this.name = name;
        this.surname = surname;
        this.exp = 12;
        this.englishLevel = "B1";
        this.salary = 100;
    }
    public Tester(){
        this.name = "А";
        this.surname = "А";
        this.exp = 1;
        this.englishLevel = "B1";
        this.salary = 100;
    }

    public void getFullName(){
        System.out.println("Имя "+this.name + " Фамилия" + this.surname);
    }
    public void getFullName(String name){
        System.out.println("Имя "+name + " Фамилия " + this.surname);
    }
    public void getFullName(String name, String surname){
        System.out.println(name + " " + surname);
    }

    static void print(){
        System.out.println("Hello");
    }
}