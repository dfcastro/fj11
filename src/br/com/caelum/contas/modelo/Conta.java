package br.com.caelum.contas.modelo;

public abstract class Conta {

	protected double saldo;
	private String titular;
	private int numero;
	private String agencia;

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public void deposita(double valor) {
		this.saldo += valor;
	}

	public double getSaldo() {
		return this.saldo;
	}

	public abstract boolean saca(double valor);

	public abstract String getTipo();

	public boolean transfere(double valor, Conta destino) {
		if (saca(valor)) {
			destino.deposita(valor);
			return true;
		}
		return false;
	}
	

}
