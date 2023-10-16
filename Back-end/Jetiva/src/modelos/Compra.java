package modelos;

public class Compra {
	
	// Atributos
	private int ID;
	private String Data;
	private Float Total;

	// Construtor
	public Compra() {
	}

	public Compra(int iD, String data, Float total) {
		ID = iD;
		Data = data;
		Total = total;
	}

	// Getters e Setters
	public Compra(String data, Float total) {
		Data = data;
		Total = total;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getData() {
		return Data;
	}

	public void setData(String data) {
		Data = data;
	}

	public Float getTotal() {
		return Total;
	}

	public void setTotal(Float total) {
		Total = total;
	}
	
	// toString
	@Override
	public String toString() {
		return "Compra [ID=" + ID + ", Data=" + Data + ", Total=" + Total + "]";
	}
}