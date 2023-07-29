package ru.petrov;

import ru.petrov.console.ConsoleHandler;
import ru.petrov.console.ConsoleHandlerFactory;
import ru.petrov.homeAnimal.AnimalCommand;
import ru.petrov.homeAnimal.animal.Cat;
import ru.petrov.homeAnimal.animal.Dog;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        Cat cat = new Cat("Barsik");
//        Dog dog = new Dog("Rex");
//
//        AnimalCommand command1 = new AnimalCommand("Run");
//        AnimalCommand command2 = new AnimalCommand("Eat");
//
//        cat.addCommand(command1);
//        cat.addCommand(command2);
//
//        dog.addCommand(command1);
//        dog.addCommand(command2);
//
////        System.out.println(cat);
//
//
//
//        animalsDataBase.addAnimal(cat);
//        animalsDataBase.addAnimal(dog);
//
//        animalsDataBase.showAnimal();
//        animalsDataBase.removeAnimal(cat);
//
//        animalsDataBase.showAnimal();

        AnimalsDataBase animalsDataBase = new AnimalsDataBase();
        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println("Введите команду");
            System.out.println("Добавить животного - 1");
            System.out.println("Убрать животного - 2");
            System.out.println("Печатать информацию о конкретном животном - 3");
            System.out.println("Печатать информацию о всех животных - 4");
            System.out.println("Добавить команду жувотному - 5");
            System.out.println("Выйти - 7");
            String command = scanner.nextLine();
            ConsoleHandler handler = new ConsoleHandlerFactory().handle(command);
            handler.handle(animalsDataBase);
        }
    }
}
