package ru.gb.oop.task3;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        AbstractGame ag = new NumberGame();
        ag.start(3, 5);
        System.out.println("Введите значения: ");
        Scanner value = new Scanner(System.in);
        while (ag.getGameStatus().equals(GameStatus.START) || ag.getGameStatus().equals(GameStatus.RESTART)){
            Answer answer = ag.inputValue(value.nextLine());
            System.out.println(answer);

        }
        if(ag.getGameStatus().equals(GameStatus.WIN)){
            System.out.println("Вы победили!");
            ag.gameStatus = GameStatus.SET;

        }else if(ag.getGameStatus().equals(GameStatus.LOOSE)){
            System.out.println("Вы проиграли(");
            ag.gameStatus = GameStatus.SET;
        }else{
            System.out.println("Неопознанный статус");
        }
        if(ag.getGameStatus().equals(GameStatus.SET)){
            System.out.println("Вы хотите посмотреть историю игры? Введите 1, если хотите посмотреть, 2 - если не хотите");
            Scanner scr = new Scanner(System.in);
            int game = scr.nextInt();
            if(game == 1){
                for(String history : ag.historyGame){
                    System.out.println(history);
                }
            }
        System.out.println("Хотите перезапустить игру? Нажмите 1, если да");
        Scanner rest = new Scanner(System.in);
        int game1 = rest.nextInt();
        if(game1 == 1){
            ag.gameStatus = GameStatus.START;
            ag.start(3, 5);

        }else{
            System.out.println("Хорошо поиграли! До следующей встречи!");
            ag.gameStatus = GameStatus.INIT;
        }
        }
    }

}
