package ticTacToe.version230.controller.concretes;

import ticTacToe.version230.controller.abstracts.PutController;
import ticTacToe.version230.model.entities.Board;
import ticTacToe.version230.model.entities.Coordinate;
import ticTacToe.version230.model.entities.Turn;
import ticTacToe.version230.view.abstracts.View;

public class ManualPutController extends PutController {
	
	protected ManualPutController(Board board, Turn turn){
		super(board, turn);
	}
	
	public boolean isPosiblePut(Coordinate coordinate){
		return board.empty(coordinate);
	}
	
	@Override
	public void recibir(View gameView) {
		gameView.atender(this);
	}

}
