package ticTacToe.version230.controller.concretes;

import ticTacToe.version230.controller.abstracts.PutController;
import ticTacToe.version230.model.entities.Board;
import ticTacToe.version230.model.entities.Coordinate;
import ticTacToe.version230.model.entities.Turn;
import ticTacToe.version230.view.abstracts.View;

public class AutomaticPutController extends PutController {

	protected AutomaticPutController(Board board, Turn turn) {
		super(board, turn);
	}

	public Coordinate getTarget() {
		Coordinate target;
		do {
			target = Coordinate.random();
		} while (!board.empty(target));
		return target;
	}
	
	@Override
	public void recibir(View gameView) {
		gameView.atender(this);
	}

}
