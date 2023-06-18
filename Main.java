public class Main {
  public static void main(String[] args) {

    System.out.println("SEMonster!show a new monster");
    Player player = new Player();
    player.drawMonsters();
    player.showDeck();
    Monster monster = new Monster();
    System.out.println(monster.toString());
  }
}
