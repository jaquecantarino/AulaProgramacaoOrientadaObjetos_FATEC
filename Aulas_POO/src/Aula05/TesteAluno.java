package Aula05;

public class TesteAluno {

	public static void main(String[] args) {
		// instanciamos objetos na nossa aplica��o
		Aluno aluno01 = new Aluno("Jaqueline", "2040482023010", 10.0, 7.0, 0.0);
		Aluno aluno02 = new Aluno("Felipe", "2041543032101", 8.0, 3.0, 7.0);

		System.out.println(aluno01.toString());
		System.out.println("M�dia: " + aluno01.calcularMedia());

		aluno02.setNotaReavaliacao(7.0);
		System.out.println(aluno02.toString());
		System.out.println("M�dia: " + aluno02.calcularMedia());
		System.out.println("M�dia Final: " + aluno02.calcularMediaFinal());
		System.out.println("Aprovado:" + aluno02.getAprovado());
		System.out.println(aluno02.getNota1());

	}

}
