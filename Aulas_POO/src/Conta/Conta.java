package Conta;

public class Conta {

		// Atributos
		private int nrConta;
		private String nomeAgencia;
		private int nrAgencia;
		private String nomeBanco;
		private int nrBanco;
		private int tipo;
		//tipos: 1=corrente, 2=poupança; 3=conjunta, 4=conta encerrada
		private float saldo;
		
		/*CONSTRUTOR*/
		public Conta() {
			
		}
		
		public Conta(int nrConta, String nomeAgencia, int nrAgencia, String nomeBanco, int nrBanco, int tipo,
				float saldo) {
			super();
			this.nrConta = nrConta;
			this.nomeAgencia = nomeAgencia;
			this.nrAgencia = nrAgencia;
			this.nomeBanco = nomeBanco;
			this.nrBanco = nrBanco;
			this.tipo = tipo;
			this.saldo = saldo;
		}
		
		
		/*METODOS*/
		
		//abrir: recebe os dados da conta e insere 0 como estado do saldo;
		public void abrir(String nrConta, String nomeAgencia, int nrAgencia, String nomeBanco, int nrBanco, int tipo,
				float saldo) {
			this.saldo = 0;
		}
		
		//encerrar: caso a conta não tenha saldo negativo, coloca o tipo da conta como 4 e retorna o valor atual do 
		//saldo zerando-o em seguida;
		public double encerrar() {
			if (getSaldo() >=0 ) {
				this.tipo = 4;
				System.out.println("Saldo Atual: "+getSaldo());
				System.out.println("Conta Encerrada");
				this.saldo = 0;
			} else if (getSaldo() < 0) {
				System.out.println(getSaldo());
				System.out.println("Saldo negativo, faça um crédito para encerrar a conta!");	
			}
			return this.saldo;
		}
		
		//consultar_saldo: retorna o valor atual do saldo;
		public void consultaSaldo() {
			System.out.println("Saldo Atual: " + getSaldo());
		}
		
		//creditar: caso a conta não esteja encerrada, adiciona o valor recebido no parâmetro no estado saldo;
		public void creditar(float valor) {
			if (this.tipo == 4) {
				System.out.println("Erro! Conta Encerrada!");
			} else {
				this.saldo += valor;
				System.out.println("Crédito efetuado no valor de: " + valor);
				System.out.println("Saldo Atual: "+getSaldo());
			}
		}
		
		//debitar: caso a conta não esteja encerrada, retira o valor recebido como parâmetro do estado saldo.
		public void debitar(float valor) {
			if (this.tipo == 4) {
				System.out.println("Erro! Conta Encerrada!");
			} else if (this.saldo < valor || this.saldo == 0){
				System.out.println("Saldo insuficiente!");	
			} else {
				this.saldo -= valor;
				System.out.println("Débito realizado com sucesso, no valor de:" + valor);
				System.out.println("Saldo Atual: "+getSaldo());
			}		
		}
		
		
		
		/*GETS AND SETS*/
		
		@Override
		public String toString() {
			return "ContaCorrente [nrConta=" + nrConta + ", nomeAgencia=" + nomeAgencia + ", nrAgencia=" + nrAgencia + ", nomeBanco="
					+ nomeBanco + ", nrBanco=" + nrBanco + ", tipo=" + tipo + ", saldo=" + saldo + "]";
		}
		
		public int getNrConta() {
			return nrConta;
		}
		public void setNrConta(int nrConta2) {
			this.nrConta = nrConta2;
		}
		public String getNomeAgencia() {
			return nomeAgencia;
		}
		public void setNomeAgencia(String nomeAgencia) {
			this.nomeAgencia = nomeAgencia;
		}
		public int getNrAgencia() {
			return nrAgencia;
		}
		public void setNrAgencia(int nrAgencia) {
			this.nrAgencia = nrAgencia;
		}
		public String getNomeBanco() {
			return nomeBanco;
		}
		public void setNomeBanco(String nomeBanco) {
			this.nomeBanco = nomeBanco;
		}
		public int getNrBanco() {
			return nrBanco;
		}
		public void setNrBanco(int nrBanco) {
			this.nrBanco = nrBanco;
		}
		public int getTipo() {
			return tipo;
		}
		public void setTipo(int tipo) {
			this.tipo = tipo;
		}
		public float getSaldo() {
			return saldo;
		}
		public void setSaldo(float saldo) {
			this.saldo = saldo;
		}

}
