package Aplicação;

import Objetos.Cachorro;
import Objetos.Cavalo;

public class Testes_Animais {

	public static void main(String[] args) {

		Cachorro rex = new Cachorro("Rex", 2);
		Cavalo jose = new Cavalo("Jose", 10);
		
		rex.ficha();
		rex.emitirSom();
		rex.andar();
		
		jose.ficha();
		jose.emitirSom();
		jose.andar();

	}

}
