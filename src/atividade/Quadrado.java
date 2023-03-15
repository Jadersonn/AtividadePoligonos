package atividade;

public class Quadrado extends FormaBidimensional{
	private double lado;

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}
	
	public Quadrado(int lado) {
		this.lado=lado;
	}
	
	public Quadrado(int lado, String cor, String corDaBorda,double espBorda) {
		
		super(cor,corDaBorda,espBorda);
		this.lado= lado;
	}
	@Override
	public double getArea() {
		return this.lado*this.lado;
		
	}
	@Override
	public double getPerimetro() {
		return this.lado*this.lado*this.lado*this.lado;
		
	}

	public String toString() {
		return super.toString() + "\nArea do quadrado:\t" + getArea() +  "\nPerimetro do Quadrado:\t" + getPerimetro();
	}
	
}
