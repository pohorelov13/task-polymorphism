package run.obstacles;

import run.runners.Runner;

public abstract class Obstacle {

    private String name;
    private int size;

    public Obstacle(String name, int size) {
        this.name = name;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }

    public abstract boolean overcome(Runner r);
}
