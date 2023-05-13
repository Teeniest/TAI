package bdEjemplo;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Main 
{
	public static void main (String []args)
	{
		MiBD conexion =  new MiBD();
		ResultSet result;
		int id;
		String nombre,ap_pat,ap_mat;
		
		result = conexion.getQuery("select * from personas");
		try
		{
			while(result.next())
			{
				id = result.getInt("Id");
				nombre = result.getString("Nombre");
				ap_pat = result.getString("Ap_Pat");
				ap_mat = result.getString("Ap_Mat");
				
				System.out.println ("\nID Maestro: " + id);
				System.out.println("Nombre Maestro: " +  nombre);
				System.out.println("Apellido Paterno: " + ap_pat);
				System.out.println("Apellido Materno: " + ap_mat);
			}
		}
		catch (SQLException e)
		{
			e.printStackTrace();
		}
		
	}
}