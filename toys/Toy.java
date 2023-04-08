package control_work.toys;

public abstract class Toy {
    protected int id;
    protected String name;
    protected static int toys_count;

    public Toy(int id, String name) {
        this.id = id;
        this.name = name;
        toys_count ++;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public static int getCount() {
        return toys_count;
    }

    public void setName(String name) {
        this.name = name;
    }
}
