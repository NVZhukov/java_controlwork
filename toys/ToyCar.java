package control_work.toys;

public class ToyCar extends Toy{
    private static int carCount;
    private int chanceToLoss;

    public ToyCar() {
        super();
        chanceToLoss = 38;
        carCount ++;
    }

    @Override
    public String getInfo() {
        return "ToyCar ID: " + super.getId();
    }

    @Override
    public int getCountAnyOne() {
        return carCount;
    }

    public void setChanceToLoss(int chanceToLoss) {
        if(chanceToLoss < 0 || chanceToLoss > 50) this.chanceToLoss = 25;
        else this.chanceToLoss = chanceToLoss;
    }

    @Override
    public int getChanceToLoss() {
        return chanceToLoss;
    }


}
