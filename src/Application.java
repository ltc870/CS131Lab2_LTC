public class Application {

  public static void main(String[] args) {
    Wizard wizard1 = new Wizard();

    wizard1.setName("Ecnerwal Elduac");
    wizard1.setHealth(100);
    wizard1.setKey(50);
    wizard1.lock(50);
    System.out.println(wizard1.isLocked());
    System.out.println(wizard1.toString());
    wizard1.takeDamage(70);
    System.out.println(wizard1.getHealth());
  }
}
