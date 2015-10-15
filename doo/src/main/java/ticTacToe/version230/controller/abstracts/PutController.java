package ticTacToe.version230.controller.abstracts;

import ticTacToe.version230.model.entities.Board;
import ticTacToe.version230.model.entities.Color;
import ticTacToe.version230.model.entities.Coordinate;
import ticTacToe.version230.model.entities.Turn;

public abstract class PutController extends ColocateController {

	protected PutController(Board board, Turn turn) {
		super(board, turn);
	}
	
	public void put(Coordinate target) {
		board.put(target, Color.values()[turn.take()]);
	}

}
