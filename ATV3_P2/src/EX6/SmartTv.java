package EX6;

public class SmartTv implements Televisão, Smart{

	@Override
	public void ligar() {
		System.out.println("SmarTv ligada!");
		
	}

	@Override
	public void desligar() {
		System.out.println("SmartTv deligada!");
		
	}

	@Override
	public void aumentarVolume() {
		System.out.println("Volume aumentando!");
		
	}

	@Override
	public void mudarCanal() {
		System.out.println("Mudando Canal!");
	}

	@Override
	public void conexao() {
		System.out.println("SmartTv Conectada");
		
	}

	@Override
	public void baixarApp() {
		System.out.println("SmartTv baixando app");
		
	}

}
