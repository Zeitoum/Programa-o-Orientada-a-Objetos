package cartao;

public class UsaCC {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CartaoDeCredito cc1 = new CartaoDeCredito();
		cc1.compra(100);
		cc1.compra(500);
		cc1.pagamento(400);
		cc1.compra(150);
		System.out.println("Saldo  = " +cc1.retornaSaldo());
		System.out.println("Bonus  = " +cc1.retornaBonus());

	}

}
