package shooter.weapon;

public class Gun extends Weapon {
    @Override
    public void shot() {
        System.out.println("Пистолет стреляет");
    }
}