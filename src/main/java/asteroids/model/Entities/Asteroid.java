package asteroids.model.Entities;
import asteroids.model.Position;
import asteroids.model.Vector2d;

public class Asteroid extends MovingObject{

    private static final int points = 20;

    public Asteroid(Position position, Vector2d velocity, Integer size){
        super(position,velocity, size, size);
    }

    public int getPoints() {
        return points;
    }
}