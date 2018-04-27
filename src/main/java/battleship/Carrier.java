package battleship;

public class Carrier extends Ship {

    public Carrier(String coordinate, String direction) {
        this.coordinate = coordinate;
        this.direction = direction;
        this.size = 5;
    }
}
