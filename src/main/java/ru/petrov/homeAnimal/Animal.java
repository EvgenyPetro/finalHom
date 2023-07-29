package ru.petrov.homeAnimal;

import java.util.ArrayList;
import java.util.List;

public class Animal {

    private String name;
    private List<AnimalCommand> commands;

    public Animal(String name) {
        this.name = name;
        this.commands = new ArrayList<>();
    }

    public void addCommand(AnimalCommand command) {
        commands.add(command);
    }

    @Override
    public String toString() {
        return "HomeAnimal{" +
                "name='" + name + '\'' +
                ", commands=" + commands +
                '}';
    }
}
