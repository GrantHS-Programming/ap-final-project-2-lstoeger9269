public class King extends Piece{

    private boolean castlingDone = false;
    public King(boolean taken, boolean isWhite){
        super(taken,isWhite);
    }
    public boolean isCastlingDone(){
        return this.castlingDone;

    }
    public void setCastlingDone(boolean castlingDone){
        this.castlingDone = castlingDone;
    }


    public boolean canMove(Place start, Place end) {


        if (end.getPiece().getWhite() == this.getWhite()){
            return false;
        }

        int x = Math.abs(start.getX() - end.getX());
        int y = Math.abs(start.getY() - end.getY());
        if (x + y == 1){
            return true;
        }
        if (isCastlingDone()){
            return this.isValidCastling(start, end);

        }
        return pieceAt(end);

    }

    private boolean isValidCastling(Place start, Place end ){
        if (this.isCastlingDone()){
            return false;
        }
        else{
            return true;
        }
    }
}
