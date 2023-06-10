package pfStark;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {
	public static void main (String []args){
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
		//interfazGraf menu =  new interfazGraf();
		
		
		/* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
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
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interf_graf_v2().setVisible(true);
            }
        });
	}
}
