package ticTacToe.version230.model.entities;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import ticTacToe.version230.controller.abstracts.TicTacToe;
import ticTacToe.version230.model.utils.Direction;
import ticTacToe.version230.view.abstracts.BoardForView;

public class Board implements BoardForView {

	private Map<Integer, Set<Coordinate>> coordinates;

	public static final int DIMENSION = 3;

	public Board() {
		coordinates = new HashMap<>();
		for (int i = 0; i < TicTacToe.NUM_PLAYERS; i++) {
			coordinates.put(i, new HashSet<>());
		}
	}

	public Color getColor(Coordinate coordinate) {
		assert coordinate != null;
		for (int i = 0; i < TicTacToe.NUM_PLAYERS; i++) {
			if (coordinates.get(i).contains(coordinate)) {
				return Color.values()[i];
			}
		}
		return Color.NONE;
	}

	public boolean complete() {
		int contTokens = 0;
		for (int i = 0; i < TicTacToe.NUM_PLAYERS; i++) {
			contTokens += coordinates.get(i).size();
		}
		return contTokens == Board.DIMENSION * TicTacToe.NUM_PLAYERS;
	}

	public boolean existTicTacToe() {
		return this.existTicTacToe(Color.XS) || this.existTicTacToe(Color.OS);
	}

	public boolean existTicTacToe(Color color) {
		Set<Coordinate> coordinateSet = coordinates.get(color.ordinal());
		if (coordinateSet.size() != Board.DIMENSION) {
			return false;
		}
		Coordinate[] coordinateArray = coordinateSet.toArray(new Coordinate[0]);
		Direction direction = coordinateArray[0].direction(coordinateArray[1]);
		if (direction == Direction.NON_EXISTENT) {
			return false;
		}
		for (int i = 1; i < Board.DIMENSION - 1; i++) {
			if (coordinateArray[i].direction(coordinateArray[i + 1]) != direction) {
				return false;
			}
		}
		return true;
	}

	public boolean empty(Coordinate coordinate) {
		assert coordinate != null;
		return !this.full(coordinate, Color.XS) && !this.full(coordinate, Color.OS);
	}

	public void put(Coordinate coordinate, Color color) {
		assert coordinate != null;
		assert color != Color.NONE;
		coordinates.get(color.ordinal()).add(coordinate);
	}

	public void remove(Coordinate coordinate, Color color) {
		assert coordinate != null;
		assert color != Color.NONE;
		coordinates.get(color.ordinal()).remove(coordinate);
	}

	public boolean full(Coordinate coordinate, Color color) {
		assert coordinate != null;
		assert color != Color.NONE;
		return coordinates.get(color.ordinal()).contains(coordinate);
	}

}
