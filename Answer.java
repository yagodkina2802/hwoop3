package ru.gb.oop.task3;

public class Answer {
    private int counterCow;
    private int bullCounter;
    private int tryCount;

    public Answer(int counterCow, int bullCounter, int tryCount) {
        this.counterCow = counterCow;
        this.bullCounter = bullCounter;
        this.tryCount = tryCount;
    }

    @Override
    public String toString() {
        return "коров " + counterCow +
                ", быков " + bullCounter +
                ", осталось попыток " + tryCount;
    }
}
