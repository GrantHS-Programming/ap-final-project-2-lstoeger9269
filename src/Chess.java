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
    Place rook3 = new Place(7,0,new Rook(false,false));
    Place rook4 = new Place(7,7,new Rook(false,false));
    Place knight3 = new Place(7,1,new Knight(false,false));
    Place bishop3 = new Place(7,2,new Bishop(false,false));
    Place king2 = new Place(7,3,new King(false,false));
    Place queen2 = new Place(7,4,new Queen(false,false));
    Place bishop4 = new Place(7,5,new Bishop(false,false));
    Place knight4 = new Place(7,6,new Knight(false,false));
    Place pawn = new Place(1,0,new Pawn(false,true));
    Place pawn2 = new Place(1,1,new Pawn(false,true));
    Place pawn3 = new Place(1,2,new Pawn(false,true));
    Place pawn4 = new Place(1,3,new Pawn(false,true));
    Place pawn5 = new Place(1,4,new Pawn(false,true));
    Place pawn6 = new Place(1,5,new Pawn(false,true));
    Place pawn7 = new Place(1,6,new Pawn(false,true));
    Place pawn8 = new Place(1,5,new Pawn(false,true));
    Place pawn9 = new Place(1,5,new Pawn(false,true));
    Place pawn10 = new Place(1,5,new Pawn(false,true));
    Place pawn11 = new Place(1,5,new Pawn(false,true));
    Place pawn12 = new Place(1,5,new Pawn(false,true));
    Place pawn13 = new Place(1,5,new Pawn(false,true));
    Place pawn14 = new Place(1,5,new Pawn(false,true));
    Place pawn15 = new Place(1,5,new Pawn(false,true));
    Place pawn16 = new Place(1,5,new Pawn(false,true));



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
                if (position[i][j].equals(pawn) ){
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
                 if (position[i][j].equals(pawn9) || position[i][j].equals(pawn10) || position[i][j].equals(pawn11) || position[i][j].equals(pawn12) || position[i][j].equals(pawn13) || position[i][j].equals(pawn14) || position[i][j].equals(pawn15) || position[i][j].equals(pawn16)) {
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
        position[7][1] = knight3;
        position[7][2] = bishop3;
        position[7][3] = king2;
        position[7][4] = queen2;
        position[7][5] = bishop4;
        position[7][6] = knight4;
        position[7][7] = rook4;
        position[6][0] = pawn9;
        position[6][1] = pawn10;
        position[6][2] = pawn11;
        position[6][3] = pawn12;
        position[6][4] = pawn13;
        position[6][5] = pawn14;
        position[6][6] = pawn15;
        position[6][7] = pawn16;

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
