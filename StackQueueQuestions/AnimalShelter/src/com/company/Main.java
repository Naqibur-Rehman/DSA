package com.company;

public class Main {

    public static void main(String[] args) {
        AnimalQueue animals = new AnimalQueue();
        animals.enQueue(new Cat("Kiki"));
        animals.enQueue(new Cat("Kary"));
        animals.enQueue(new Dog("Beji"));
        animals.enQueue(new Cat("Reki"));
        animals.enQueue(new Dog("Dexter"));

        System.out.println(animals.deQueueAny().name());
        System.out.println(animals.deQueueDogs().name());
        System.out.println(animals.deQueueCats().name());

        System.out.println(animals.peek().name());
        System.out.println(animals.peekDogs().name());
        System.out.println(animals.peekCats().name());



    }
}
