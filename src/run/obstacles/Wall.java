package run.obstacles;

import run.runners.Runner;

public class Wall extends Obstacle {
    public Wall(String name, int size) {
        super(name, size);
    }

    @Override
    public boolean overcome(Runner r) {
        boolean b;
        if (getSize() <= r.getJumpHeight()) {
            System.out.printf("Runner %s overcomes an obstacle %s. " + "Obstacle size - %d m.\n",
                    r.getName(), getName(), getSize());
            b = true;
            r.jump();
        } else {
            System.out.printf("""
                    Runner %s drops out of obstacle course %s. Obstacle size - %d ì.

                    """, r.getName(), getName(), getSize());
            b = false;
        }
        return b;
    }
}