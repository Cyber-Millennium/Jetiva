package modelos;

public class Reservas {
	
	// Atributos
	private int ID;
	private String Origem;
	private String Destino;
	private String Empresa;
	private String Classe;
	private String Assento;
	private String Preco;
	private Float Codigo;
	
	// Construtor
	public Reservas() {
	}

	public Reservas(int iD, String origem, String destino, String empresa, String classe, String assento, String preco,
			Float codigo) {
		ID = iD;
		Origem = origem;
		Destino = destino;
		Empresa = empresa;
		Classe = classe;
		Assento = assento;
		Preco = preco;
		Codigo = codigo;
	}

	public Reservas(String origem, String destino, String empresa, String classe, String assento, String preco,
			Float codigo) {
		Origem = origem;
		Destino = destino;
		Empresa = empresa;
		Classe = classe;
		Assento = assento;
		Preco = preco;
		Codigo = codigo;
	}
	
	// Getters e Setters
	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getOrigem() {
		return Origem;
	}

	public void setOrigem(String origem) {
		Origem = origem;
	}

	public String getDestino() {
		return Destino;
	}

	public void setDestino(String destino) {
		Destino = destino;
	}

	public String getEmpresa() {
		return Empresa;
	}

	public void setEmpresa(String empresa) {
		Empresa = empresa;
	}

	public String getClasse() {
		return Classe;
	}

	public void setClasse(String classe) {
		Classe = classe;
	}

	public String getAssento() {
		return Assento;
	}

	public void setAssento(String assento) {
		Assento = assento;
	}

	public String getPreco() {
		return Preco;
	}

	public void setPreco(String preco) {
		Preco = preco;
	}

	public Float getCodigo() {
		return Codigo;
	}

	public void setCodigo(Float codigo) {
		Codigo = codigo;
	}
	
	// toString
	@Override
	public String toString() {
		return "Reservas [ID=" + ID + ", Origem=" + Origem + ", Destino=" + Destino + ", Empresa=" + Empresa
				+ ", Classe=" + Classe + ", Assento=" + Assento + ", Preco=" + Preco + ", Codigo=" + Codigo + "]";
	}
}