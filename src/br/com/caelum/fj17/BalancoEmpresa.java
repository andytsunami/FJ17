package br.com.caelum.fj17;

import java.util.HashMap;

import br.com.caelum.fj17.util.Cnpj;

public class BalancoEmpresa {
	private HashMap<Cnpj, Divida> dividas = new HashMap<Cnpj, Divida>();

	public void registraDivida(Divida divida) {
		dividas.put(divida.getCnpjCredor(), divida);
	}

	public void pagaDivida(Cnpj cnpjCredor, Pagamento pagamento) {
		Divida divida = dividas.get(cnpjCredor);
		if (divida != null) {
			divida.registra(pagamento);

		}
	}
}
