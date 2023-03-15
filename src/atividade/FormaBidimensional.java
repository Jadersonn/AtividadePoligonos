package atividade;

public abstract class   FormaBidimensional extends Forma{
	private String corDaBorda;
	private double espessuraDaBorda;
	
	public String getCorDaBorda() {
		return corDaBorda;
	}
	public void setCorDaBorda(String corDaBorda) {
		this.corDaBorda = corDaBorda;
	}
	public double getEspessuraDaBorda() {
		return espessuraDaBorda;
	}
	public void setEspessuraDaBorda(double espessuraDaBorda) {
		this.espessuraDaBorda = espessuraDaBorda;
	}
	
	public FormaBidimensional(){
		this.corDaBorda = "";
		this.espessuraDaBorda = 0;
	}
	
	public FormaBidimensional(String cor, String corDaBorda,double espBorda){
		this.corDaBorda = corDaBorda;
		this.espessuraDaBorda = espBorda;
		super.setCor(cor);
		
	}
	
	public String toString() {
		return "Cor: \t\t\t" + this.getCor() + "\nCor da borda:\t\t" + this.corDaBorda + "\nEspessura da borda:\t" + this.espessuraDaBorda ;
	}
	
	public abstract double getArea();
	public abstract double getPerimetro();
}
