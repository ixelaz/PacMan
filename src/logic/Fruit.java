package logic;

/**
 * Cette classe modélise les fruits du jeu PacMan.
 */
public class Fruit extends PacDot {

    /**
     * Valeur du fruit
     */
    protected static int value;

    /**
     * Constructeur du Fruit, le nom du fruit dépend du niveau de jeu
     * @param level le niveau de jeu
     * @param value la valeur du fruit
     */
    Fruit(int level, int value) {
        super(value);
        Fruit.value = value;
        if (level == 1) {
            this.name = FruitNames.Cerise.toString();
        } else if (level == 2) {
            this.name = FruitNames.Fraise.toString();
        } else if (level == 3 || level == 4) {
            this.name = FruitNames.Orange.toString();
        } else if (level == 5 || level == 6) {
            this.name = FruitNames.Pomme.toString();
        } else if (level == 7 || level == 8) {
            this.name = FruitNames.Melon.toString();
        } else if (level == 9 || level == 10) {
            this.name = FruitNames.Galboss.toString();
        } else if (level == 11 || level == 12) {
            this.name = FruitNames.Cloche.toString();
        } else {
            this.name = FruitNames.Clé.toString();
        }
    }

    /**
     * get name
     *
     * @return name
     * @post result = name
     */
    public String getName() {
        return name;
    }

    /**
     * set name
     *
     * @param name new name
     * @pre name != null
     * @post this.name = name
     */
    public void setName(String name) {
        this.name = name;
    }
}
