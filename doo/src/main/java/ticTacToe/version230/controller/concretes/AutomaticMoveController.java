package ticTacToe.version230.controller.concretes;

import ticTacToe.version230.controller.abstracts.MoveController;
import ticTacToe.version230.model.entities.Board;
import ticTacToe.version230.model.entities.Coordinate;
import ticTacToe.version230.model.entities.Turn;
import ticTacToe.version230.view.abstracts.View;

public class AutomaticMoveController extends MoveController {

	protected AutomaticMoveController(Board board, Turn turn){
		super(board, turn);
	}

	public Coordinate getOrigin() {
		Coordinate origin;
		do {
			origin = Coordinate.random();
		} while (!board.full(origin, this.getColor()));
		return origin;
	}

	public Coordinate getTarget(Coordinate forbidden) {
		Coordinate target;
		boolean ok;
		do {
			target = Coordinate.random();
			ok = board.empty(target);
			if (ok) {
				ok = !target.equals(forbidden);
			}
		} while (!ok);
		return target;
	}
	
	@Override
	public void recibir(View gameView) {
		gameView.atender(this);
	}

}
