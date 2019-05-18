package exceptions;

@SuppressWarnings("serial")
public class LimiteCartaoVermelhoExcedido extends Exception {
	private final static Integer LIMITE_VERMELHO = 1;

	
	public LimiteCartaoVermelhoExcedido() {
		super("Limite de cartoes excedido. O jogador pode ter no m�ximo " + LIMITE_VERMELHO + " cartoes vermelhos.");
}
}
