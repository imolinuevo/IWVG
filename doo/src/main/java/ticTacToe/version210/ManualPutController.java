package ticTacToe.version210;

public class ManualPutController extends PutController {
	
	protected ManualPutController(Board board, Turn turn){
		super(board, turn);
	}
	
	public boolean isPosiblePut(Coordinate coordinate){
		return board.empty(coordinate);
	}

}
