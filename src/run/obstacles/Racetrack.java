package run.obstacles;

import run.runners.Runner;

public class Racetrack extends Obstacle {

    public Racetrack(String name, int size) {
        super(name, size);
    }

    @Override
    public boolean overcome(Runner r) {
        boolean b;
        if (getSize() <= r.getRunDistance()) {
            System.out.printf("Runner %s overcomes an obstacle %s. " + "Obstacle size - %d m.\n",
                    r.getName(), getName(), getSize());
            r.run();
            b = true;
        } else {
            System.out.printf("""
                    Runner %s drops out of obstacle course %s. Obstacle size - %d m.

                    """, r.getName(), getName(), getSize());
            b = false;
        }
        return b;
    }
}