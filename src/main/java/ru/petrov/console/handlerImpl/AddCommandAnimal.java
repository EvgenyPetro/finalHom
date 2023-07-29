package ru.petrov.console.handlerImpl;

import ru.petrov.AnimalsDataBase;
import ru.petrov.console.ConsoleHandler;
import ru.petrov.homeAnimal.AnimalCommand;

import java.util.Scanner;

public class AddCommandAnimal implements ConsoleHandler {
    int index;
    String commandName;

    public AddCommandAnimal(Scanner scanner) {
        System.out.println("Номер животного, о которому хотите задать команду");
        this.index = scanner.nextInt();
        this.commandName = scanner.next();

    }

    @Override
    public void handle(AnimalsDataBase animalsDataBase) {
        AnimalCommand command = new AnimalCommand(commandName);
        animalsDataBase.addCommandAnimal(index, command);
    }
}
