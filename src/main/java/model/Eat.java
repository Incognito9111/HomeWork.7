package model;

public class Eat {
    private String name;
    private int count;

    public Eat(String name, int count) {
        this.count = count;
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public int getCount() {
        return count;
    }

    public void decreaseCount() {
        if (count <= 0) {
            System.out.println("Еда закончилась");
            return;
        }
        this.count--;
    }
}
