package control_work.toys;

public class Doll extends Toy {
    private int doll_count = 1;
    private String name;
    private int chanceToLoss;

    public Doll(String name) {
        super();
        this.name = name;
        chanceToLoss = 25;
        doll_count++;
    }

    @Override
    public void getInfo() {
        System.out.printf("Doll ID: " + super.getId() + " Name: " + name + " " + chanceToLoss +"\n");
    }

    public int getDoll_count() {
        return doll_count;
    }

    public void setChanceToLoss(int chanceToLoss) {
        if(chanceToLoss < 0 || chanceToLoss > 100) this.chanceToLoss = 25;
        else this.chanceToLoss = chanceToLoss;
    }
}
