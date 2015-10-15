package ticTacToe.version230.view.movements;

import ticTacToe.version230.controller.abstracts.Controller;
import ticTacToe.version230.controller.concretes.AutomaticMoveController;
import ticTacToe.version230.model.entities.Coordinate;
import ticTacToe.version230.model.utils.IO;
import ticTacToe.version230.view.abstracts.BoardView;

public class AutomaticMoveView {

	private AutomaticMoveController automaticMoveController;
	
	public AutomaticMoveView(Controller controller){
		this.automaticMoveController = (AutomaticMoveController) controller;
	}
	
	public void render() {
		char colorValue = automaticMoveController.getColor().getValue();
		IO io = new IO();
		io.writeln("Mueve el jugador " + colorValue);
		Coordinate origin = automaticMoveController.getOrigin();
		io.writeln("Se va a quita un " + colorValue + " de " + origin);
		io.readString("Pulse <Enter> para continuar");
		automaticMoveController.remove(origin);
		Coordinate target = automaticMoveController.getTarget(origin);
		io.writeln("Se va a poner un " + colorValue + " en " + target);
		io.readString("Pulse <Enter> para continuar");
		automaticMoveController.put(target);
		new BoardView(automaticMoveController.getBoard()).render();
		if (automaticMoveController.isGameOver()) {
			io.writeln("Victoria!!!! " 
					+ colorValue + "! "
					+ colorValue + "! "
					+ colorValue + "! Victoria!!!!");
		} else {
			automaticMoveController.close();
		}
	}
}
