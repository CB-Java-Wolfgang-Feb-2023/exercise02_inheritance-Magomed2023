package exercise02;

public class Knight extends chessPieces {

    public Knight(int count, String name, String color) {
        super(count, name, color);
    }

    @Override
    void movement() {
        super.movement();
        System.out.println("The knight has a unique movement pattern. \nIt moves in an L-shape - two squares in a straight line (horizontally or vertically) and then one square perpendicular to that.");
    }

    @Override
    void species() {
        super.species();
        System.out.println("The knight is the only piece that can jump over other pieces.");
    }
}
