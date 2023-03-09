public class Warwars extends Player {


        public Warwars(String name, double hp) {
            super(id, name, hp);
    
        }
        public Warwars(String name) {
            super(id, name, 275);
    
        }
    
        public int rageOfHerroy;
        
    
    
        public int Attack() {
            int damage = Player.num.nextInt(20, 30);
            this.rageOfHerroy -= (Double) (damage * 0.6);
    
                return damage;
        }
        public int SuperAttack() {
            int damage = Player.num.nextInt(100, 120);
            this.rageOfHerroy -= (Double) (damage * 0.8);
    
                return damage;
        }

}
