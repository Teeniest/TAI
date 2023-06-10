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
	    //Agregar labels
	    JLabel lid=new JLabel("Búsqueda por ID");
	    lid.setBounds(0,0,300,20);
        p1.add(lid);
        //JLabel lcol=new JLabel("Búsqueda por Color");
	    //lcol.setBounds(1,10,30,30);
        //p1.add(lcol);
        //Agregar campos de texto
        JTextField tf_id=new JTextField("");  
        tf_id.setBounds(120,0, 120,20);
        p1.add(tf_id);
	    //Config ventana
	    ventana.add(tp);  
	    ventana.setSize(800,400);  
	    ventana.setLayout(null);  
	    ventana.setVisible(true);  
	    ventana.setTitle("Stark Industries");
	    ventana.setResizable(false);	
	}
}
