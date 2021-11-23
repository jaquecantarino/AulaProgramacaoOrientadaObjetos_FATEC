package Objetos;

public abstract class Veiculo {
	
	private String cor;
	private int passageiros;
	private boolean ligado=false;
	
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public int getPassageiros() {
		return passageiros;
	}
	public void setPassageiros(int passageiros) {
		this.passageiros = passageiros;
	}
	public boolean isLigado() {
		return ligado;
	}
	public void setLigado(boolean ligado) {
		this.ligado = ligado;
	}
	
	
	public abstract void ligar();
	public abstract void desligar();
	
	

}
