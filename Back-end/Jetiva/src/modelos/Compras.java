package modelos;

public class Compras {
	
	// Atributos
	private int id;
	private String data_compra;
	private double total_compra;
	private Usuarios usuario;
	private Reservas reserva;

	// Construtor
	public Compras() {
	}

	public Compras(int id, String data_compra, Usuarios usuario, Reservas reserva ) {
		this.id = id;
		this.data_compra = data_compra;
		this.total_compra =  valorCompraMaisTaxa(reserva.getPreco());
		this.usuario = usuario;
		this.reserva = reserva;
	}

	
	public Compras(String data_compra, Usuarios usuario, Reservas reserva) {
		this.data_compra = data_compra;
		this.total_compra = valorCompraMaisTaxa(reserva.getPreco());
		this.usuario = usuario;
		this.reserva = reserva;
	}

	// Getters e Setters
	public int getID() {
		return id;
	}

	public void setID(int id) {
		this.id = id;
	}

	public String getData_compra() {
		return data_compra;
	}

	public void setData_compra(String data_compra) {
		this.data_compra = data_compra;
	}

	public double getTotal_compra() {
		return total_compra;
	}

	public void setTotal_compra(double total_compra) {
		this.total_compra = total_compra;
	}
	
	public Usuarios getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuarios usuario) {
		this.usuario = usuario;
	}

	public Reservas getReserva() {
		return reserva;
	}

	public void setReserva(Reservas reserva) {
		this.reserva = reserva;
	}
	
	public double valorCompraMaisTaxa(double preco) {
        this.total_compra = (preco * 0.15 ) + preco;

        return this.total_compra;
    }

    // toString
    @Override
    public String toString() {
        return "Compras [id=" + id + ", data_compra=" + data_compra + ", total_compra=" + total_compra + ", usuario="
                + usuario + ", reserva=" + reserva + "]";
    }
}
