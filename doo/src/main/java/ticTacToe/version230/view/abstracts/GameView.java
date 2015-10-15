package ticTacToe.version230.view.abstracts;

import ticTacToe.version230.controller.abstracts.ColocateController;
import ticTacToe.version230.controller.concretes.AutomaticMoveController;
import ticTacToe.version230.controller.concretes.AutomaticPutController;
import ticTacToe.version230.controller.concretes.ColocateControllerFactory;
import ticTacToe.version230.controller.concretes.ManualMoveController;
import ticTacToe.version230.controller.concretes.ManualPutController;
import ticTacToe.version230.view.movements.AutomaticMoveView;
import ticTacToe.version230.view.movements.AutomaticPutView;
import ticTacToe.version230.view.movements.ManualMoveView;
import ticTacToe.version230.view.movements.ManualPutView;

public class GameView implements View {

	private ColocateControllerFactory colocateControllerFactory;

	public GameView(ColocateControllerFactory colocateControllerFactory) {
		this.colocateControllerFactory = colocateControllerFactory;
	}

	public void render() {
		ColocateController controller;
		do {
			controller = colocateControllerFactory.getController();
			if (controller != null) {
				controller.recibir(this);
			}
		} while (controller != null);
	}

	public void atender(ManualPutController manualPutController) {
		new ManualPutView(manualPutController).render();
	}

	public void atender(ManualMoveController manualMoveController) {
		new ManualMoveView(manualMoveController).render();
	}

	public void atender(AutomaticPutController automaticPutController) {
		new AutomaticPutView(automaticPutController).render();
	}

	public void atender(AutomaticMoveController automaticMoveController) {
		new AutomaticMoveView(automaticMoveController).render();
	}

}
