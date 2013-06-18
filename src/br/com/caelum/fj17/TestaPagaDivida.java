package br.com.caelum.fj17;

import br.com.caelum.fj17.util.Cnpj;

public class TestaPagaDivida {

	public static void main(String[] args) {

		Pagamento pagamento = new Pagamento();
		pagamento.setCnpjPagador("123");
		pagamento.setValor(500.00);
		pagamento.setPagador("Zezinho");

		new BalancoEmpresa().pagaDivida(new Cnpj("123"), pagamento);
	}

}
