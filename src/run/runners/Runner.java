package run.runners;

public abstract class Runner {
    private String name;
    private int runDistance;
    private int jumpHeight;

    public Runner(String name, int runDistance, int jumpHeight) {
        this.name = name;
        this.runDistance = runDistance;
        this.jumpHeight = jumpHeight;
    }

    public String getName() {
        return name;
    }

    public int getRunDistance() {
        return runDistance;
    }

    public int getJumpHeight() {
        return jumpHeight;
    }

    public abstract void run();

    public abstract void jump();
}