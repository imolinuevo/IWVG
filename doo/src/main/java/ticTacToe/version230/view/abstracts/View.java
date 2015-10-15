package ticTacToe.version230.view.abstracts;

import ticTacToe.version230.controller.concretes.AutomaticMoveController;
import ticTacToe.version230.controller.concretes.AutomaticPutController;
import ticTacToe.version230.controller.concretes.ManualMoveController;
import ticTacToe.version230.controller.concretes.ManualPutController;

public interface View {

	void render();

	void atender(ManualPutController manualPutController);

	void atender(ManualMoveController manualMoveController);
	
	void atender(AutomaticPutController automaticPutController);

	void atender(AutomaticMoveController automaticMoveController);
}
