package boardgame;

public class Piece {
	protected Position position;
	private Board board;
	
	public Piece(Board board) {
		this.board = board;
		//position = null (automaticamente ele ser� nulo, escrevi apenas para fins did�ticos)
	}

	protected Board getBoard() {
		return board;
	}

	
}


