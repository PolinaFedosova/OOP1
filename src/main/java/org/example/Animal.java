package org.example;

public class Animal {
    String name;

    public void toSwim(int dlina){
        System.out.println("Животное успешно проплыло дистанцию");
    }
    public void toRun( int dlina){
        System.out.println("Животное успешно пробежало дистанцию");
    }

    public Animal() {
    }

    public Animal(String name) {
        this.name = name;
    }
}
