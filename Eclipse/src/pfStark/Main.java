package pfStark;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {
	public static void main (String []args){
		BaseDatos conexion =  new BaseDatos();
		ResultSet result;

		//Declaracion de las variables necesarias para guardar los datos que se obtuvieron de la base de datos
		String id_pza;
		String ancho,col,info_cat,Linea,alto,largo,fabricante;
		//Conexion con base de datos
		result = conexion.getQuery("select * from Piezas");
		try
		{
			while(result.next())
			{
				//Obtencion de los datos de la base de datos
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
		//Interfaz grafica (interfaz en desuso)
		//interfazGraf menu =  new interfazGraf();
		
		
		//Nimbus look and feel
		try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Interf_graf_v2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interf_graf_v2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interf_graf_v2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interf_graf_v2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
		//para mandar a llamar la ventana: Interfaz grafica, sin problemas (realizado por netbeans, se encuentra en el codigo
		//fuente del diseño, es necesario pasarlo al main)
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interf_graf_v2().setVisible(true);
            }
        });
	}
}