public class Move {

    private Place start;
    private Place end;
    private Piece pieceMoved;
    private Piece pieceKilled;

    public Move(Place start, Place end){

        this.start = start;
        this.end = end;
        this.pieceMoved = start.getPiece();


    }
    public boolean isCastlingMove(){
        return this.isCastlingMove();
    }
    public void setCastlingMove(boolean castlingMove){
        this.isCastlingMove();

    }



}
