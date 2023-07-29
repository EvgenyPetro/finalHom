package ru.petrov.console.handlerImpl;

import ru.petrov.AnimalsDataBase;
import ru.petrov.console.ConsoleHandler;
import ru.petrov.homeAnimal.Animal;
import ru.petrov.homeAnimal.animal.Cat;
import ru.petrov.homeAnimal.animal.Dog;
import ru.petrov.homeAnimal.animal.Hamster;

import java.util.Scanner;

public class AddAnimalHandler implements ConsoleHandler {
    Scanner scanner;

    public AddAnimalHandler(Scanner scanner) {
        System.out.println("Какого животного вы хотите добавить");
        System.out.println("Кот - 1");
        System.out.println("Собака -2");
        System.out.println("Хомяк - 3");
        this.scanner = scanner;
    }

    @Override
    public void handle(AnimalsDataBase animalsDataBase) {
        animalsDataBase.addAnimal(addAnimal());
    }

    private Animal addAnimal() {
        Animal animal = null;
        switch (scanner.nextInt()) {
            case 1:
                animal = new Cat(scanner.next());
                break;
            case 2:
                animal = new Dog(scanner.next());
                break;
            case 3:
                animal = new Hamster(scanner.next());
                break;
        }
        return animal;
    }
}
