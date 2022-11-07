package run.runners;

public class Cat extends Runner {

    public Cat(String name, int runDistance, int jumpHeight) {
        super(name, runDistance, jumpHeight);
    }

    @Override
    public void run() {
        System.out.print("\nMeow, meow\n");

    }

    @Override
    public void jump() {
        System.out.print("\nMeow, meow, meow\n");
    }
}
