package BoardGame;

public class Piece {
	protected Position position;
	private Board board;
	public Piece(Board board) {
		this.board = board;
		position = null; //apenas didatico pois sem essa linha o position já seria criado como nulo
	}
	protected Board getBoard() { //protected -> apenas subclasses ou classes do mesmo pacote podem acessar
		return board;
	}
	 
}
