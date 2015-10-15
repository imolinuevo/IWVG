package ticTacToe.version230.view.concretes;

import ticTacToe.version230.controller.abstracts.ColocateController;
import ticTacToe.version230.controller.concretes.AutomaticMoveController;
import ticTacToe.version230.controller.concretes.AutomaticPutController;
import ticTacToe.version230.controller.concretes.ColocateControllerFactory;
import ticTacToe.version230.controller.concretes.ManualMoveController;
import ticTacToe.version230.controller.concretes.ManualPutController;
import ticTacToe.version230.view.abstracts.View;

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
