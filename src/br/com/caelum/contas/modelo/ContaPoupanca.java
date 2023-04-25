package br.com.caelum.contas.modelo;

public class ContaPoupanca extends Conta {

	
	public String getTipo()
	{
		return "Conta Poupanca";
	}
	
	public boolean saca(double valor)
	{
		if(valor<= this.saldo)
		{
			this.saldo -= valor;
			return true;
		}else
		{
			return false;
		}
		
	}
}
