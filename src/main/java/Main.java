import characters.Character;
import game_factory.CharacterFactory;
import manager.GameManager;

public class Main {
    public static void main(String[] args) {
        GameManager game = new GameManager();
        CharacterFactory factory = new CharacterFactory();
        Character f1 = factory.createCharacter();
        Character f2 = factory.createCharacter();
            game.fight(f1, f2);
        System.out.println(f1+" Health: "+f1.getHp()+" Power: "+f1.getPower());
        System.out.println(f2+" Health: "+f2.getHp()+" Power: "+f2.getPower());
}}
