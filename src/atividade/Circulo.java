package atividade;

public class Circulo extends FormaBidimensional{
	private double raio;

	public double getLado() {
		return raio;
	}

	public void setLado(double lado) {
		this.raio = lado;
	}
	
	public Circulo(int lado) {
		this.raio=lado;
	}
	
	public Circulo(int raio, String cor, String corDaBorda,double espBorda) {
		
		super(cor,corDaBorda,espBorda);
		this.raio= raio;
	}
	@Override
	public double getArea() {
		return (3.14 * this.raio*this.raio);
		
	}
	@Override
	public double getPerimetro() {
		return (2 * 3.14 * this.raio);
		
	}
	
	public String toString() {
		return super.toString() + "Area do Circulo:/t" + getArea() +  "Perimetro do Circulo: " + getPerimetro();
	}
	
}
