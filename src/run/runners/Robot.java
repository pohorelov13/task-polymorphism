package run.runners;

public class Robot extends Runner {
    private int total;

    public Robot(String name, int runDistance, int jumpHeight) {
        super(name, runDistance, jumpHeight);
    }

    @Override
    public void run() {
        total++;
        System.out.printf("I'm robot %s and i can run\nOvercome %d obstacle\n\n",
                super.getName(), total);
    }

    @Override
    public void jump() {
        total++;
        System.out.printf("I'm robot %s and i can jump\nOvercome %d obstacle\n\n",
                super.getName(), total);

    }
}