
public class  Lampada {
	boolean acesa;
	public void acenderLampada() {
		acesa = true;
	}
	public void apagarLampada() {
		acesa = false;
	}
	public void mostraEstado() {
		if(this.acesa)
			System.out.println("A l�mpada est� acesa");
		else
			System.out.println("A l�mpada est� apagada");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Lampada l1 = new Lampada();
		 l1.mostraEstado();
		 l1.acenderLampada();
		 l1.mostraEstado();
		 l1.apagarLampada();
		 l1.mostraEstado();
		
	}

}
