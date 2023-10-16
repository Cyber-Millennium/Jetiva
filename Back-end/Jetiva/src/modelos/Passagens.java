package modelos;

public class Passagens {
	
	// Atributos
	private int ID;
	private String Empresa; 
	private String Destino;
	private String dataIda;
	private String dataVolta;
	private String horaIda;
	private String horaVolta;
	private int Passagem;
	private String codigoReserva;
	private String portaoDeEmbarque;
	
	// Construtor
	public Passagens() {
	}

	public Passagens(int iD, String empresa, String destino, String dataIda, String dataVolta, String horaIda,
			String horaVolta, int passagem, String reserva, String portaoDeEmbarque) {
		ID = iD;
		Empresa = empresa;
		Destino = destino;
		this.dataIda = dataIda;
		this.dataVolta = dataVolta;
		this.horaIda = horaIda;
		this.horaVolta = horaVolta;
		Passagem = passagem;
		codigoReserva = reserva;
		this.portaoDeEmbarque = portaoDeEmbarque;
	}

	public Passagens(String empresa, String destino, String dataIda, String dataVolta, String horaIda, String horaVolta,
			int passagem, String reserva, String portaoDeEmbarque) {
		Empresa = empresa;
		Destino = destino;
		this.dataIda = dataIda;
		this.dataVolta = dataVolta;
		this.horaIda = horaIda;
		this.horaVolta = horaVolta;
		Passagem = passagem;
		codigoReserva = reserva;
		this.portaoDeEmbarque = portaoDeEmbarque;
	}
	
	// Getters e Setters
	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getEmpresa() {
		return Empresa;
	}

	public void setEmpresa(String empresa) {
		Empresa = empresa;
	}

	public String getDestino() {
		return Destino;
	}

	public void setDestino(String destino) {
		Destino = destino;
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

	public int getPassagem() {
		return Passagem;
	}

	public void setPassagem(int passagem) {
		Passagem = passagem;
	}

	public String getReserva() {
		return codigoReserva;
	}

	public void setReserva(String reserva) {
		codigoReserva = reserva;
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
		return "Passagens [ID=" + ID + ", Empresa=" + Empresa + ", Destino=" + Destino + ", dataIda=" + dataIda
				+ ", dataVolta=" + dataVolta + ", horaIda=" + horaIda + ", horaVolta=" + horaVolta + ", Passagem="
				+ Passagem + ", Reserva=" + codigoReserva + ", portaoDeEmbarque=" + portaoDeEmbarque + "]";
	}
}
