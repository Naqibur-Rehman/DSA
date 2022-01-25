package com.company;

import java.util.LinkedList;

public class AnimalQueue {
    LinkedList<Dog> dogs = new LinkedList<>();
    LinkedList<Cat> cats = new LinkedList<>();

    private int order = 0;

    // enQueue
    public void enQueue(Animal animal) {
        animal.setOrder(order);
        order++;
        if (animal instanceof Dog) {
            dogs.addLast((Dog) animal);
        } else if (animal instanceof Cat) {
            cats.addLast((Cat) animal);
        }
    }

    public int size() {
        return dogs.size() + cats.size();
    }

    // deQueueDogs
    public Dog deQueueDogs() {
        return dogs.poll();
    }

    // peekDogs
    public Dog peekDogs() {
        return dogs.peek();
    }

    // deQueueCats
    public Cat deQueueCats() {
        return cats.poll();
    }

    // peekCats
    public Cat peekCats() {
        return cats.peek();
    }

    //deQueueAnimal
    public Animal deQueueAny() {
        if (dogs.size() == 0)   return deQueueCats();
        else if (cats.size() == 0)  return deQueueDogs();

        Dog dog = dogs.peek();
        Cat cat = cats.peek();

        if (dog.isOlderthan(cat)) {
            return dogs.poll();
        } else {
            return cats.poll();
        }
    }

    // peek
    public Animal peek() {
        if (dogs.size() == 0)   return deQueueCats();
        else if (cats.size() == 0)  return deQueueDogs();

        Dog dog = dogs.peek();
        Cat cat = cats.peek();

        if (dog.isOlderthan(cat)) {
            return dogs.peek();
        } else {
            return cats.peek();
        }

    }
}
