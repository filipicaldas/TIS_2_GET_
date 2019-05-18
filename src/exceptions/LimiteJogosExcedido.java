package exceptions;

@SuppressWarnings("serial")
public class LimiteJogosExcedido extends Exception {
	public LimiteJogosExcedido(int jogos) {
		super("Limite de partidas excedida. Esse campeonato pode ter no m�ximo " + jogos + " jogos.");
	}
}