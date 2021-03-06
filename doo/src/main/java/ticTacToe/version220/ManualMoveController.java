package ticTacToe.version220;

public class ManualMoveController extends MoveController {
	
	protected ManualMoveController(Board board, Turn turn){
		super(board, turn);
	}
	
	public boolean isPosibleRemove(Coordinate origin){
		return board.full(origin, Color.values()[turn.take()]);
	}

	public boolean isPosibleMove(Coordinate origin, Coordinate target) {
		return !origin.equals(target) && board.empty(target);
	}
	
	@Override
	public void despachar(View gameView) {
		gameView.atender(this);
	}

}
