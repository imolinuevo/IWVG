package ticTacToe.version230.view.movements;

import ticTacToe.version230.controller.abstracts.Controller;
import ticTacToe.version230.controller.concretes.AutomaticPutController;
import ticTacToe.version230.model.entities.Coordinate;
import ticTacToe.version230.model.utils.IO;
import ticTacToe.version230.view.abstracts.BoardView;

public class AutomaticPutView {

	private AutomaticPutController automaticPutController;
	
	public AutomaticPutView(Controller controller){
		this.automaticPutController = (AutomaticPutController) controller;
	}
	
	public void render() {
		char colorValue = automaticPutController.getColor().getValue();
		IO io = new IO();
		io.writeln("Pone el jugador " + colorValue);
		Coordinate target = automaticPutController.getTarget();
		io.writeln("Se va a colocar un " + colorValue + " en " + target);
		io.readString("Pulse <Enter> para continuar");
		automaticPutController.put(target);
		new BoardView(automaticPutController.getBoard()).render();
		if (automaticPutController.isGameOver()) {
			io.writeln("Victoria!!!! " 
					+ colorValue + "! "
					+ colorValue + "! "
					+ colorValue + "! Victoria!!!!");
		} else {
			automaticPutController.close();
		}
	}
}
