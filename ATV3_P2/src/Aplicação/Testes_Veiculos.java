package Aplicação;

import Objetos.Aviao;
import Objetos.Carro;

public class Testes_Veiculos {

	public static void main(String[] args) {
		
		Carro carro = new Carro();
		Aviao aviao = new Aviao();
		
		carro.desligar();
		
		aviao.ligar();
	}

}
