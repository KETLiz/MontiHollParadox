package org.example;
import java.util.List;
import java.util.ArrayList;
import java.util.Random;

public class Game {
    List<Door> doors;
    Random random = new Random();

    public Game() {
        doors = new ArrayList<>(3);
        doors.add(new Door(false));
        doors.add(new Door(true));
        doors.add(new Door(false));
    }


    /**
     * Первый ход игрока. Игрок рандомно выбирает дверь
     * @return список из 2 оставшихся дверей
     */
    public List<Door> playersChoise() {
        int selectedDoor = random.nextInt(3);
        doors.remove(doors.get(selectedDoor));
        return doors;
    }

    /**
     * Ход ведущего. Открывает любую дверь без приза
     * @return саисок, состоящий из 1 двери, которую выберет игрок
     */
    public List<Door> presenterChoise() {
        for(int i = 0; i < doors.size(); i++) {
            if(!doors.get(i).getWithPrize()) {
                doors.remove(doors.get(i));
            }
        }
        return doors;
    }

    /**
     * Финиш
     * @return последняя дверь с призом или нет
     */
    public boolean finishGame() {
        for(Door d : doors) {
            if(d.getWithPrize()) {
                return true;
            }
        }
        return false;
    }
}
