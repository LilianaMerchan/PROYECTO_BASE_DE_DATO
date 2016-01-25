import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main_equipo_visitante {

	public static void main(String[] args) {
		//ingresarProductos();
		//consultarProducto();
						
						ingresarequipo_visitante("Atlanta Hawks", "Boris", "AmarilloVerde Claro", "3", "62", "Donato Alarcón","15");
						//ingresarEquipo_local("Boston Celtics", "Germàn Alava", "Rojo", "22","44", "Germàn Alava","22");
						//ingresarEquipo_local("Brooklyn Nets", "Gustavo Ramirez", "Blanco", "9","55", "Leandro Valdèz","10");
						consultarequipo_visitante();

						}
						 
						private static void consultarequipo_visitante() {
		// TODO Auto-generated method stub
		
	}

						private static void ingresarequipo_visitante(String string,
					String nombres_del_capitan, String string2, String string3,
					String string4, String string5, String string6) {
				// TODO Auto-generated method stub
				
			}

						public static void ingresarequipo_visitante(int equipo_visitante_id,String nombres_del_dt,int color_de_uniforme_del_equipo,int  numero_del_jugador, int tiros_celdas, int nombre_del_jugador, int tiempo_de_juego ){
						Connection conn;
						String url="jdbc:postgresql://localhost:5432/primerabdprogrog";
						String usuario="postgres";
						String clave="14953";
						 
						try {
						 
						conn=DriverManager.getConnection(url, usuario, clave);
						PreparedStatement stm=conn.
						prepareStatement("INSERT INTO equipo_visitante( equipo_visitante_id, nombres_del_dt, color_de_uniforme_del_equipo, numero_del_jugador,tiros_celdas,nombre_del_jugador,tiempo_de_juego) "+
						" VALUES (?, ?, ?, ?);");
						 
						stm.setInt (1, equipo_visitante_id);
						stm.setString (2, nombres_del_dt);
						stm.setInt (3,color_de_uniforme_del_equipo);
						stm.setDouble (4,numero_del_jugador);
						stm.setDouble (5,tiros_celdas);
						stm.setDouble (6,numero_del_jugador);
						stm.setDouble (7,tiempo_de_juego);
						stm.execute();
						 
						stm.close();
						conn.close();
						System.out.println("Ingreso exitoso!!");
						 
						} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
						}
						}
						 
						public static void ingresarEquipo_local(){
						Connection conn;
						String url="jdbc:postgresql://localhost:5432/primerabdprogrog";
						String usuario="Equipo_Visitante";
						String clave="14953";
						 
						try {
						 
						conn=DriverManager.getConnection(url, usuario, clave);
						Statement stm=conn.createStatement();
						stm.execute("INSERT INTO equipo_local( equipo_visitante_id, nombres_del_dt, color_de_uniforme_del_equipo, numero_del_jugador,tiros_celdas,nombre_del_jugador,tiempo_de_juego) VALUES (5, 'Consola', 56, 10.23);");
						 
						stm.close();
						conn.close();
						System.out.println("Ingreso exitoso!!");
						 
						} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
						}
						}
						 
						public static void consultarEquipo_local(){
						Connection conn;
						String url="jdbc:postgresql://localhost:5432/primerabdprogrog";
						String usuario="Equipo_Visitante";
						String clave="14953";
						 
						try {
						 
						conn=DriverManager.getConnection(url, usuario, clave);
						Statement stm=conn.createStatement();
						ResultSet rs=stm.executeQuery(" select * from Equipo_Visitante");
						 
						while(rs.next()){
						System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+
						rs.getInt(3)+" "+rs.getDouble(4));
						 
						}
						rs.close();
						stm.close();
						conn.close();
						 
						} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
						}
						}

						}

