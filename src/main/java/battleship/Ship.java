package battleship;

public abstract class Ship {
    /**
     * The coordinate of the ships head, in the form of A1, C5 etc.
     */
    protected String coordinate;

    /**
     * The length of the ship.
     */
    protected int size;

    /**
     * Directon of the ship, coordinate defines the position of the head,
     * horizonatl means it is downwards from the head, vertical means it
     * is to the left.
     *
     * Valid values are "horizontal" and "vertical"
     */
    protected String direction;
}
