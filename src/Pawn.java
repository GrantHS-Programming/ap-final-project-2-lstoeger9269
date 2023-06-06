public class Pawn extends Piece{

    public Pawn(boolean taken, boolean isWhite){
        super(taken,isWhite);
    }

    public boolean canMove(Place start, Place end){
        if (end.getPiece().getWhite() == this.getWhite()){
            return false;
        }

        int x = Math.abs(start.getX() - end.getX());
        int y = Math.abs(start.getY() - end.getY());
        if (x + y == 1){
            return true;
        }
        else{
            return false;
        }

    }
}
