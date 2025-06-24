package game;
import java.util.*; 
public class Main { 
    static char[][] board = {{' ', ' ', ' '}, {' ', ' ', ' '}, {' ', ' ', ' '}};
    
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in); 
        char player = 'X'; 
        for (int turn = 0; turn < 9; turn++) { 
            printBoard(); 
            System.out.println("Player " + player + ", enter row and column (0-2):"); 
            int r = sc.nextInt(); 
            int c = sc.nextInt(); 
            if (board[r][c] == ' ') { 
                board[r][c] = player;
                if (checkWin(player)) { 
                    printBoard(); 
                    System.out.println("Player " + player + " wins!"); 
                    return; 
                } 
                player = (player == 'X') ? 'O' : 'X'; 
            } 
            else { 
                System.out.println("Cell already taken, try again."); 
                turn--; 
            } 
        } 
        printBoard(); 
        System.out.println("It's a draw!"); 
    } 
    static void printBoard() { 
        for (char[] row : board) { 
            System.out.println(Arrays.toString(row)); 
        } 
    } 
    static boolean checkWin(char p) { 
        for (int i = 0; i < 3; i++) { 
            if (board[i][0] == p && board[i][1] == p && board[i][2] == p) return true; 
            if (board[0][i] == p && board[1][i] == p && board[2][i] == p) return true;
        } 
        return (board[0][0] == p && board[1][1] == p && board[2][2] == p) || 
        (board[0][2] == p && board[1][1] == p && board[2][0] == p); 
    } 

}

