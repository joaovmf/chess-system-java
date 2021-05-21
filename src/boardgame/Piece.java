package boardgame;

public class Piece {
	protected Position position;
	private Board board;
	
	public Piece(Board board) {
		this.board = board;
		//position = null (automaticamente ele será nulo, escrevi apenas para fins didáticos)
	}

	protected Board getBoard() {
		return board;
	}

	
}


