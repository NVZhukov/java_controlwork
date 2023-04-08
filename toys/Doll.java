package control_work.toys;

public class Doll extends Toy {
    private static int doll_count;
    private String name;
    private int chanceToLoss;

    public Doll(String name) {
        super();
        this.name = name;
        chanceToLoss = 12;
        doll_count++;
    }

    @Override
    public String getInfo() {
        return "Doll ID: " + super.getId() + " Name: " + name;
    }

    @Override
    public int getCountAnyOne() {
        return doll_count;
    }

    public void setChanceToLoss(int chanceToLoss) {
        if(chanceToLoss < 0 || chanceToLoss > 50) this.chanceToLoss = 25;
        else this.chanceToLoss = chanceToLoss;
    }

    @Override
    public int getChanceToLoss() {
        return this.chanceToLoss;
    }
}
