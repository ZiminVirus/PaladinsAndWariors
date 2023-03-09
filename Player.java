import java.util.Random;

public class Player {
    protected static long id;
    protected static Random num;
    protected String name;
    protected double hp;

    static {
        Player.id = 0;
        Player.num = new Random();
    }


    public Player(Long id, String name, double hp) {

        this.name = name;
        this.hp = hp;

    }

    public Player(String name) {
        this (id, name, 200.0);

    }

    public void GetDamage(Integer damage) {
        this.hp -= damage;

    }

}