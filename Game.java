package ru.gb.oop.task3;

public interface Game {
    void start(Integer sizeWord, Integer tryCount);
    Answer inputValue(String value);
    GameStatus getGameStatus();
}
