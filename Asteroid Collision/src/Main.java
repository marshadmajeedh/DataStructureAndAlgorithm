import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        int[] asteroids = {10, 2, -5, 8, -8, 3, -10};
        Stack<Integer> asteroidList = ReturnTheStateOfTheAsteroids.states(asteroids);
        System.out.println (asteroidList);
    }
}