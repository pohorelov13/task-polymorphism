package run.runners;

public class Human extends Runner {

    public int total;

    public Human(String name, int runDistance, int jumpHeight) {
        super(name, runDistance, jumpHeight);
    }

    @Override
    public void run() {
        total++;
        System.out.printf("I'm human %s and i can run\nOvercome %d obstacle\n\n",
                super.getName(), total);
    }

    @Override
    public void jump() {
        total++;
        System.out.printf("I'm human %s and i can jump\nOvercome %d obstacle\n\n",
                super.getName(), total);
    }

}
