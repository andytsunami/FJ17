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

	public void registra(Pagamento pagamento) {
		this.pagamentos.registra(pagamento);
	}

	public String getCredor() {
		return this.credor;
	}

	public double getTotal() {
		return this.total;
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

	public void setPagamentos(Pagamentos pagamentos) {
		this.pagamentos = pagamentos;
	}
}