package run.runners;

public class Human extends Runner {
    public Human(String name, int runDistance, int jumpHeight) {
        super(name, runDistance, jumpHeight);
    }

    @Override
    public void run() {
        System.out.printf("\nI'm human %s and i can run\n", super.getName());
    }

    @Override
    public void jump() {
        System.out.printf("\nI'm human %s and i can jump\n", super.getName());
    }

}
