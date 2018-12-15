package kickbehaviour;

import characters.Character;

public class Elfbehaviour implements Behaviour {
    @Override
    public void kick(Character main, Character enemy) {
        if(main.getPower()>enemy.getPower()){
            enemy.setHp(0);
        }
        else{
            enemy.setHp(enemy.getHp()-1);
        }
    }
}
