package br.com.caelum.fj17;

import java.text.NumberFormat;
import java.util.Locale;

import br.com.caelum.fj17.util.Cnpj;

public class RelatorioDeDivida {

	public void geraRelatorio(Divida divida, NumberFormat format) {

		System.out.println("Credor: " + divida.getCredor());
		System.out.println("CNPJ: " + divida.getCnpjCredor().getCnpj());
		System.out.println("Valor a pagar: "
				+ format.format(divida.valorAPagar()));
		System.out.println("Valor total: " + format.format(divida.getTotal()));

	}

	public static void main(String[] args) {
		Divida divida = new Divida();
		divida.setCnpjCredor(new Cnpj("123456"));
		divida.setCredor("Uma empresa");
		divida.setTotal(2000);

		Pagamento pagamento = new Pagamento();
		pagamento.setValor(100);
		divida.registra(pagamento);

		// Formato Moeda
		NumberFormat formatoBr = NumberFormat.getCurrencyInstance(new Locale(
				"pt", "BR"));
		NumberFormat formatoUsa = NumberFormat.getCurrencyInstance(new Locale(
				"en", "US"));

		RelatorioDeDivida relatorio = new RelatorioDeDivida();
		relatorio.geraRelatorio(divida, formatoBr);
		System.out.println("===========\n===========");
		relatorio.geraRelatorio(divida, formatoUsa);

	}

}
