package dao;

import java.util.ArrayList;
import java.util.List;

import modelos.Usuarios;

public class UsuarioDAO {
	
	// Create
	public void create(Usuarios usuario) {
		System.out.println("*** CREATE ***");
	}
	
	// Read
	public List<Usuarios> read(){
		List<Usuarios> usuarios = new ArrayList<Usuarios>();
		
		System.out.println("*** READ ***");
		
		return usuarios;
	}
	
	// Update
	public void update(Usuarios usuario) {
		System.out.println("*** UPDATE ***");
	}
	
	// Delete
	public void delete(int ID) {
		System.out.println("*** DELETE ***");
	}
	
	// ReadbyID
	public Usuarios readById(int ID) {
		System.out.println("*** DELETE ***");
	return new Usuarios();
	}
}
