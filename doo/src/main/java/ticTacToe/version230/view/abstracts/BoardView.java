package ticTacToe.version230.view.abstracts;

import ticTacToe.version230.model.entities.Board;
import ticTacToe.version230.model.entities.Coordinate;
import ticTacToe.version230.model.utils.IO;

public class BoardView {

	private BoardForView board;

	public BoardView(BoardForView board) {
		this.board = board;
	}

	public void render() {
		IO io = new IO();
		for (int i = 0; i < Board.DIMENSION; i++) {
			for (int j = 0; j < Board.DIMENSION; j++) {
				io.write(board.getColor(new Coordinate(i, j)).getValue() + " ");
			}
			io.writeln();
		}
	}
}
