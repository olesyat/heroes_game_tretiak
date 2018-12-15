package kickbehaviour;

import characters.Character;

public class Ordinarybehaviour implements Behaviour{
    public void kick(Character main, Character enemy){
        enemy.setHp(enemy.getHp()-main.getPower());
    }

}
