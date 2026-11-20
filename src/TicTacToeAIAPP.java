import java.util.Scanner;

public class TicTacToeAIAPP {

        static Scanner userinput = new Scanner(System.in);
        char[][] board = {{'.','.','.'},{'.','.','.'},{'.','.','.'}};
        int turn = 1;
        char player = 'X';

        public void printBoard (){
            int i,j;
            System.out.println(" ");
            for (i=0;i<=2;i++) {
                for (j=0;j<=2;j++) {
                    System.out.print(board[i][j] + " ");
                }
                System.out.println(" ");
            }
        }
        public void move(int i, int j){
            board[i][j] = player;
            turn++;
        }
        public void unDoMove(int i, int j){
            board[i][j] = '.';
            turn--;
        }
        public void switchPlayers (){
            if (player == 'X') {player = 'O';}
            else player = 'X';
        }

        public boolean isLegal(int i, int j){
            return board[i][j] == '.';
        }

        public boolean winner(){
            int i;
            boolean test = false;
            for (i = 0; i<=2;i++)
            {
                if ((board[i][0]==board[i][1]) && (board[i][1]==board[i][2]) &&
                        (board[i][0]!='.'))
                {test = true;}
                if ((board[0][i]==board[1][i]) && (board[1][i]==board[2][i]) &&
                        (board[0][i]!='.'))
                {test = true;}
            }
            if ((board[0][0]==board[1][1]) && (board[1][1]==board[2][2]) &&
                    (board[0][0]!='.'))
            {test = true;}

            if ((board[2][0]==board[1][1]) && (board[1][1]==board[0][2]) &&
                    (board[2][0]!='.'))
            {test = true;}
            return test;
        }

        public void human() {
            int i,j;

            boolean test = false;  //have I found a place to go
            while (!test)
            {
                System.out.println("\nEnter Coordinates Where To Go Separated By A Space...");
                i = userinput.nextInt();
                j = userinput.nextInt();
                userinput.nextLine();
                if (isLegal(i - 1, j - 1)) {test = true; move(i-1,j-1);}
            }
        }
        public void ai(){

            // Win if possible

            //First row OO-
            if(board[0][0]=='O' && board[0][1]=='O' && isLegal(0,2)){
                move(0,2);
                return;
            }
            // First row O-O
            if(board[0][0]=='O' && board[0][2]=='O' && isLegal(0,1)){
                move(0,1);
                return;
            }

            // first row -OO
            if(board[0][1]=='O' && board[0][2]=='O' && isLegal(0,0)){
                move(0,0);
                return;
            }

            //second row OO-
            if(board[1][0]=='O' && board[1][1]=='O' && isLegal(1,2)) {
                move(1,2);
                return;
            }
            //second row O-O
            if(board[1][0]=='O' && board[1][2]=='O' && isLegal(1,1)){
                move(1,1);
                return;
            }
            //second row -OO
            if(board[1][1]=='O' && board[1][2]=='O' && isLegal(1,0)){
                move(1,0);
                return;
            }

            // Block player
            //First row XX-
            if(board[0][0]=='X' && board[0][1]=='X' && isLegal(0,2)){
                move(0,2);
                return;
            }
            //First row X-X
            if(board[0][0]=='X' && board[0][2]=='X' && isLegal(0,1)){
                move(0,1);
                return;
            }

            //First row -XX
            if(board[0][1]=='X' && board[0][2]=='X' && isLegal(0,0)){
                move(0,0);
                return;
            }

            //Second row XX-
            if(board[1][0]=='X' && board[1][1]=='X' && isLegal(1,2)){
                move(1,2);
                return;
            }
            //Second row X-X
            if(board[1][0]=='X' && board[1][2]=='X' && isLegal(1,1)){
                move(1,1);
                return;
            }
            //Second row -XX
            if(board[1][1]=='X' && board[1][2]=='X' && isLegal(1,0)){
                move(1,0);
                return;
            }

            // Take center
            if(isLegal(1,1)){
                move(1,1);
                return;
            }

            // Take corners
            if(isLegal(0,0)){
                move(0,0);
                return;
            }
            if(isLegal(0,2)){
                move(0,2);
                return;
            }
            if(isLegal(2,0)){
                move(2,0);
                return;
            }
            if(isLegal(2,2)){
                move(2,2);
                return;
            }

            // Random move
            boolean test = false;
            int i, j;

            while(!test){
                i = (int)(Math.random()*3);
                j = (int)(Math.random()*3);

                if(isLegal(i,j)){
                    move(i,j);
                    test = true;
                }
            }
            System.out.println("AI is moving...");

        }


    }
    class ExampleTicTacToe {
        static Scanner userinput = new Scanner(System.in);
        public static void main (String[] args) {
            TicTacToeAIAPP game = new TicTacToeAIAPP();
            game.printBoard();
            for (int i = 1;i<=5; i++) {
                game.human();
                game.printBoard();
                if ((game.winner()) || (i == 5)) {
                    break;
                }
                game.switchPlayers();
                game.ai();
                game.printBoard();
                if (game.winner()) {
                    break;
                }
                game.switchPlayers();
            }

            if (game.winner()) {
                System.out.println("\nThe winner is " + game.player);

            } else {System.out.println("\nCat Game.");}
        } //end main line
}
