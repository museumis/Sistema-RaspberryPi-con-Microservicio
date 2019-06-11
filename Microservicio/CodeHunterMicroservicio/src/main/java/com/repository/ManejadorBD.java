package com.repository;

/**
 * @author Ismael MR
 * @since 2019-06-11
 * 
 * <a href="mailto:ismaelmrdev@gmail.com">Correo electronico</a> * 
 * <a>https://museumis.github.io/Si/</a>
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.model.Hunter;
import com.utiles.Constantes;

@Repository
public class ManejadorBD {


	public List<Hunter> getAll() {
		Connection c = null;
		Statement st = null;
		ResultSet r = null;
		List<Hunter> usuarios = new ArrayList<>();
		Hunter hunterActual;
		
		try {			
			c = abrirConexion();
			st = c.createStatement();		
			
			r = st.executeQuery(Constantes.GET_ALL_HUNTERS);	
			while (r.next()) {
				hunterActual = new Hunter();
				hunterActual.setId(r.getString(1));
				usuarios.add(hunterActual);
			}
			

		} catch (ClassNotFoundException | SQLException e) {
            Constantes.log.info("*****Error en SQLException: \n" +e.getMessage() +"\n"+e.getLocalizedMessage() 
            +"\n -ToString: "+e.toString());
		}finally {			
			cerrarConexion(c, st, r);
		}
		cerrarConexion(c, st, r);
		

		return usuarios;
	}



	public Connection abrirConexion() throws ClassNotFoundException, SQLException {
		Connection c;
		Constantes.log.info("Conectando..."+ Constantes.URL_BASEDATOS + "/"+Constantes.NOMBRE_BASEDATOS+"[user="+Constantes.USER+"][password="+Constantes.PASSWORD);
		
		Class.forName("org.mariadb.jdbc.Driver");
		c = DriverManager.getConnection(Constantes.CONEXION_BASEDATOS);
		
		Constantes.log.info("Conexion aceptada..." );
		return c;
	}

	
	public void cerrarConexion(Connection c, Statement st, ResultSet r) {
		try {
			r.close();
			st.close();
			c.close();
		} catch (SQLException e) {
            Constantes.log.info("*****Error en cerrarConexion: \n" +e.toString() );
		}
	}

	
}
