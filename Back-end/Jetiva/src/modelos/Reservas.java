package modelos;

public class Reservas {
	
	// Atributos
	private int id;
	private String origem;
	private String destino;
	private String empresa;
	private String classe;
	private String assento;
	private Double preco;
	private String codigo;
	
	// Construtor
	public Reservas() {
	}

	public Reservas(int id, String origem, String destino, String empresa, String classe, String assento, Double preco,
			String codigo) {
		this.id = id;
		this.origem = origem;
		this.destino = destino;
		this.empresa = empresa;
		this.classe = classe;
		this.assento = assento;
		this.preco = preco;
		this.codigo = codigo;
	}

	public Reservas(String origem, String destino, String empresa, String classe, String assento, Double preco,
			String codigo) {
		this.origem = origem;
		this.destino = destino;
		this.empresa = empresa;
		this.classe = classe;
		this.assento = assento;
		this.preco = preco;
		this.codigo = codigo;
	}
	
	// Getters e Setters
	public int getID() {
		return id;
	}

	public void setID(int id) {
		this.id = id;
	}

	public String getOrigem() {
		return origem;
	}

	public void setOrigem(String origem) {
		this.origem = origem;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	public String getClasse() {
		return classe;
	}

	public void setClasse(String classe) {
		this.classe = classe;
	}

	public String getAssento() {
		return assento;
	}

	public void setAssento(String assento) {
		this.assento = assento;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	
	@Override
	public String toString() {
		return "Reservas [id=" + id + ", origem=" + origem + ", destino=" + destino + ", empresa=" + empresa
				+ ", classe=" + classe + ", assento=" + assento + ", Preco=" + preco + ", Codigo=" + codigo + "]";
	}

}