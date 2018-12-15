package kickbehaviour;

import characters.Character;

public class Godbehaviour implements Behaviour {
    public void kick(Character main, Character enemy) {
        enemy.setHp(0);
    }
}
