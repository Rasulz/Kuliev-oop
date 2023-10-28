public class Main {
    public static void main(String[] args) {
        Game game = new Game();
        Unit unit1 = new Unit("Sasha");
        Unit unit2 = new Unit("Alex");
      //  unit1.print();
     //   unit1.print("Value of:");

        Game game2 = new Game();
        Wizard wizard1 = new Wizard("W1");
        Wizard wizard2 = new Wizard("W2");
        wizard1.attack(wizard2);
        //System.out.println(wizard1);
       // System.out.println(wizard2);
        wizard2.attack(wizard1);
        System.out.println(wizard1);
        System.out.println(wizard2);
        Game.print();
    }
}