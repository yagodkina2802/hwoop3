package ru.gb.oop.task3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class NumberGame extends AbstractGame{
//    Дописать игру быки-коровы
//- на русском и английском алфавите


    @Override
    List<String> generateCharList() {
        System.out.println("Выберите режим игры и введите нужную цифру(1-цифры, 2-русские буквы, 3- английские буквы): ");
        Scanner scanner = new Scanner(System.in);
        int sortingMethod = scanner.nextInt();
        switch(sortingMethod) {
            case 1:

                return new ArrayList<>(Arrays.asList("1", "2", "3", "4", "5", "6", "7", "8", "9"));

            case 2:
                return new ArrayList<>(Arrays.asList("А", "Б", "В", "Г", "Д", "Е", "Ё", "Ж", "З", "И",
                        "Й", "К", "Л", "М", "Н", "О", "П", "Р", "С", "Т", "У", "Ф", "Х", "Ц", "Ч", "Щ",
                        "Ш", "Ъ", "Ы", "Ь", "Э", "Ю", "Я"));
//                    break;
            case 3:
                return new ArrayList<>(Arrays.asList("B", "C", "D", "F", "G", "H", "J", "K",
                        "L", "M", "N", "P", "Q", "R", "S", "T", "V", "W", "X", "Y", "Z", "A",
                        "E", "I", "O", "U", "Y"));
//                    break;
            default:
                System.out.println("Выбрали неверную комбинацию");
        }


    return new ArrayList<>();
}
}
