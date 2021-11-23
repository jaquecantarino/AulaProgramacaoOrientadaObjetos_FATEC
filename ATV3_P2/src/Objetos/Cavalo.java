package Objetos;

public class Cavalo extends Animal {
	
	public Cavalo(String nome, int idade) {
		super(nome, idade);
	}
	
	@Override
	public void emitirSom() {
		System.out.println(super.getNome()+" está relinchando!");
	}
	
	@Override
	public void andar() {
		System.out.println(super.getNome()+" está andando.");	
	}
	
	public void ficha() {
		System.out.println("Dados do animal: \nNome:"+super.getNome()+"\nIdade:"+super.getIdade());
	}

}
