package exercise02;

public class Pawn extends chessPieces {

    public Pawn(int count, String name, String color) {
        super(count, name, color);
    }

    @Override
    void movement() {
        super.movement();
        System.out.println("Pawns are the most numerous pieces on the board. \nThey move forward one square, but they capture diagonally. \nOn their first move, they have the option to move two squares forward.");
    }

    @Override
    void species() {
        super.species();
        System.out.println("Pawns have a special move called \"en passant\" that allows them to capture an opponent's pawn under specific conditions.");
    }
}
