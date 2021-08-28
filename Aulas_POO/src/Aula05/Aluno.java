package Aula05;

public class Aluno {
	// Atributos
	// dados que o nosso objeto tem
	String nome;
	String matricula;
	double nota1;
	double nota2;
	double notaReavaliacao;
	private boolean aprovado;

	// Construtor vazio
	Aluno() {
	}

	// Construtor com parametros
	Aluno(String nome, String matricula, double nota1, double nota2, double notaReavaliacao) {
		// usamo o this. porque estamos referenciando os atributos descritos como
		// paramentro nesse metodo
		this.nome = nome;
		this.matricula = matricula;
		setNota1(nota1);
		setNota2(nota2);
		setNotaReavaliacao(notaReavaliacao);
		aprovado = (calcularMediaFinal() >= 6);
	}

	@Override
	public String toString() {
		// usamos o toString para mostrar todas as informações do usuario
		return "Aluno [Nome=" + nome + ", Matricula=" + matricula + ", Nota1=" + nota1 + ", Nota2=" + nota2
				+ ", Nota Reavaliação=" + notaReavaliacao + ", Média=" + calcularMedia() + ", Média Final="
				+ calcularMediaFinal() + ", Aprovado=" + aprovado + "]";
	}

	public double calcularMedia() {
		// recebemos as notas na hora que instancia o objeto e faz o calculo
		return (nota1 + nota2) / 2;
	}

	public double calcularMediaFinal() {
		// a media final considera se as notas 1 e 2 batem o 6 pontos, if > 6 basta
		// puxar o metodo acima.
		if (calcularMedia() >= 6)
			return calcularMedia();
		else // caso não é necessario calcular com a nota nova.
			return (calcularMedia() + notaReavaliacao) / 2;
	}

	public boolean getAprovado() {
		return aprovado;
	}

	public void setNota1(double n1) {
		if (n1 >= 0 && n1 <= 10) {
			nota1 = n1;
			aprovado = (calcularMediaFinal() >= 6);
		} else {
			System.out.println("Nota 1=" + n1 + " - Valor Inválido!");
		}
	}

	public void setNota2(double n2) {
		if (n2 >= 0 && n2 <= 10) {
			nota2 = n2;
			aprovado = (calcularMediaFinal() >= 6);
		} else {
			System.out.println("Nota 2=" + n2 + " - Valor Inválido!");
		}
	}

	public void setNotaReavaliacao(double n) {
		if (n >= 0 && n <= 10) {
			notaReavaliacao = n;
			aprovado = (calcularMediaFinal() >= 6);
		} else {
			System.out.println("Nota Reavaliação=" + n + " - Valor Inválido!");
		}
	}

	public double getNota1() {
		return nota1;
	}

	public double getNota2() {
		return nota2;
	}

	public double getNotaReavaliacao() {
		return notaReavaliacao;
	}

}
