package ru.petrov;

import ru.petrov.homeAnimal.Animal;
import ru.petrov.homeAnimal.AnimalCommand;

import java.util.ArrayList;
import java.util.List;

public class AnimalsDataBase {
    private List<Animal> animalList;
    private Counter counter;

    public AnimalsDataBase() {
        counter = new Counter();
        this.animalList = new ArrayList<>();
    }

    public void addAnimal(Animal animal) {
        counter.add();
        animalList.add(animal);
    }

    public void removeAnimal(int index) {
        counter.remove();
        if (isContains(index)) {
            this.animalList.remove(index);
            System.out.println("Убрано");
        } else notFound();
    }

    public void showAnimal() {
        System.out.printf("Всего %d животных\n", counter.getCount());
        animalList.forEach(System.out::println);
    }

    private boolean isContains(int index) {
        return this.animalList.size() > index;
    }

    private void notFound() {
        System.out.println("Животного с таким номером нет");
    }

    public void getInfoAboutAnimal(int index) {
        if (isContains(index)) {
            Animal animal = getAnimal(index);
            System.out.println(animal);
        } else notFound();
    }

    private Animal getAnimal(int index) {
        return this.animalList.get(index);
    }

    public void addCommandAnimal(int index, AnimalCommand command){
        Animal animal = getAnimal(index);
        animal.addCommand(command);
    }
}
