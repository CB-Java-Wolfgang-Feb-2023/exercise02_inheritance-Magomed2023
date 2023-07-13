package exercise02;

import java.sql.SQLOutput;

public class chessPieces {
    int count;
    String name;
    String color;

    public chessPieces(int count, String name, String color) {
        this.count = count;
        this.name = name;
        this.color = color;
    }

    void movement() {
        System.out.println("Movement: ");
    }

    void printChess() {
        System.out.println("Count: " + count + "\nName: " + name + "\nColor: " + color);
    }

    void species() {
        System.out.println("Species: ");
    }

}


