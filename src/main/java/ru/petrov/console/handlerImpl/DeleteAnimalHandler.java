package ru.petrov.console.handlerImpl;

import ru.petrov.AnimalsDataBase;
import ru.petrov.console.ConsoleHandler;

import java.util.Scanner;

public class DeleteAnimalHandler implements ConsoleHandler {
    int index;

    public DeleteAnimalHandler(Scanner scanner) {
        System.out.println("Номер животного которого надо убрать с зоопарка");
        this.index = scanner.nextInt();
    }

    @Override
    public void handle(AnimalsDataBase animalsDataBase) {
        animalsDataBase.removeAnimal(index);
    }
}
