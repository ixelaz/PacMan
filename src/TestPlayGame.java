
import logic.Game;

public class TestPlayGame {

    public static void main(String []args) throws InterruptedException {

        Game g = new Game(1);
        g.displayBoard();
        System.out.println(g.getGameGhostBoard()[0].length);

        TestPlayThread tpc = new TestPlayThread("PC", g);
        TestPlayThread tg1 = new TestPlayThread("G1", g);
        TestPlayThread tg2 = new TestPlayThread("G2", g);
        TestPlayThread tg3 = new TestPlayThread("G3", g);
        TestPlayThread tg4 = new TestPlayThread("G4", g);
        TestPlayThread tve = new TestPlayThread("VE", g);
        TestPlayThread tpo = new TestPlayThread("PO", g);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }


}
