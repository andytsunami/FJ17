package br.com.caelum.fj17;

import br.com.caelum.fj17.util.Cnpj;

public class Divida {
	private double total;
	private double valorPago;
	private String credor;
	private Cnpj cnpjCredor;
	private Pagamentos pagamentos;

	public Cnpj getCnpjCredor() {
		return this.cnpjCredor;
	}

	public String getCredor() {
		return this.credor;
	}

	public double getTotal() {
		return this.total;
	}

	public double getValorPago() {
		return this.valorPago;
	}

	private void paga(double valor) {
		if (valor < 0) {
			throw new IllegalArgumentException("Valor invalido para pagamento");
		}
		if (valor > 100) {
			valor = valor - 8;
		}
		this.valorPago += valor;
	}

	public void registra(Pagamento pagamento) {
		this.pagamentos.add(pagamento);
		paga(pagamento.getValor());
	}

	public void setCnpjCredor(Cnpj cnpjCredor) {
		this.cnpjCredor = cnpjCredor;
	}

	public void setCredor(String credor) {
		this.credor = credor;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public double valorAPagar() {
		return this.total - this.valorPago;
	}
}