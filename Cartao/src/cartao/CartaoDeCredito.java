package cartao;

public class CartaoDeCredito {
	private int saldo = 0;
	private int limite = 10000;
	private int bonus;
	
	public void compra(int valor) {
		if(saldo+valor <= limite) {
			saldo = saldo + valor;
			creditaBonus(valor);
		}
	}
		
	private void creditaBonus(int valor) {
		if(saldo+valor <= limite) {
			bonus = bonus + valor;
		}
		
	}

	public void pagamento(int valor) {
			saldo = saldo - valor;
			creditaBonus(valor);
	}
	
	public int retornaSaldo() {
		return saldo;
	}
	
	public int retornaBonus() {
		return bonus;
	}
}
