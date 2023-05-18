public class Place {

    private Piece piece;
    private int x;
    private int y;

    public Place(int x, int y, Piece piece){
        this.setPiece(piece);
        this.setX(x);
        this.setY(y);

    }
    public void setPiece(Piece p){
        this.piece = p;

    }
    public Piece getPiece(){

        return this.piece;

    }
    public int getX(){

        return this.x;

    }

    public void setX(int x){

        this.x = x;

    }

    public int getY(){

        return this.y;

    }

    public void setY(int y){

        this.y = y;

    }

}
