package ru.petrov;

public class Counter implements AutoCloseable {

    private int counter;

    public void add() {
        counter++;
    }

    @Override
    public void close() {
        System.out.println("Ресурс освобожден");
    }

    public void remove() {
        counter--;
    }

    public int getCount() {
        return counter;
    }
}
