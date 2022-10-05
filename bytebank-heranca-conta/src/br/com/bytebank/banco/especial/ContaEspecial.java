package br.com.bytebank.banco.especial;

import br.com.bytebank.banco.modelo.Object;

public class ContaEspecial extends Object {

	public ContaEspecial(int agencia, int numero) {
		super(agencia, numero);
	}
	
	@Override
	public void deposita(double valor) {
		super.saldo += valor;
	}

}
