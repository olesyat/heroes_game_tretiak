package characters;

import kickbehaviour.Behaviour;
import kickbehaviour.Randombehaviour;

public class Swordsman extends Character {
    public Swordsman(int min, int max){
        super(r.nextInt(max-min+1)+min, r.nextInt(max-min+1)+min);
        setBehaviour(new Randombehaviour());
    }
    public void kick(Character c) {
        Behaviour behaviour = getBehaviour();
        behaviour.kick(this, c);
    }
}
