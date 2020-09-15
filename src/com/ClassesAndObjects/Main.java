package com.ClassesAndObjects;

public class Main {
    public static void main(String[] args) {

        Car ferrari = new Car();
        Car tesla = new Car();
        Car audi = new Car();

        ferrari.model = "F 350";
        ferrari.color = "red";
        ferrari.doors = 2;

        tesla.model = "T450";
        tesla.color = "blue";
        tesla.doors = 4;

        audi.model = "SP460";
        audi.color = "grey";
        audi.doors = 3;

        ferrari.display();
        tesla.display();
        audi.display();
    }

}
