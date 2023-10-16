package modelos;

public class Usuarios {
	
	// Atributos
	private int ID;
	private String Nome;
	private String Email;
	private String Senha;

	// Construtor
	public Usuarios() {
	}
	
	public Usuarios(int iD, String nome, String email, String senha) {
		ID = iD;
		Nome = nome;
		Email = email;
		Senha = senha;
	}

	public Usuarios(String nome, String email, String senha) {
		Nome = nome;
		Email = email;
		Senha = senha;
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

	public String getSenha() {
		return Senha;
	}

	public void setSenha(String senha) {
		Senha = senha;
	}

	//toString
	@Override
	public String toString() {
		return "Usuarios [ID=" + ID + ", Nome=" + Nome + ", Email=" + Email + ", Senha=" + Senha + "]";
	}
}
