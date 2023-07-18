
public class ContaCorrente extends Conta implements Tributavel {

	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero); // Construtor da Classe Mae

	}

	@Override
	public boolean saca(double valor) {
		double valorASacar = valor + 0.2;
		return super.saca(valorASacar);
	}

	@Override
	public void deposita(double valor) {
		// TODO Auto-generated method stub
		super.saldo += valor;

	}

	@Override
	public double getValorImposto() {

		return super.saldo * 0.01; // utiliza o super,pois o saldo esta na classe mae
	}

}
