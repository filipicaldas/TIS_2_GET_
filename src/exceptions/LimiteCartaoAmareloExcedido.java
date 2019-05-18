package exceptions;

@SuppressWarnings("serial")
public class LimiteCartaoAmareloExcedido extends Exception {
	private final static Integer LIMITE_AMARELO = 3;

	
	public LimiteCartaoAmareloExcedido() {
		super("Limite de cartoes excedido. O jogador pode ter no máximo " + LIMITE_AMARELO + " cartoes amarelos.");
}
}
