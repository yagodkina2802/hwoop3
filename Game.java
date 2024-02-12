package ru.gb.oop.task3;

public interface Game {
    void start(Integer sizeWord, Integer tryCount, Integer sort);
    Answer inputValue(String value);
    GameStatus getGameStatus();
}
