package run;

import run.obstacles.Obstacle;
import run.obstacles.Racetrack;
import run.obstacles.Wall;
import run.runners.Cat;
import run.runners.Human;
import run.runners.Robot;
import run.runners.Runner;

public class Main {

    public static void main(String[] args) {
        handleData();
    }

    static void handleData() {
        Runner ivan = new Human("Ivan", 1500, 2);
        Runner taras = new Human("Taras", 2500, 3);
        Runner ilon = new Robot("ILON", 10000, 20);
        Runner barsik = new Cat("Barsik", 500, 2);
        Obstacle racetrack = new Racetrack("racetrack", 500);
        Obstacle racetrack2 = new Racetrack("racetrack", 1500);
        Obstacle racetrack3 = new Racetrack("racetrack", 2000);
        Obstacle racetrack4 = new Racetrack("racetrack", 3000);

        Obstacle wall = new Wall("wall", 2);
        Obstacle wall1 = new Wall("wall", 1);
        Obstacle wall2 = new Wall("wall", 3);
        Obstacle wall3 = new Wall("wall", 4);

        Obstacle[] obstacles = new Obstacle[]{racetrack, wall, racetrack2, wall1, racetrack3, wall2, racetrack4, wall3};
        Runner[] runners = new Runner[]{ivan, barsik, taras, ilon};

        for (Runner r : runners) {
            for (Obstacle o : obstacles) {
                if (!o.overcome(r)) {
                    break;
                }
            }
        }
    }
}