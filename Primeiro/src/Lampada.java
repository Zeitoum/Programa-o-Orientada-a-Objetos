
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
			System.out.println("A lâmpada está acesa");
		else
			System.out.println("A lâmpada está apagada");
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
