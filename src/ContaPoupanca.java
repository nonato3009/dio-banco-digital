
public class ContaPoupanca extends Conta{
	public ContaPoupanca(Cliente cliente) {
		super(cliente);
		
	}

	@Override
    public void imprimirLimiteCartao() {
        System.out.println("Limite do Cartão de Crédito: " + this.getLimite());
    }
	
	@Override
    public void alterarLimiteCartao(double novoLimite) {
        this.limite = novoLimite;
    }
	
	public void imprimirExtrato() {
		System.out.println("=== Extrato Conta Poupanca ===");
		super.imprimirInfosComuns();
		
	}
}
