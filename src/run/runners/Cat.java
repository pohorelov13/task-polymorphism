package run.runners;

public class Cat extends Runner {

    private int total;

    public Cat(String name, int runDistance, int jumpHeight) {
        super(name, runDistance, jumpHeight);
    }

    @Override
    public void run() {
        total++;
        System.out.printf("Meow, meow\nOvercome %d obstacle\n\n", total);

    }

    @Override
    public void jump() {
        total++;
        System.out.printf("Meow, meow, meow\nOvercome %d obstacle\n\n", total);
    }
}
