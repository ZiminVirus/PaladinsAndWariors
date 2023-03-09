
public class Main {
    public static void main(String[] args) {
        Paladin player1 = new Paladin("Jacki",300);
        System.out.println((player1.name));
        System.out.println((player1.hp));
        Warwars player2 = new Warwars("Rambo", 200);
        System.out.println((player2.name));
        System.out.println((player2.hp));
        player2.GetDamage(player1.Attack());
        System.out.println((player2.name));
        System.out.println((player2.hp));

        player1.GetDamage(player2.SuperAttack());
        System.out.println((player1.name));
        System.out.println((player1.hp));

        player2.GetDamage(player1.GotAttack());
        System.out.println((player2.name));
        System.out.println((player2.hp));

        player1.GetDamage(player2.SuperAttack());
        System.out.println((player1.name));
        System.out.println((player1.hp));

        player2.GetDamage(player1.GotAttack());
        System.out.println((player2.name));
        System.out.println((player2.hp));


      
    }
}