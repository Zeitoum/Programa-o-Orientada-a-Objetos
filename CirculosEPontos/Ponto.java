package CirculosEPontos;

public class Ponto {
	int x;
	int y;
	public Ponto(int x, int y) {
		setX(x);
		setY(y);
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ponto A1 = new Ponto(1,2);
		Ponto A2 = new Ponto(3,4);
		double distancia =  Math.sqrt((A2.x - A1.x) * 2 + (A2.y - A1.y) * 2);
		System.out.println("Distancia = " +distancia);
		

	}

}
