package br.com.caelum.contas;

import br.com.caelum.contas.modelo.Conta;
import br.com.caelum.javafx.api.util.Evento;
import br.com.caelum.contas.modelo.*;

public class ManipuladorDeContas {

	private Conta conta;

	public void criaConta(Evento evento) {
		String tipoConta = evento.getSelecionadoNoRadio("tipo");

		this.conta = new Conta();

		if (tipoConta.equals("Conta Corrente")) {
			this.conta = new ContaCorrente();

		} else {
			this.conta = new ContaPoupanca();
		}

		this.conta.setAgencia(evento.getString("agencia"));
		this.conta.setNumero(evento.getInt("numero"));
		this.conta.setTitular(evento.getString("titular"));
	}

	public void deposita(Evento evento) {
		double valorDigitado = evento.getDouble("valorOperacao");
		this.conta.deposita(valorDigitado);
	}

	public void saca(Evento evento) {
		double valorDigitado = evento.getDouble("valorOperacao");

		this.conta.saca(valorDigitado);
	}

}