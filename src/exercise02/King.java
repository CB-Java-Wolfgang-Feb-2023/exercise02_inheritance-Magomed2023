package exercise02;

public class King extends chessPieces {

    public King(int count, String name, String color) {
        super(count, name, color);
    }


    @Override
    void movement() {
        super.movement();
        System.out.println("Moves from its square to a neighboring square.");
    }

    @Override
    void species() {
        super.species();
        System.out.println("The king is not a very powerful piece, as it can only move (or capture) one square in any direction. \nPlease note that the king cannot be captured! When a king is attacked, it is called check.");
    }
}