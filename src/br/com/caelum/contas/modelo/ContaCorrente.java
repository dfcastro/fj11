package br.com.caelum.contas.modelo;

public class ContaCorrente extends Conta implements Tributavel{

		
	public String getTipo()
	{
		return "Conta Corrente";
	}
	
	public boolean saca(double valor)
	{
		if(valor<= this.saldo)
		{
			this.saldo -= valor -0.10;
			return true;
		}else
		{
			return false;
		}
		
	}

	@Override
	public double getValorImposto() {

		return this.getSaldo() * 0.01;
	}
}
