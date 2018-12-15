package characters;

import kickbehaviour.Behaviour;
import kickbehaviour.Elfbehaviour;
import lombok.ToString;

@ToString
public class Elf extends Character {
    public Elf(){
        super(10,10);
        setBehaviour(new Elfbehaviour());
    }
    public void kick(Character c){
        Behaviour behaviour = getBehaviour();
        behaviour.kick(this, c);
    }

}
