public class Queen extends Piece {
    public Queen(boolean taken, boolean isWhite){
        super(taken,isWhite);
    }

    public boolean canMove(Place start, Place end){
        int x = Math.abs(start.getX() - end.getX());
        int y = Math.abs(start.getY() - end.getY());
        if (x + y == 1){
            return true;
        }
    }
}
