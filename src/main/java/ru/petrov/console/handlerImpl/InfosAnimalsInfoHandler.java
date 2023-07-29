package ru.petrov.console.handlerImpl;

import ru.petrov.AnimalsDataBase;
import ru.petrov.console.ConsoleHandler;

public class InfosAnimalsInfoHandler implements ConsoleHandler {
    @Override
    public void handle(AnimalsDataBase animalsDataBase) {
        animalsDataBase.showAnimal();
    }
}
