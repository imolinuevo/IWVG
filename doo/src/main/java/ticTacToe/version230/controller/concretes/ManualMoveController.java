package ticTacToe.version230.controller.concretes;

import ticTacToe.version230.controller.abstracts.MoveController;
import ticTacToe.version230.model.entities.Board;
import ticTacToe.version230.model.entities.Coordinate;
import ticTacToe.version230.model.entities.Turn;
import ticTacToe.version230.model.enums.Color;
import ticTacToe.version230.view.abstracts.View;

public class ManualMoveController extends MoveController {
	
	protected ManualMoveController(Board board, Turn turn){
		super(board, turn);
	}
	
	public boolean isPosibleRemove(Coordinate origin){
		return board.full(origin, Color.values()[turn.take()]);
	}

	public boolean isPosibleMove(Coordinate origin, Coordinate target) {
		return !origin.equals(target) && board.empty(target);
	}
	
	@Override
	public void recibir(View gameView) {
		gameView.atender(this);
	}

}
