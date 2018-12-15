package manager;
import characters.Character;
public class GameManager {
    public void fight(Character c1, Character c2) {
        while (c1.getHp() > 0 && c2.getHp() > 0) {
            System.out.println(c1+" Health: "+c1.getHp()+" Power: "+c1.getPower());
            System.out.println(c2+" Health: "+c2.getHp()+" Power: "+c2.getPower());
            c1.kick(c2);
            c2.kick(c1);
        }
    }
}
