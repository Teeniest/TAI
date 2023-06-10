package pfStark;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.*;

public class interfazGraf {
	private static String user = "caballero"; //User de la BD
	private static String pswd = "121499"; //Password de la BD
	private static String bd = "PF_Stark"; //Nombre de la BD
	private static String server = "jdbc:postgresql://localhost:5432/"+bd; //Llamando a nuestro server de BD
	private static String driver = "org.postgresql.Driver";//Driver que permite conectarse con PostgreSQL
	private static Connection con = null; //Para verificar la conexión
	
	BaseDatos conexion =  new BaseDatos();
	PreparedStatement ps;
	ResultSet result;
	
	public interfazGraf() {   
		//Creación de ventana
		JFrame ventana =new JFrame();
		//Creación de los paneles(consulta,alta,baja, mod)
	    JPanel p1=new JPanel();   
	    p1.setLayout(null);
	    JPanel p2=new JPanel();
	    p2.setLayout(null);
	    JPanel p3=new JPanel();
	    p3.setLayout(null);
	    JPanel p4=new JPanel();
	    p4.setLayout(null);
	    //Creación del panel de pestañas
	    JTabbedPane tp=new JTabbedPane();
	    tp.setBounds(10,10,750,320);  
	    //Agregar paneles
	    tp.add("Consulta",p1);  
	    tp.add("Alta",p2);  
	    tp.add("Baja",p3);
	    tp.add("Modificación",p4);
	    
	    
	    //Panel Consulta
	    
	    //Labels
	    JLabel lid=new JLabel("Búsqueda por ID");
	    lid.setBounds(0,0,300,20);
        p1.add(lid);
        JLabel lcol=new JLabel("Búsqueda por Color");
	    lcol.setBounds(0,40,300,20);
        p1.add(lcol);
        JLabel llin=new JLabel("Búsqueda por Linea");
	    llin.setBounds(0,80,300,20);
        p1.add(llin);
        JLabel lcat=new JLabel("Búsqueda por Categoria");
	    lcat.setBounds(0,120,300,20);
        p1.add(lcat);
        
        //Agregar campos de texto
        JTextField tf_id=new JTextField("");  
        tf_id.setBounds(200,0, 120,20);
        p1.add(tf_id);
        JTextField tf_col=new JTextField("");  
        tf_col.setBounds(200,40, 120,20);
        p1.add(tf_col);
        JTextField tf_lin=new JTextField("");  
        tf_lin.setBounds(200,80, 120,20);
        p1.add(tf_lin);
        JTextField tf_cat=new JTextField("");  
        tf_cat.setBounds(200,120, 120,20);
        p1.add(tf_cat);
	    
        //Botones
        JButton b1=new JButton("Buscar");     
        b1.setBounds(350,0,100,20);  
        p1.add(b1);
        JButton b2=new JButton("Buscar");     
        b2.setBounds(350,40,100,20);  
        p1.add(b2);
        JButton b3=new JButton("Buscar");     
        b3.setBounds(350,80,100,20);  
        p1.add(b3);
        JButton b4=new JButton("Buscar");     
        b4.setBounds(350,120,100,20);  
        p1.add(b4);
        
        
        //Config ventana
	    ventana.add(tp);  
	    ventana.setSize(800,600);  
	    ventana.setLayout(null);  
	    ventana.setVisible(true);  
	    ventana.setTitle("Stark Industries");
	    ventana.setResizable(false);	
	
	    b1.addActionListener(new ActionListener() {    
	    	public void actionPerformed (ActionEvent e) { 
	    		Connection con = null;
	    		
				try{
					con = (Connection)DriverManager.getConnection(server, user, 
							pswd);
					ps = con.prepareStatement("Select * from Piezas where Id_pza= ?");
					ps.setString(1, tf_id.getText());
					
					result = ps.executeQuery();
					
					if(result.next()) {

					}
				
				}
				catch(SQLException ex){
					System.out.println("Error al intentar conectarse a la BD"+ 
							server);
	    		tf_id.getText();    
				}		
	    	}
	    });	
	      	
	
		
	}	
	
}
