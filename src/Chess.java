import java.util.Scanner;

public class Chess {

    Scanner uChoice = new Scanner(System.in);
    public static void main(String[] args) {
        new Chess();
    }
    public Chess(){


        resetBoard();

        printBoard();


    }

    Place rook = new Place(0,0,new Rook(false,true));
    Place knight = new Place(0,1,new Knight(false,true));
    Place bishop = new Place(0,2,new Bishop(false,true));
    Place king = new Place(0,3,new King(false,true));
    Place queen = new Place(0,4,new Queen(false,true));
    Place bishop2 = new Place(0,5,new Bishop(false,true));
    Place knight2 = new Place(0,6,new Knight(false,true));
    Place rook2 = new Place(0,7,new Rook(false,true));
    Place pawn = new Place(1,0,new Pawn(false,true));
    Place rook3 = new Place(7,0,new Rook(false,true));
    Place knight3 = new Place(7,1,new Knight(false,true));
    Place bishop3 = new Place(7,2,new Bishop(false,true));
    Place king2 = new Place(7,3,new King(false,true));
    Place queen2 = new Place(7,4,new Queen(false,true));
    Place bishop4 = new Place(7,5,new Bishop(false,true));
    Place knight4 = new Place(7,6,new Knight(false,true));
    Place rook4 = new Place(7,7,new Rook(false,true));
    Place pawn2 = new Place(6,0,new Pawn(false,true));

    Place[][] position = new Place[8][8];
    int[][] board = new int[8][8];

    public void printBoard(){
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                board[i][j] = i + j;
            }
        }
        System.out.println("   1  2  3  4  5  6  7  8   ");
        for (int i = 0; i < 2; i++) {
            System.out.print((char) ('a' + i) + " ");
            for (int j = 0; j < 8; j++) {

                if (position[i][j].equals(rook) || position[i][j].equals(rook2)){
                    System.out.print(" r ");
                }
                if (position[i][j].equals(bishop) || position[i][j].equals(bishop2)){
                    System.out.print(" b ");
                }
                if (position[i][j].equals(knight) || position[i][j].equals(knight2)){
                    System.out.print(" n ");
                }
                if (position[i][j].equals(king)){
                    System.out.print(" k ");
                }
                if (position[i][j].equals(queen)){
                    System.out.print(" q ");
                }
                if (position[i][j].getPiece().equals(new Pawn(false,true))){
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
            System.out.print((char) ('a' + i) + " ");
            for (int j = 0; j < 8; j++) {


                if (position[i][j].equals(rook3) || position[i][j].equals(rook4)) {
                    System.out.print(" r ");
                }
                 if (position[i][j].equals(bishop3) || position[i][j].equals(bishop4)) {
                    System.out.print(" b ");
                }
                 if (position[i][j].equals(knight3) || position[i][j].equals(knight4)) {
                    System.out.print(" n ");
                }
                 if (position[i][j].equals(king2)) {
                    System.out.print(" k ");
                }
                 if (position[i][j].equals(queen2)) {
                    System.out.print(" q ");
                }
                 if (position[i][j].equals(pawn2)) {
                    System.out.print(" p ");
                }


            }
            System.out.println();
        }
    }
    public void resetBoard(){




        position[0][0] = rook;
        position[0][1] = knight;
        position[0][2] = bishop;
        position[0][3] = king;
        position[0][4] = queen;
        position[0][5] = bishop2;
        position[0][6] = knight2;
        position[0][7] = rook2;
        position[7][0] = rook3;
        position[7][1] = knight;
        position[7][2] = bishop;
        position[7][3] = king;
        position[7][4] = queen;
        position[7][5] = bishop2;
        position[7][6] = knight2;
        position[7][7] = rook2;

        for (int i = 1; i < 2; i++) {
            for (int j = 0; j < 8; j++) {
                position[i][j] = pawn;

            }
        }


        for (int i = 6; i < 7; i++) {
            for (int j = 0; j < 8; j++) {
                position[i][j] = pawn;

            }
        }


    }

    public void game(){

        boolean win = false;
        while (!win){




        }



    }


}
