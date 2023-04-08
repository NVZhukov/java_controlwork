package control_work.toys;

public class Robot extends Toy{
    private String name;
    private int chanceToLoss;
    private int robotCount = 1;

    public Robot(String name) {
        super();
        this.name = name;
        chanceToLoss = 25;
        robotCount ++;
    }

    @Override
    public void getInfo() {
        System.out.printf("Robot ID: " + super.getId() + " Name: " + name + " " + chanceToLoss +"\n");
    }

    public void setChanceToLoss(int chanceToLoss) {
        if(chanceToLoss < 0 || chanceToLoss > 100) this.chanceToLoss = 25;
        else this.chanceToLoss = chanceToLoss;
    }
}
