package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class ModeloCaballero {

	public static ArrayList<Caballero> verTodos() throws ClassNotFoundException, SQLException {
		ArrayList<Caballero> caballeros = new ArrayList<Caballero>();

		Statement pst = Conector.getConnection().createStatement();
		ResultSet rs = pst.executeQuery("SELECT * FROM caballeros");

		while (rs.next()) {
			Caballero caballero = new Caballero();
			caballero.setId(rs.getInt("id"));
			caballero.setNombre(rs.getString("nombre"));
			caballero.setFuerza(rs.getInt("fuerza"));
			caballero.setExperiencia(rs.getInt("experiencia"));
			caballero.setFoto(rs.getString("foto"));
			Arma arma = ModeloCaballero.verArma(rs.getInt("arma_id"));
			caballero.setArma(arma);
			Escudo escudo = ModeloCaballero.verEscudo(rs.getInt("escudo_id"));
			caballero.setEscudo(escudo);

			caballeros.add(caballero);

		}

		return caballeros;
	}

	public static Arma verArma(int id) throws ClassNotFoundException, SQLException {
		Arma arma = new Arma();

		Connection con = Conector.getConnection();
		PreparedStatement pst = con.prepareStatement("SELECT * FROM armas WHERE id = ?");
		pst.setInt(1, id);
		;
		ResultSet rs = pst.executeQuery();

		while (rs.next()) {

			arma.setId(rs.getInt("id"));
			arma.setNombre(rs.getString("nombre"));
			arma.setCapacidad_danio(rs.getInt("capacidad_danio"));
			arma.setFoto(rs.getString("foto"));

			
		}

		return arma;

	}

	public static Escudo verEscudo(int id) throws ClassNotFoundException, SQLException {
		Escudo escudo = new Escudo();

		Connection con = Conector.getConnection();
		PreparedStatement pst = con.prepareStatement("SELECT * FROM escudos WHERE id = ?");
		pst.setInt(1, id);
		;
		ResultSet rs = pst.executeQuery();

		while (rs.next()) {
			

		escudo.setId(rs.getInt("id"));
		escudo.setNombre(rs.getString("nombre"));
		escudo.setCapacidad_defensa(rs.getInt("capacidad_defensa"));


		}

		return escudo;
	}
}
