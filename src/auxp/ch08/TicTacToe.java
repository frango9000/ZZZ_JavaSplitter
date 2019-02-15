package auxp.ch08;

import lib.Misc.IO;

public class TicTacToe {
    public static void main() {
        TicTacToe game = new TicTacToe();
        game.startGame();
    }
    public class Board {
        char[][] board = {{' ',' ',' '},{' ',' ',' '},{' ',' ',' '}};


        void printBoard(){
            String line = "-------------";
            System.out.println(line);
            for (int i = 0; i < board.length; i++) {
                System.out.printf("| %c | %c | %c |%n", board[i][0], board[i][1], board[i][2]);
                System.out.println(line);
            }
        }
        boolean gameOver(){
            for (int i = 0; i < board.length; i++) {
                if( board[i][0] != ' ' && ( board[i][0] == board[i][1] && board[i][1] == board[i][2] ) ) {
                    return true;
                }
            }
            for (int i = 0; i < board.length; i++) {
                if( board[0][i] != ' ' && ( board[0][i] == board[1][i] && board[1][i] == board[2][i] ) ) {
                    return true;
                }
            }
            if( board[0][0] != ' ' && ( board[0][0] == board[1][1] && board[1][1] == board[2][2] ) ){
                return true;
            }else if ( board[0][2] != ' ' && ( board[0][2] == board[1][1] && board[1][1] == board[2][0] ) ){
                return true;
            }
            return false;
        }

        boolean validCoords(int[] coords){
            return (board[coords[0]-1][coords[1]-1] == ' ');
        }

        void markCoord(int[] coords, Player player){
            board[coords[0]-1][coords[1]-1] = player.id;
        }
    }
    public class Player{
        char id;

        public Player(int num) {
            id = (num == 1) ? 'X' : 'O';
        }
    }

    void startGame(){
        Board game = new Board();
        Player p1 = new Player(1);
        Player p2 = new Player(2);

        int count = 0;
        while(!game.gameOver()){
            game.printBoard();
            playerTurn( ( count++ % 2 == 1 ) ? p1 : p2, game);
        }
        game.printBoard();
        System.out.println("Game Over");
    }

    int[] enterCoords(Player player){
        int[] coords = new int[2];
        do {
            System.out.println("Player " + player.id + " enter coords x , y: ");
            int x = IO.scanInt();
            int y = IO.scanInt();
            if(x >= 1 && x <= 3 && y >=1 && y <=3){
                coords[0]=x;
                coords[1]=y;
            }
        }while ( coords[0] == 0 && coords[1] == 0 );
        return coords;
    }
    void playerTurn(Player player, Board board){
        int[] coords = {0,0};
        do{
        coords = enterCoords(player);
        }while(!board.validCoords(coords));
        board.markCoord(coords, player);
    }


}
