package game_factory;

import characters.*;
import characters.Character;
import config.Config;
import lombok.SneakyThrows;

import java.util.HashMap;

public class CharacterFactory {
    public HashMap<Integer, Class<? extends Character>> hm;

    public CharacterFactory() {
        hm = new HashMap<>();
        hm.put(0, Hobbit.class);
        hm.put(1, Elf.class);
        hm.put(2, King.class);
        hm.put(3, Knight.class);
    }

    @SneakyThrows
    public Character createCharacter() {
        return hm.get(Config.r.nextInt(hm.size())).newInstance();
    }
}
