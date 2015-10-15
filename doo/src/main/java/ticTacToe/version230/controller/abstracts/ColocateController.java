package ticTacToe.version230.controller.abstracts;

import ticTacToe.version230.model.entities.Board;
import ticTacToe.version230.model.entities.Color;
import ticTacToe.version230.model.entities.Turn;
import ticTacToe.version230.view.abstracts.View;

public abstract class ColocateController extends Controller {
	
	protected ColocateController(Board board, Turn turn) {
		super(board, turn);
	}
	
	public Color getColor() {
		return Color.values()[turn.take()];
	}
	
	public boolean isGameOver() {
		return board.existTicTacToe(Color.values()[turn.take()]);
	}

	public void close() {
		turn.change();		
	}
	
	public abstract void recibir(View gameView) ;
}
