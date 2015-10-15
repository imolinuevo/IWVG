package ticTacToe.version230.controller.concretes;

import ticTacToe.version230.controller.abstracts.Controller;
import ticTacToe.version230.model.entities.Board;
import ticTacToe.version230.model.entities.Turn;

public class StartController extends Controller {

	ColocateControllerFactory colocateControllerFactory;
	
	public StartController(Board board, Turn turn, ColocateControllerFactory colocateControllerFactory) {
		super(board, turn);
		this.colocateControllerFactory = colocateControllerFactory;
	}

	public void control(int numPlayers) {
		colocateControllerFactory.setNumPlayers(numPlayers);
	}

}
