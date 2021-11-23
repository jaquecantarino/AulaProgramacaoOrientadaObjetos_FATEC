package Objetos;

public class Aviao extends Veiculo {
	
	@Override
	public void ligar() {
		super.isLigado();
		System.out.println("Ligado!");
	}

	@Override
	public void desligar() {
		System.out.println("Desligado");	
	}


}
