package ru.job4j.oop;

public class Cat {
    private String food;
    private String name;
    public void show() {
        System.out.println(this.name);
        System.out.println(this.food);
    }
    public void eat(String meat) {
        this.food = meat;
    }
    public void giveNick(String nick) {
        this.name = nick;
    }
    public static void main(String[] args) {
        System.out.println("There are first cat`s name and food.");
        Cat gav = new Cat();
        gav.giveNick("Gav");
        gav.eat("kotleta");
        gav.show();
        System.out.println("There are second cat`s name and food.");
        Cat black = new Cat();
        black.giveNick("Black");
        black.eat("fish");
        black.show();
    }
}