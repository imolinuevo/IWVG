package ticTacToe.version230.controller.abstracts;

import ticTacToe.version230.model.entities.Board;
import ticTacToe.version230.model.entities.Turn;
import ticTacToe.version230.view.abstracts.BoardForView;

public abstract class Controller {
	
	protected Board board;
	
	protected Turn turn;
	
	protected Controller(Board board, Turn turn){
		assert board != null;
		assert turn != null;
		this.board = board;
		this.turn = turn;
	}

	public BoardForView getBoard() {
		return board;
	}
	
}
