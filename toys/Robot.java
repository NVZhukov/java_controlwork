package control_work.toys;

public class Robot extends Toy{
    private String name;
    private int chanceToLoss;
    private static int robotCount;

    public Robot(String name) {
        super();
        this.name = name;
        chanceToLoss = 50;
        robotCount ++;
    }

    @Override
    public String getInfo() {
        return "Robot ID: " + super.getId() + " Name: " + name;
    }

    public void setChanceToLoss(int chanceToLoss) {
        if(chanceToLoss < 0 || chanceToLoss > 50) this.chanceToLoss = 50;
        else this.chanceToLoss = chanceToLoss;
    }

    @Override
    public int getCountAnyOne() {
        return robotCount;
    }

    @Override
    public int getChanceToLoss() {
        return chanceToLoss;
    }
}
