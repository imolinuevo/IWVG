package ticTacToe.version230.controller.abstracts;

import ticTacToe.version230.model.entities.Board;
import ticTacToe.version230.model.entities.Turn;

public abstract class AutomaticColocateController extends ColocateController {

	protected AutomaticColocateController(Board board, Turn turn) {
		super(board, turn);
	}
	
	
}
