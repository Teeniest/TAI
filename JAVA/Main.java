package pfStark;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {
	public static void main (String []args)
	{
		BaseDatos conexion =  new BaseDatos();
		ResultSet result;

		//int Tel;
		String id_pza;
		String ancho,col,info_cat,Linea,alto,largo,fabricante;
		
		result = conexion.getQuery("select * from Piezas");
		try
		{
			while(result.next())
			{
				//Tel = result.getInt("Tel");
				id_pza = result.getString("ID_pza");
				Linea = result.getString("Lin");
				col = result.getString("Color");
				info_cat = result.getString("Inf_cat");
				ancho = result.getString("Ancho");
				alto = result.getString("Alto");
				largo = result.getString("Largo");
				fabricante = result.getString("fk_fabricante");
				
				System.out.println("\nID: " +  id_pza);
				System.out.println("Linea: " + Linea);
				System.out.println("Color: " + col);
				System.out.println ("Información de categoria: " + info_cat);
				System.out.println ("Ancho: " + ancho);
				System.out.println ("Alto: " + alto);
				System.out.println ("Largo: " + largo);
				System.out.println ("Fabricada por: " + fabricante);
			}
		}
		catch (SQLException e)
		{
			e.printStackTrace();
		}
		//Interfaz grafica
		interfazGraf menu =  new interfazGraf();
		
	}
}
