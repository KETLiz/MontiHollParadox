package org.example;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        HashMap<Integer, String> results = new HashMap<>();

        int win = 0; // кол-во побед игрока
        int defeat = 0; // кол-во поражений игрока

        for(int i = 0; i < 1000; i++) {
            Game game = new Game();
            game.playersChoise();
            game.presenterChoise();
            boolean finish = game.finishGame();
            if(finish) {
                win++;
                results.put(i, "победа");
            } else {
                defeat++;
                results.put(i, "проигрыш");
            }
        }
        System.out.println(results);
        System.out.println("Количество побед игрока: " + win);
        System.out.println("Количество поражений игрока: " + defeat);
    }
}