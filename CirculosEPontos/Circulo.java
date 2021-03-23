package CirculosEPontos;

public class Circulo {
	public String nome;
	double r;
	public Ponto p1;
	
	public Circulo(String nome) {
		setNome(nome);
	}
	public double getR() {
		return r;
	}
	public void setR(double r) {
		this.r = r;
	}
	public Ponto getPonto() {
		return p1;
	}
	public void setPonto(Ponto ponto) {
		this.p1 = ponto;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public double diamentro() {
		return 2*r;
	}
	
	public double area() {
		return Math.PI * (r * r);
	}
	
	public double circ() {
		return 2*(Math.PI * r);
	}
	public String toString() {
		return "Circulo [Nome = " + nome + ", Raio = " + r + ", Ponto = (" +  p1.x + "," + p1.y  +")]";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ponto P1 = new Ponto(1,2);
		Circulo C1 = new Circulo("Gabriel");
		C1.setR(3);
		C1.setPonto(P1);
		System.out.println(C1);
		System.out.println("Area = " + C1.area());
		System.out.println("Diametro = " +C1.diamentro());
		System.out.println("Circunferencia = " +C1.circ());
		C1.setNome("Yeda");
		System.out.println("Nome = " +C1.getNome());
		
	}

}
