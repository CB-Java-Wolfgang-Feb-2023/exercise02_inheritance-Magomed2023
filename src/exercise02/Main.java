package exercise02;

public class Main {
    public static void main(String[] args) {
        System.out.println(" ");

        King King = new King(1, "Heinrich VIII", "Black");
        King.printChess();
        King.movement();
        King.species();
        System.out.println(" ||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");

        Pawn Pawn = new Pawn(2, "Arthur", "White");
        Pawn.printChess();
        Pawn.movement();
        Pawn.species();
        System.out.println(" ||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");

        Knight Knight = new Knight(2,"Karl", "Black");
        Knight.printChess();
        Knight.movement();
        Knight.species();
        System.out.println(" ||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");




    }
}
