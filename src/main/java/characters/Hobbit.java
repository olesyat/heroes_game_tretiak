package characters;

public class Hobbit extends Character {
    public Hobbit() {
        super(0, 3);
    }
    private void toCry(){
        System.out.println("Cry cry cry");
    }
    public void kick(Character c){
        toCry();
    }
}
