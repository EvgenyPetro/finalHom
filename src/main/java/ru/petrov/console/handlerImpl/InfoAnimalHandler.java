package ru.petrov.console.handlerImpl;

import ru.petrov.AnimalsDataBase;
import ru.petrov.console.ConsoleHandler;

import java.util.Scanner;

public class InfoAnimalHandler implements ConsoleHandler {
    int index;

    public InfoAnimalHandler(Scanner scanner) {
        System.out.println("Номер животного, о котором хотите получить информацию");
        this.index = scanner.nextInt();
    }

    @Override
    public void handle(AnimalsDataBase animalsDataBase) {
        animalsDataBase.getInfoAboutAnimal(index);
    }
}
