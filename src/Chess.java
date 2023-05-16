public class Chess {
    public static void main(String[] args) {
        new Chess();
    }
    public Chess(){

        printBoard();


    }

    Piece[][] position = new Piece[8][8];
    int[][] board = new int[8][8];

    public void printBoard(){
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                board[i][j] = i + j;
            }
        }
        System.out.println("   1  2  3  4  5  6  7  8   ");
        for (int i = 0; i < 8; i++) {
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
    }

    public void game(){



    }


}
