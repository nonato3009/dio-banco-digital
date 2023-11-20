
public abstract class Conta implements IConta {
	
	private static int AGENCIA_PADRAO = 1;
	private static int SEQUENCIAL = 1;
	
	protected int agencia;
	protected int numero;
	protected double saldo;
	protected double limite = 350;
	protected Cliente cliente;

	public Conta(Cliente cliente) {
		this.agencia = AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;
		this.cliente = cliente;
	}
	
	@Override
	public void sacar(double valor) {
		saldo -= valor;
	}
	@Override
	public void depositar(double valor) {
		saldo += valor;
	}
	@Override
	public void transferir(double valor, IConta contaDestino) {
		this.sacar(valor);
		contaDestino.depositar(valor);
	}
	
	@Override
    public void alterarLimiteCartao(double novoLimite) {
        this.limite = novoLimite;
    }
	
	@Override
	public String comprarCartao() {
	    if (limite < 350) {
	        return "Você não tem limite suficiente no Cartão para usar o cartão, seu limite é R$ " + limite;
	    } else if (limite >= 350 && limite <= 700) {
	        return "Valor mínimo inicial é de 350.00 para começar a comprar com o Cartão de Crédito e você está com o limite atual de R$ " + limite;
	    } else if (limite >= 701 && limite <= 1000) {
	        return "Você é um cliente que tem um bom relacionamento e melhorou neste último ano então, seu limite é de R$ " + limite;
	    } else {
	        return "Depois de um ano com seu limite melhorando agora o céu é o limite, seu limite agora é R$ " + limite;
	    }
	}

	
	@Override
    public void imprimirLimiteCartao() {
        System.out.println("Limite do Cartão de Crédito: " + this.getLimite());
    }
	
	public double getLimite() {
		return limite;
	}

	public int getAgencia() {
		return agencia;
	}
	public int getNumero() {
		return numero;
	}
	public double getSaldo() {
		return saldo;
	}
	
	
	 protected void imprimirInfosComuns() {
	 System.out.println(String.format("Titulara: %s ", this.cliente.getNome()));
	 System.out.println(String.format("Agencia: %d ", this.agencia));
	 System.out.println(String.format("Conta: %d ", this.numero));
	 System.out.println(String.format("Saldo: %.2f ", this.saldo));
	 System.out.println(String.format("Limite: %.2f ", this.limite)); }
	 

}
