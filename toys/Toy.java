package control_work.toys;

public abstract class Toy {
    protected int id;
    protected static int toys_count = 1;
    protected int count;
    protected int chanceToLoss;


    public Toy() {
        this.id = toys_count;
        toys_count ++;
    }

    public int getId() {
        return id;
    }

    public static int getCount() {
        return toys_count;
    }

    public abstract String getInfo();

    public abstract int getCountAnyOne();

    public void setChanceToLoss(int chanceToLoss) {
        this.chanceToLoss = chanceToLoss;
    }

    public abstract int getChanceToLoss();
}
