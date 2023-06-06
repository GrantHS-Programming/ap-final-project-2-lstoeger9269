public class Piece {


    private boolean taken;
    private boolean isWhite;


    public Piece(boolean taken,boolean isWhite){
        this.taken = taken;
        this.isWhite = isWhite;
    }

    public boolean getTaken(){
        return taken;

    }


    public boolean getWhite() {
        return isWhite;
    }

    public void canMove(){



    }
    public boolean pieceAt(Place end) {
        return end.getPiece() != null;
    }


}
