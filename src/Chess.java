import java.util.Scanner;

public class Chess {

    Scanner uChoice = new Scanner(System.in);
    public static void main(String[] args) {
        new Chess();
    }
    public Chess(){

        printBoard();


    }

    Place[][] position = new Place[8][8];
    int[][] board = new int[8][8];

    public void printBoard(){
        resetBoard();
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                board[i][j] = i + j;
            }
        }
        System.out.println("   1  2  3  4  5  6  7  8   ");
        for (int i = 0; i < 2; i++) {
            System.out.print((char) ('a' + i) + " ");
            for (int j = 0; j < 8; j++) {

                if (position[i][j].getPiece().equals(new Rook(false,false))){
                    System.out.print(" r ");
                }
                if (position[i][j].getPiece().equals(new Bishop(false,false))){
                    System.out.print(" b ");
                }
                if (position[i][j].getPiece().equals(new Knight(false,false))){
                    System.out.print(" n ");
                }
                if (position[i][j].getPiece().equals(new King(false,false))){
                    System.out.print(" k ");
                }
                if (position[i][j].getPiece().equals(new Queen(false,false))){
                    System.out.print(" q ");
                }
                if (position[i][j].getPiece().equals(new Pawn(false,false))){
                    System.out.print(" p ");
                }



            }
            System.out.println();
        }
        for (int i = 2; i < 6; i++) {
            System.out.print((char) ('a' + i) + " ");
            for (int j = 0; j < 8; j++) {
                if (board[i][j] % 2 != 0){
                    System.out.print(" o ");
                }
                if (board[i][j] % 2 == 0){
                    System.out.print(" x ");
                }
            }
            System.out.println();
        }
        for (int i = 6; i < 8; i++) {
            System.out.println((char) ('a' + i) + " ");
            for (int j = 0; j < 8; j++) {


                if (position[i][j].getPiece().equals(new Rook(false, false))) {
                    System.out.print(" r ");
                }
                else if (position[i][j].getPiece().equals(new Bishop(false, false))) {
                    System.out.print(" b ");
                }
                else if (position[i][j].getPiece().equals(new Knight(false, false))) {
                    System.out.print(" n ");
                }
                else if (position[i][j].getPiece().equals(new King(false, false))) {
                    System.out.print(" k ");
                }
                else if (position[i][j].getPiece().equals(new Queen(false, false))) {
                    System.out.print(" q ");
                }
                else if (position[i][j].getPiece().equals(new Pawn(false, false))) {
                    System.out.print(" p ");
                }


            }
        }
    }
    public void resetBoard(){

        position[0][0] = new Place(0,0, new Rook(false,true));
        position[0][1] = new Place(0,1, new Knight(false,true));
        position[0][2] = new Place(0,2, new Bishop(false,true));
        position[0][3] = new Place(0,3, new King(false,true));
        position[0][4] = new Place(0,4, new Queen(false,true));
        position[0][5] = new Place(0,5, new Bishop(false,true));
        position[0][6] = new Place(0,6, new Knight(false,true));
        position[0][7] = new Place(0,7, new Rook(false,true));

        for (int i = 1; i < 2; i++) {
            for (int j = 0; j < 8; j++) {
                position[i][j] = new Place(i, j, new Pawn(false,true));

            }
        }

        position[7][0] = new Place(7,0, new Rook(false,false));
        position[7][1] = new Place(7,1, new Knight(false,false));
        position[7][2] = new Place(7,2, new Bishop(false,false));
        position[7][3] = new Place(7,3, new Queen(false,false));
        position[7][4] = new Place(7,4, new King(false,false));
        position[7][5] = new Place(7,5, new Bishop(false,false));
        position[7][6] = new Place(7,6, new Knight(false,false));
        position[7][7] = new Place(7,7, new Rook(false,false));


        for (int i = 6; i < 7; i++) {
            for (int j = 0; j < 8; j++) {
                position[i][j] = new Place(i, j, new Pawn(false,true));

            }
        }


    }

    public void game(){

        boolean win = false;
        while (!win){




        }



    }


}
