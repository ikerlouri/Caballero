package modelo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class ModeloCaballero {

	public static ArrayList<Caballero> verTodos() throws ClassNotFoundException, SQLException {
		ArrayList<Caballero> caballeros = new ArrayList<Caballero>();
		
		Statement pst = Conector.getConnection().createStatement();			
		ResultSet rs = pst.executeQuery("SELECT * FROM caballeros");
		
		while(rs.next()) {
		Caballero caballero = new Caballero();
		caballero.setId(rs.getInt("id"));
		caballero.setNombre(rs.getString("nombre"));
		caballero.setFuerza(rs.getInt("fuerza"));
		caballero.setExperiencia(rs.getInt("experiencia"));
		caballero.setFoto(rs.getString("foto"));
		caballero.setArma_id(rs.getInt("arma_id"));
		caballeros.add(caballero);
		}
		
		return caballeros;
	}

}
