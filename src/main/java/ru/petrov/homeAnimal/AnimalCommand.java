package ru.petrov.homeAnimal;

public class AnimalCommand {
    private String commandName;

    public AnimalCommand(String commandName) {
        this.commandName = commandName;
    }

    @Override
    public String toString() {
        return commandName;
    }
}
