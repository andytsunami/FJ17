package br.com.caelum.fj17.util;

public class Cnpj {

	private String valor;

	public Cnpj(String cnpj) {
		this.valor = cnpj;
	}

	public boolean equals(Object object) {
		if (!(object instanceof Cnpj)) {
			return false;
		}
		Cnpj outro = (Cnpj) object;
		return this.valor.equals(outro.valor);
	}

	public int hashCode() {
		return this.valor.hashCode();
	}

	public boolean ehValido() {
		return primeiroDigitoVerificadorDoCnpj() == primeiroDigitoCorretoParaCnpj()
				&& segundoDigitoVerificadorDoCnpj() == segundoDigitoCorretoParaCnpj();
	}

	private int primeiroDigitoCorretoParaCnpj() {
		// Calcula o primeiro dígito verificador correto para
		// o CNPJ armazenado no atributo valor
		return 0;
	}

	private int primeiroDigitoVerificadorDoCnpj() {
		// Extrai o primeiro dígito verificador do CNPJ armazenado
		// no atributo valor
		return 0;
	}

	private int segundoDigitoCorretoParaCnpj() {
		// Calcula o segundo dígito verificador correto para
		// o CNPJ armazenado no atributo valor
		return 0;
	}

	private int segundoDigitoVerificadorDoCnpj() {
		// Extrai o segundo dígito verificador do CNPJ armazenado
		// no atributo valor
		return 0;
	}

	public String getCnpj() {
		return valor;
	}

}
