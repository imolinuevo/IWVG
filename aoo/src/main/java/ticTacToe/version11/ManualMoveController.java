package ticTacToe.version11;

public class ManualMoveController extends ColocateController {

	public ManualMoveController(Board board, Player player) {
		super(board, player);
	}

	public void control() {
		IO io = new IO();
		io.writeln("Mueve el jugador " + player.getToken().getValue());
		Coordinate origin = new Coordinate();
		Coordinate target = new Coordinate();
		boolean ok;
		do {
			io.writeln("De qué casilla?");
			origin.read();
			ok = board.full(origin, player.getToken());
			if (!ok) {
				io.writeln("Esa casilla no está ocupada por ninguna de tus fichas");
			}
		} while (!ok);
		do {
			io.writeln("A qué casilla?");
			target.read();
			ok = board.empty(target);
			if (!ok) {
				io.writeln("Esa casilla no está vacía");
			}
		} while (!ok);
		board.put(origin, new Token('_'));
		board.put(target, player.getToken());
		board.write();
		if (board.existTicTacToe()){
			player.win();
		}
	}
}
