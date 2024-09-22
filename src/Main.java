public class Main {
    public static void main(String[] args) {
    Hero[] heroes = new Hero[3];
        heroes[0] = new Magic();
        heroes[1] = new Medic();
        heroes[2] = new Warrior();
        for (Hero h : heroes) {
            h.applySuperAbility();
            if (heroes[1] instanceof Medic) {
                ((Medic) heroes[1]).increaseExperience();
            }
    }
    }
}