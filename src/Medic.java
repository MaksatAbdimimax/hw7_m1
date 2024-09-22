public class Medic extends Hero{
    private int healPoints;
    public void increaseExperience() {
        healPoints += healPoints * 0.1; // Увеличение на 10%
        System.out.println("Medic увеличил свои единицы лечения до " + healPoints);
    }
    @Override
    public void applySuperAbility() {
        System.out.println("Medic применил супер способность BAAFF HEALTH");
    }
}
