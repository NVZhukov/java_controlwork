package control_work.toys;

public class Doll extends Toy {
    private int doll_coutn;

    public Doll(int id, String name) {
        super(id, name);
        doll_coutn++;
    }
}
