public class App {
    public static void main(String[] args) throws Exception {
        Player1 player = new Player1("Abhay","sword",100);
               System.out.println(player.getName());
               System.out.println(player.getHealth());
               System.out.println(player.getWeapon());
    
        Player2 player2 = new Player2("Krishna", "Ak-47", 100, true);
        System.out.println(player2.getHealth());
        System.out.println(player2.getName());
        System.out.println(player2.getWeapon());
        System.out.println(player2.isArmour());
        player2.damageByGun1();
        player2.damageByGun2();
        System.out.println(player2.getHealth());
        player2.heal();
            }
}
