package ticTacToe.version230.model.enums;

public enum Color {
	XS('x'),
	OS('o'),
	NONE('_');
	
	private char value;
	
	private Color(char value){
		this.value = value;
	}
	
	public char getValue() {
		return value;
	}
}
