import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main_Usuario {

	public static void main(String[] args) {
		
		//ingresarProductos();
		//consultarProducto();
						
		ingresarusuario_equipo("1", "Liliana Nereira", "Merchàn Santana", "0950539684", "14953", "20");
		//ingresarEusuario_equipo("2", "Josè Eduardo", "Guzmàn Muñoz", "1403213284","12345","19");
		//ingresarusuario_equipo("3", "Isabel Estefania", "Pardo Carrion", "0925384920","19953", "20");
		//ingresarusuario_equipo("4", "Jefferson", "Mora Lozano","1400323961", "19959", "21")
		consultarusuario_equipo();

						}
						 
						private static void consultarusuario_equipo() {
		// TODO Auto-generated method stub
		
	}

						private static void ingresarusuario_equipo(String string, String string2,
			String string3, String string4, String string5, String string6) {
		// TODO Auto-generated method stub
		
	}

						private static void usuario_equipo(String string,
					String nombres_del_capitan, String string2, String string3,
					String string4, String string5, String string6) {
				// TODO Auto-generated method stub
				
			}

						public static void ingresarEquipo_local(int usuario_id,String nombres_del_capitan,int color_de_uniforme_del_equipo,int  numero_del_jugador, int tiros_celdas, int nombre_del_entrenador, int tiempo_de_juego ){
						Connection conn;
						String url="jdbc:postgresql://localhost:5432/primerabdprogrog";
						String usuario="postgres";
						String clave="14953";
						 
						try {
						 
						conn=DriverManager.getConnection(url);
						PreparedStatement stm=conn.
						prepareStatement("INSERT INTO usuario_equipo(usuario_id ,  nombres, apellidos, cedula, edad) "+
						" VALUES (?, ?, ?, ?);");
						 
						stm.setInt (1,usuario_id);
						float nombres = 0;
						stm.setFloat (2,nombres);
						int apellidos = 0;
						stm.setInt (3,apellidos);
						double cedula = 0;
						stm.setDouble (4, cedula);
						double edad = 0;
						stm.setDouble (5,edad);
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
						String usuario="Usuario";
						String clave="14953";
						 
						try {
						 
						conn=DriverManager.getConnection(url, usuario, clave);
						Statement stm=conn.createStatement();
						stm.execute("INSERT INTO usuario_equipo (usuario_id ,  nombres, apellidos, cedula, edad) VALUES (5, 'Consola', 56, 10.23);");
						 
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
						String usuario="Usuario";
						String clave="14953";
						 
						try {
						 
						conn=DriverManager.getConnection(url, usuario, clave);
						Statement stm=conn.createStatement();
						ResultSet rs=stm.executeQuery("select * from usuario_equipo");
						 
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