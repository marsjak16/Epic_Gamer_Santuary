//Tic tac toe

public class TicTacToe {
	
	private int turn;
	private int[][] board = new int[3][3];
	
	public TicTacToe() {
		turn = 1;
		
		// fill board
		for(int i = 0; i < board.length; i++) {
			for(int j = 0; j < board[i].length; j++) {
				board[i][j] = 0;
			}
		}
		
	}
	
	public boolean move(int player, int xSpot, int ySpot) {
		if(player == turn) {
			if(board[ySpot][xSpot] == 0) {
				board[ySpot][xSpot] = turn;
				
				if(turn == 1) {
					turn = 2;
				}
				else if(turn == 2) {
					turn = 1;
				}
				
				return true;
			}
			else {
				return false;
			}
		}
		else {
			return false;
		}
	}
	
	public int gameOver() {
		if((board[0][0] == board[0][1] & board[0][1] == board[0][2] & board[0][2] != 0) | 
			(board[1][0] == board[1][1] & board[1][1] == board[1][2] & board[1][2] != 0) | 
			(board[2][0] == board[2][1] & board[2][1] == board[2][2] & board[2][2] != 0) |
			(board[0][0] == board[1][0] & board[1][0] == board[2][0] & board[2][0] != 0) | 
			(board[0][1] == board[1][1] & board[1][1] == board[2][1] & board[2][1] != 0) | 
			(board[0][2] == board[1][2] & board[1][2] == board[2][2] & board[2][2] != 0) |
			(board[0][0] == board[1][1] & board[1][1] == board[2][2] & board[2][2] != 0) |
			(board[0][2] == board[1][1] & board[1][1] == board[2][0] & board[2][0] != 0)) {
			
			return 1;
		}
		
		else {
			// checking for CAT game
			int numZeros = 0;
			for(int i = 0; i < board.length; i++) {
				for(int j = 0; j < board[i].length; j++) {
					if(board[i][j] == 0) {
						numZeros++;
					}
				}
			}
			if(numZeros == 0) {
				return 2;
			}
			else {
				// else game not ended
			return 0;
			}
		}
	}
	
	public int whoWon() {
		if(turn == 1) {
			return 2;
		}
		else {
			return 1;
		}
	}
	
	
	
	
	public int[][] getBoard() {
		return board;
	}
	
	
	//Use for testing, might not need in real game
	public String getBoardStr() {
		String str = "";
		for(int i = 0; i < board.length; i++) {
			for(int j = 0; j < board[i].length; j++) {
				str += board[i][j];
			}
			str += "\n";
		}
		return str;
	}
	
	public int getTurn() {
		return turn;
	}
}