public class Paladin extends Player {

    public Paladin(String name, double hp) {
        super(id, name, hp);

    }
    public Paladin(String name) {
        super(id, name, 300);

    }

    public int gotForse;
    


    public int Attack() {
        int damage = Player.num.nextInt(20, 30);
        this.gotForse -= (Double) (damage * 0.6);

            return damage;
    }
    public int GotAttack() {
        int damage = Player.num.nextInt(20, 30);
        this.gotForse -= (Double) (damage * 0.6);

            return damage;
    }
}
