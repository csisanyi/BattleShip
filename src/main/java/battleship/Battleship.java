package battleship;

public class Battleship extends Ship {

    public Battleship(String coordinate, String direction) {
        this.coordinate = coordinate;
        this.direction = direction;
        this.size = 4;
    }
}
