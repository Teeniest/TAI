package pfStark;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {
	public static void main (String []args)
	{
		BaseDatos conexion =  new BaseDatos();
		ResultSet result;

		int Tel;
		String Rfc,Nom,Dir;
		
		result = conexion.getQuery("select * from Fabricante");
		try
		{
			while(result.next())
			{
				Tel = result.getInt("Tel");
				Nom = result.getString("Nom");
				Rfc = result.getString("RFC");
				Dir = result.getString("Dir");
				
				System.out.println("\nNombre: " +  Nom);
				System.out.println("RFC: " + Rfc);
				System.out.println("Direccion: " + Dir);
				System.out.println ("Telefono: " + Tel);
			}
		}
		catch (SQLException e)
		{
			e.printStackTrace();
		}
		
	}
}