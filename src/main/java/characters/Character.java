package characters;


import kickbehaviour.Behaviour;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Random;

@Getter
@Setter
@ToString

public abstract class Character {
    private int power;
    public static Random r = new Random();
    private int hp;

    public Character(int power, int hp) {
        this.power = power;
        this.hp = hp;

    }

    private Behaviour behaviour;

    public abstract void kick(Character c);

    public boolean isAlive() {
        return hp > 0;
    }

}
