package control_work.toys;

public class ToyCar extends Toy{
    private int carCount = 1;
    private int chanceToLoss;

    public ToyCar() {
        super();
        chanceToLoss = 30;
        carCount ++;
    }

    @Override
    public void getInfo() {
        System.out.printf("Toy car ID: " + super.getId() + " " + chanceToLoss +"\n");
    }

    public int getCarCount() {
        return carCount;
    }

    public void setChanceToLoss(int chanceToLoss) {
        if(chanceToLoss < 0 || chanceToLoss > 100) this.chanceToLoss = 25;
        else this.chanceToLoss = chanceToLoss;
    }


}
