package ru.gb.oop.task3;

import java.util.*;

public abstract class AbstractGame implements Game {
     abstract List<String> generateCharList();
    ArrayList<String> historyGame = new ArrayList<String>();

     private String word;
     Integer tryCount;

     public GameStatus gameStatus = GameStatus.INIT;

    @Override
    public void start(Integer sizeWord, Integer tryCount) {
        word = generateWord(sizeWord);
        this.tryCount = tryCount;
        gameStatus = GameStatus.START;

    }

    private String generateWord(Integer sizeWord) {
        List<String> alphabet = generateCharList();
        Random rnd = new Random();
        String result = "";
        for (int i = 0; i < sizeWord; i++) {
            int randomIndex = rnd.nextInt(alphabet.size());
            result+=alphabet.get(randomIndex);
            alphabet.remove(randomIndex);
        }
        return result;
    }

    @Override
    public Answer inputValue(String value) {
        if(gameStatus.equals(GameStatus.INIT)){
            throw new RuntimeException("Игра не запущена");
        }
        int counterCow = 0;
        int bullCounter = 0;

        for (int i = 0; i <word.length() ; i++) {
            if(value.charAt(i) == word.charAt(i)){
                counterCow++;
                bullCounter++;

            }else if(word.contains(String.valueOf(value.charAt(i)))){
                counterCow++;

            }

        }
        historyGame.add(value);
        tryCount--;
        if(tryCount==0){
            gameStatus = GameStatus.LOOSE;
        }
        if(bullCounter==word.length()){
            gameStatus = GameStatus.WIN;
        }

        return new Answer(counterCow, bullCounter, tryCount);
    }

    @Override
    public GameStatus getGameStatus() {
        return gameStatus;
    }
}
