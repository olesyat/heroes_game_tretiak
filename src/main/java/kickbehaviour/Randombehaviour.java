package kickbehaviour;

import characters.Character;
import config.Config;

public class Randombehaviour implements Behaviour {
    public void kick(Character main, Character c) {
        c.setHp(c.getHp()-Config.r.nextInt(main.getPower()+1));
    }
}
