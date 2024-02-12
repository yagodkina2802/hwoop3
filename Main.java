package ru.gb.oop.task3;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Выберите режим игры и введите нужную цифру(1-цифры, 2-русские буквы, 3- английские буквы): ");
        Scanner scanner = new Scanner(System.in);
        int sort = scanner.nextInt();
        AbstractGame ag = new NumberGame(sort);
        ag.start(3, 5, sort);

//        System.out.println("Выберите режим игры и введите нужную цифру(1-цифры, 2-русские буквы, 3- английские буквы): ");
//        scanner = new Scanner(System.in);
//        int sortingMethod = scanner.nextInt();

        System.out.println("Введите значения: ");

        while (ag.getGameStatus().equals(GameStatus.START) || ag.getGameStatus().equals(GameStatus.RESTART)){

            Answer answer = ag.inputValue(scanner.next());
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
//            scanner.next();
            int game = scanner.nextInt();
            if(game == 1){
                for(String history : ag.historyGame){
                    System.out.println(history);
                }
            }
        System.out.println("Хотите перезапустить игру? Нажмите 1, если да");
        int game1 = scanner.nextInt();
        if(game1 == 1){
            ag.gameStatus = GameStatus.START;


        }else{
            System.out.println("Хорошо поиграли! До следующей встречи!");
            ag.gameStatus = GameStatus.INIT;
        }
        }
    }

}
