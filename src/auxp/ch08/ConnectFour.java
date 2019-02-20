package auxp.ch08;

import lib.Misc.IO;

import java.util.Arrays;

public class ConnectFour {
    public static void main(String[] args) {
        ConnectFour c4 = new ConnectFour();
        c4.startGame();
    }

    Board board;

    public class Board {
        int rows;
        int cols;
        char[][] board;

        public Board() {
            this(6, 7);
        }

        public Board(int rows, int cols) {
            this.rows = rows;
            this.cols = cols;
            board = new char[rows][cols];
            newBoard();
        }

        void newBoard() {
            for (int i = 0; i < board.length; i++) {
                Arrays.fill(board[i], ' ');
            }
        }

        boolean isFull(){
            for (int i = 0; i < board.length; i++) {
                for (int j = 0; j < board[i].length; j++) {
                    if ( board[i][j] == ' ')
                        return false;
                }
            }
            return true;
        }

        void printBoard() {
            for (int i = 0; i < board.length; i++) {
                String row = "";
                for (int j = 0, k = 0; k < (board[i].length * 2) + 1; k++) {
                    if (k % 2 == 0)
                        row += "|";
                    else
                        row += board[i][j++];
                }
                System.out.println(row);
            }
            char[] end = new char[(board[0].length * 2) + 1];
            Arrays.fill(end, '-');
            System.out.println(end);

        }

        Character gameOver() {
            //pre-check
            if (board.length < 4 || board[0].length < 4)
                return null;
            if(isFull())
                return ' ';
            //Rows
            for (int i = 0; i < board.length; i++) {
                for (int j = 0; j < board[i].length - 3; j++) {
                    if (board[i][j] != ' ' & board[i][j] == board[i][j + 1] && board[i][j] == board[i][j + 2] && board[i][j] == board[i][j + 3]) {
                        return board[i][j];
                    }
                }
            }
            //Cols
            for (int i = 0; i < board.length - 3; i++) {
                for (int j = 0; j < board[i].length; j++) {
                    if (board[i][j] != ' ' & board[i][j] == board[i + 1][j] && board[i][j] == board[i + 2][j] && board[i][j] == board[i + 3][j]) {
                        return board[i][j];
                    }
                }
            }
            //Diag
            for (int i = 0; i < board.length - 3; i++) {
                for (int j = 0; j < board[i].length - 3; j++) {
                    if (board[i][j] != ' ' & board[i][j] == board[i + 1][j + 1] && board[i][j] == board[i + 2][j + 2] && board[i][j] == board[i + 3][j + 3]) {
                        return board[i][j];
                    }
                }
            }
            //Diag
            for (int i = 0; i < board.length - 3; i++) {
                for (int j = 3; j < board[i].length; j++) {
                    if (board[i][j] != ' ' & board[i][j] == board[i + 1][j - 1] && board[i][j] == board[i + 2][j - 2] && board[i][j] == board[i + 3][j - 3]) {
                        return board[i][j];
                    }
                }
            }

            return null;
        }


        boolean isValidColumn(int column) {
            if (board[0].length < column || column < 1)
                return false;
            return lowestRowInColumn(column) >= 0;
        }

        void insertIntoColumn(int column, Player player) {
            board[lowestRowInColumn(column)][column - 1] = player.id;
        }

        int lowestRowInColumn(int column) {
            int columnIndex = column - 1;
            int lastRow = board.length - 1;
            if (board[lastRow][columnIndex] == ' ')
                return lastRow;
            else
                for (int row = 0; row < board.length; row++) {
                    if (board[row][columnIndex] != ' ')
                        return row - 1;

                }
            return -1;
        }
    }

    public enum Player {
        PLAYER1('X'), PLAYER2('O');
        char id;

        Player(char id) {
            this.id = id;
        }

    }

    void startGame() {
        board = new Board();
        Player p1 = Player.PLAYER1;
        Player p2 = Player.PLAYER2;

        int count = 0;
        while (board.gameOver() == null) {
            board.printBoard();
            enterColumn((count++ % 2 == 1) ? p1 : p2);
        }
        board.printBoard();
        System.out.println("Game " + ( board.gameOver() == ' ' ? "Tied" : "Over\n Winner is " + board.gameOver() ) );
    }

    void enterColumn(Player player) {
        int column = 0;
        do {
            System.out.println("Player " + player.id + " enter column to play ");
            column = IO.scanInt();
        } while (!board.isValidColumn(column));
        board.insertIntoColumn(column, player);
    }


}
