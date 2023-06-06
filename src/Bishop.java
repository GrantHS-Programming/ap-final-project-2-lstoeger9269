public class Bishop extends Piece{


    public Bishop(boolean taken, boolean isWhite){
        super(taken,isWhite);
    }
    public boolean canMove(Place start, Place end){
        if (end.getPiece().getWhite() == this.getWhite()){
            return false;
        }
        int x = Math.abs(start.getX() - end.getX());
        int y = Math.abs(start.getY() - end.getY());

        if (start.getX() >= 7 || start.getX() <= 0 || start.getY() >= 7 || start.getY() <= 0){
            return false;
        }

        if (x != y){
            return false;
        }
        else if(pieceInWayDiagonal(start, end)){
            return false;

        }
        else{
            return true;
        }



    }

    public boolean pieceInWayDiagonal(Place start, Place end){

        int directionX = start.getX() > end.getX() ? 1 : -1;
        int directionY = start.getY() > end.getY() ? 1 : -1;

        for (int i = 0; i < Math.abs(start.getX() - end.getX())-1; ++i) {
            if (pieceAt(end)){
                return false;
            }

        }
        return true;
    }


}
