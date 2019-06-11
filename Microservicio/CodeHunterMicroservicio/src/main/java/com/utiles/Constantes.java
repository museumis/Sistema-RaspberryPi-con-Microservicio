package com.utiles;

/**
 * @author Ismael MR
 * @since 2019-06-11
 * 
 * <a href="mailto:ismaelmrdev@gmail.com">Correo electronico</a> * 
 * <a>https://museumis.github.io/Si/</a>
 */

import java.util.logging.Logger;

public class Constantes {
	
	public static Logger log = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

	public static String URL_BASEDATOS = "192.168.0.160";
	public static String USER = "miUser";
	public static String PASSWORD = "miContrasena";
	public static String NOMBRE_BASEDATOS = "miBaseDatos";

	public static String CONEXION_BASEDATOS = "jdbc:mariadb://" + Constantes.URL_BASEDATOS + "/" + Constantes.NOMBRE_BASEDATOS + "?user=" + Constantes.USER + "&password=" + Constantes.PASSWORD;

	public static String GET_ALL_HUNTERS = "SELECT * FROM hunter";

}
