package ticTacToe.version230.model.entities;

import ticTacToe.version230.controller.abstracts.TicTacToe;

public class Turn {

	int value = 0;
	
	public Turn() {
		value = 0;
	}
	
    public int take() {
        return value;
    }
    
    public int notTake() {
    	return (value +1)% TicTacToe.NUM_PLAYERS;
    }
    
    public void change() {
    	value = this.notTake();
    }
	
}
