package modelos;

public class Passagens {
	
	// Atributos
	private int id;
	private String empresa; 
	private String destino;
	private String dataIda;
	private String dataVolta;
	private String horaIda;
	private String horaVolta;
	private String assento;
	private String codigo;
	private String portaoDeEmbarque;
	
	// Construtor
	public Passagens() {
	}

	public Passagens(int id, String empresa, String destino, String dataIda, String dataVolta, String horaIda,
			String horaVolta, String assento, String codigo, String portaoDeEmbarque) {
		this.id = id;
		this.empresa = empresa;
		this.destino = destino;
		this.dataIda = dataIda;
		this.dataVolta = dataVolta;
		this.horaIda = horaIda;
		this.horaVolta = horaVolta;
		this.assento= assento;
		this.codigo = codigo;
		this.portaoDeEmbarque = portaoDeEmbarque;
	}

	public Passagens(String empresa, String destino, String dataIda, String dataVolta, String horaIda, String horaVolta, String assento, String codigo, String portaoDeEmbarque) {
		this.empresa = empresa;
		this.destino = destino;
		this.dataIda = dataIda;
		this.dataVolta = dataVolta;
		this.horaIda = horaIda;
		this.horaVolta = horaVolta;
		this.assento = assento;
		this.codigo = codigo;
		this.portaoDeEmbarque = portaoDeEmbarque;
	}
	
	// Getters e Setters
	public int getID() {
		return id;
	}

	public void setID(int id) {
		this.id = id;
	}

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public String getDataIda() {
		return dataIda;
	}

	public void setDataIda(String dataIda) {
		this.dataIda = dataIda;
	}

	public String getDataVolta() {
		return dataVolta;
	}

	public void setDataVolta(String dataVolta) {
		this.dataVolta = dataVolta;
	}

	public String getHoraIda() {
		return horaIda;
	}

	public void setHoraIda(String horaIda) {
		this.horaIda = horaIda;
	}

	public String getHoraVolta() {
		return horaVolta;
	}

	public void setHoraVolta(String horaVolta) {
		this.horaVolta = horaVolta;
	}

	public String getAssento() {
		return assento;
	}

	public void setAssento(String assento) {
		this.assento = assento;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getPortaoDeEmbarque() {
		return portaoDeEmbarque;
	}

	public void setPortaoDeEmbarque(String portaoDeEmbarque) {
		this.portaoDeEmbarque = portaoDeEmbarque;
	}
	
	// toString
	@Override
	public String toString() {
		return "Passagens [id=" + id + ", empresa=" + empresa + ", destino=" + destino + ", dataIda=" + dataIda
				+ ", dataVolta=" + dataVolta + ", horaIda=" + horaIda + ", horaVolta=" + horaVolta + ", assento="
				+ assento + ", codigo=" + codigo + ", portaoDeEmbarque=" + portaoDeEmbarque + "]";
	}

}