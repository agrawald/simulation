package common;

/**
 * Created by Dheeraj Agrawal on 21/02/17.
 * Class to hold the coordinates on the board
 */
public class Coordinates {
    /**
     * The x coordinate
     */
    private int x;

    /**
     * The y coordinate
     */
    private int y;

    /**
     * Constructor
     *
     * @param x the x coordinate
     * @param y the y coordinate
     */
    public Coordinates(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Get x coordinate
     *
     * @return x coordinate
     */
    public int getX() {

        return x;
    }

    /**
     * Increment the x coordinate by number of steps
     *
     * @param step number of step to Increment
     */
    public void addX(int step) {
        this.x += step;
    }

    /**
     * Get y coordinate
     *
     * @return y coordinate
     */
    public int getY() {
        return y;
    }

    /**
     * Increment the y coordinate by number of steps
     *
     * @param step number of step to Increment
     */
    public void addY(int step) {
        this.y += step;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    @Override
    public Coordinates clone() {
        Coordinates coordinates = new Coordinates(this.x, this.y);
        return coordinates;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Coordinates that = (Coordinates) o;

        if (x != that.x) return false;
        if (y != that.y) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = x;
        result = 31 * result + y;
        return result;
    }
}
