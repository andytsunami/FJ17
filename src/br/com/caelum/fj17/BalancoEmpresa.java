package br.com.caelum.fj17;

import java.util.HashMap;

public class BalancoEmpresa {

	private HashMap<String, Divida> dividas = new HashMap<>();

	public void registraDivida(String nome, String cnpj, double valor) {
		Divida divida = new Divida();

		divida.setCnpj(cnpj);
		divida.setNomeCredor(nome);
		divida.setTotal(valor);

		dividas.put(cnpj, divida);
	}

	public void pagaDivida(String cnpj, double valor) {
		Divida divida = this.dividas.get(cnpj);

		if (divida != null) {
			divida.paga(valor);
		}

	}
}
