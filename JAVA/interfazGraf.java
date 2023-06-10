package pfStark;

import java.awt.*;
import javax.swing.*;

public class interfazGraf {
	BaseDatos conexion =  new BaseDatos();
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
	    lid.setBounds(0,50,300,20);
        p1.add(lid);
        JLabel lcol=new JLabel("Búsqueda por Color");
	    lcol.setBounds(0,90,300,20);
        p1.add(lcol);
        JLabel llin=new JLabel("Búsqueda por Linea");
	    llin.setBounds(0,130,300,20);
        p1.add(llin);
        JLabel lcat=new JLabel("Búsqueda por Categoria");
	    lcat.setBounds(0,170,300,20);
        p1.add(lcat);
        
        //Agregar campos de texto
        JTextField tf_id=new JTextField("");  
        tf_id.setBounds(200,50, 120,20);
        p1.add(tf_id);
        JTextField tf_col=new JTextField("");  
        tf_col.setBounds(200,90, 120,20);
        p1.add(tf_col);
        JTextField tf_lin=new JTextField("");  
        tf_lin.setBounds(200,130, 120,20);
        p1.add(tf_lin);
        JTextField tf_cat=new JTextField("");  
        tf_cat.setBounds(200,170, 120,20);
        p1.add(tf_cat);
	    
        //Botones
        JButton b1=new JButton("Buscar");     
        b1.setBounds(100,220,100,30);  
        p1.add(b1);
        
        
        //Config ventana
	    ventana.add(tp);  
	    ventana.setSize(800,400);  
	    ventana.setLayout(null);  
	    ventana.setVisible(true);  
	    ventana.setTitle("Stark Industries");
	    ventana.setResizable(false);	
	}
}
