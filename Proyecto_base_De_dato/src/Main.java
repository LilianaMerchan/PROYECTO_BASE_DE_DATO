
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

class Main {

	public static void main(String[] args) {
		//ingresarProductos();
		//consultarProducto();
				
				ingresarEquipo_local("Puertoliza", "Juan Perèz", "Amarillo", "15", "80", "Luis Gonzalèz","4");
				//ingresarEquipo_local("Londres", "Elias Mendoza", "Azul", "20","60", "Juan Aguirre","10");
				//ingresarEquipo_local("Inglaterra", "Abraham Espinoza", "Celeste", "14","50", "Juan Aguirre","20");
				consultarEquipo_local();

				}
				 
				private static void ingresarEquipo_local(String string,
			String nombres_del_capitan, String string2, String string3,
			String string4, String string5, String string6) {
		// TODO Auto-generated method stub
		
	}

				public static void ingresarEquipo_local(int equipo_local_id,String nombres_del_capitan,int color_de_uniforme_del_equipo,int  numero_del_jugador, int tiros_celdas, int nombre_del_entrenador, int tiempo_de_juego ){
				Connection conn;
				String url="jdbc:postgresql://localhost:5432/primerabdprogrog";
				String usuario="postgres";
				String clave="14953";
				 
				try {
				 
				conn=DriverManager.getConnection(url, usuario, clave);
				PreparedStatement stm=conn.
				prepareStatement("INSERT INTO equipo_local( equipo_local_id, nombres_del_capitan, color_de_uniforme_del_equipo, numero_del_jugador,tiros_celdas,nombre_del_entrenador,tiempo_de_juego) "+
				" VALUES (?, ?, ?, ?);");
				 
				stm.setInt (1, equipo_local_id);
				stm.setString (2, nombres_del_capitan);
				stm.setInt (3,color_de_uniforme_del_equipo);
				stm.setDouble (4,numero_del_jugador);
				stm.setDouble (5,tiros_celdas);
				stm.setDouble (6,nombre_del_entrenador);
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
				String usuario="EQUIPO_LOCAL";
				String clave="14953";
				 
				try {
				 
				conn=DriverManager.getConnection(url, usuario, clave);
				Statement stm=conn.createStatement();
				stm.execute("INSERT INTO equipo_local(equipo_local_id,nombres_del_capitan, color_de_uniforme_del_equipo, numero_del_jugador,tiros_celdas,nombre_del_entrenador,tiempo_de_juego) VALUES (5, 'Consola', 56, 10.23);");
				 
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
				String usuario="EQUIPO_LOCAL";
				String clave="14953";
				 
				try {
				 
				conn=DriverManager.getConnection(url, usuario, clave);
				Statement stm=conn.createStatement();
				ResultSet rs=stm.executeQuery("select * from Equipo_local");
				 
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
