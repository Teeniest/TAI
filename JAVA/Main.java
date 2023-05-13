package pf_Stark;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Main 
{
	public static void main (String []args)
	{
		PF_Stark conexion =  new PF_Stark();
		ResultSet result;

		Int Tel;
		String Rfc,Nom,Dir;
		
		result = conexion.getQuery("select * from Fabricantes");
		try
		{
			while(result.next())
			{
				Tel = result.getInt("Tel");
				Nom = result.getString("Nom");
				Rfc = result.getString("RFC");
				Dir = result.getString("Dir");
				
				System.out.println("Nombre: " +  Nom);
				System.out.println("RFC: " + Rfc);
				System.out.println("Direccion: " + Dir);
				System.out.println ("\nTelefono: " + Tel);
			}
		}
		catch (SQLException e)
		{
			e.printStackTrace();
		}
		
	}
}