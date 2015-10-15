package ticTacToe.version230.view.abstracts;

import ticTacToe.version230.model.entities.Coordinate;
import ticTacToe.version230.model.enums.Color;

public interface BoardForView {

	Color getColor(Coordinate coordinate);
}
