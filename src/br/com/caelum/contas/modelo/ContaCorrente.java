package br.com.caelum.contas.modelo;

public class ContaCorrente extends Conta{

		
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
}
