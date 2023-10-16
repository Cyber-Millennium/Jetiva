package modelos;

public class Contatos {
	
	// Atributos
	private int ID;
	private String Nome;
	private String Email;
	private String Telefone;
	private String CEP;
	private String Endereço;
	private String Numero;
	private String Complemento;
	private String Bairro;
	private String Estado;
	private String Cidade;
	private String Mensagem;

	
	// Construtor
	public Contatos() {
	}

	public Contatos(int iD, String nome, String email, String telefone, String cEP, String endereço, String numero,
			String complemento, String bairro, String estado, String cidade, String mensagem) {
		ID = iD;
		Nome = nome;
		Email = email;
		Telefone = telefone;
		CEP = cEP;
		Endereço = endereço;
		Numero = numero;
		Complemento = complemento;
		Bairro = bairro;
		Estado = estado;
		Cidade = cidade;
		Mensagem = mensagem;
	}

	public Contatos(String nome, String email, String telefone, String cEP, String endereço, String numero,
			String complemento, String bairro, String estado, String cidade, String mensagem) {
		Nome = nome;
		Email = email;
		Telefone = telefone;
		CEP = cEP;
		Endereço = endereço;
		Numero = numero;
		Complemento = complemento;
		Bairro = bairro;
		Estado = estado;
		Cidade = cidade;
		Mensagem = mensagem;
	}

	// Getters e Setters
	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getTelefone() {
		return Telefone;
	}

	public void setTelefone(String telefone) {
		Telefone = telefone;
	}

	public String getCEP() {
		return CEP;
	}

	public void setCEP(String cEP) {
		CEP = cEP;
	}

	public String getEndereço() {
		return Endereço;
	}

	public void setEndereço(String endereço) {
		Endereço = endereço;
	}

	public String getNumero() {
		return Numero;
	}

	public void setNumero(String numero) {
		Numero = numero;
	}

	public String getComplemento() {
		return Complemento;
	}

	public void setComplemento(String complemento) {
		Complemento = complemento;
	}

	public String getBairro() {
		return Bairro;
	}

	public void setBairro(String bairro) {
		Bairro = bairro;
	}

	public String getEstado() {
		return Estado;
	}

	public void setEstado(String estado) {
		Estado = estado;
	}

	public String getCidade() {
		return Cidade;
	}

	public void setCidade(String cidade) {
		Cidade = cidade;
	}

	public String getMensagem() {
		return Mensagem;
	}

	public void setMensagem(String mensagem) {
		Mensagem = mensagem;
	}
	
	// toString
	@Override
	public String toString() {
		return "Contatos [ID=" + ID + ", Nome=" + Nome + ", Email=" + Email + ", Telefone=" + Telefone + ", CEP=" + CEP
				+ ", Endereço=" + Endereço + ", Numero=" + Numero + ", Complemento=" + Complemento + ", Bairro="
				+ Bairro + ", Estado=" + Estado + ", Cidade=" + Cidade + ", Mensagem=" + Mensagem + "]";
	}
}