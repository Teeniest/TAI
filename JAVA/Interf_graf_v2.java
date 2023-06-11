package pfStark;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Interf_graf_v2 extends javax.swing.JFrame {
	private static String user = "caballero"; //User de la BD
	private static String pswd = "121499"; //Password de la BD
	private static String bd = "PF_Stark"; //Nombre de la BD
	private static String server = "jdbc:postgresql://localhost:5432/"+bd; //Llamando a nuestro server de BD
	private static String driver = "org.postgresql.Driver";//Driver que permite conectarse con PostgreSQL
	private static Connection con = null; //Para verificar la conexión
	
	PreparedStatement ps;
	ResultSet rs;
	
	public Connection conexion(){
		//Conexion con la base de datos
		try{
			Class.forName(driver);
			con = (Connection)DriverManager.getConnection(server, user, 
					pswd);
			
			if(con != null)
			{
				System.out.println("La conexión a la BD: "+ server +" "
						+ "se realizo al 100%");
			}
		}
		catch(SQLException ex){
			System.out.println("Error al intentar conectarse a la BD"+ 
		server);
		}
		catch(ClassNotFoundException ex){
			System.out.println(ex);
		}
		return con;
	}	
		
	private void limpiartextFields(){
		//Limpieza de los campos
		id_pza.setText(null);
		linea.setText(null);
		color.setText(null);
		categoria.setText(null);
		info_cat.setText(null);
		alto.setText(null);
		ancho.setText(null);
		largo.setText(null);
	}
	
	//Diseño de la interfaz grafica
    public Interf_graf_v2() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btnbuscar = new javax.swing.JButton();
        btnalta = new javax.swing.JButton();
        btnbaja = new javax.swing.JButton();
        btnmod = new javax.swing.JButton();
        id_pza = new javax.swing.JTextField();
        linea = new javax.swing.JTextField();
        color = new javax.swing.JTextField();
        categoria = new javax.swing.JTextField();
        info_cat = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        alto = new javax.swing.JTextField();
        ancho = new javax.swing.JTextField();
        largo = new javax.swing.JTextField();
        id_pza_guarda = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Stark Industries");

        jLabel5.setText("Id pieza");

        jLabel6.setText("Linea");

        jLabel7.setText("Color");

        jLabel8.setText("Categoria");

        jLabel9.setText("Información de categoria");

        btnbuscar.setText("Buscar");
        btnbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscarActionPerformed(evt);
            }
        });

        btnalta.setText("Alta");
        btnalta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaltaActionPerformed(evt);
            }
        });

        btnbaja.setText("Baja");
        btnbaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbajaActionPerformed(evt);
            }
        });

        btnmod.setText("Modificacion");
        btnmod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmodActionPerformed(evt);
            }
        });

        jLabel1.setText("Alto");

        jLabel2.setText("Ancho");

        jLabel3.setText("Largo");

        alto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                altoActionPerformed(evt);
            }
        });

        id_pza_guarda.setEnabled(false);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel8)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel5Layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addGap(121, 121, 121)
                                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(color, javax.swing.GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE)
                                        .addComponent(linea)
                                        .addGroup(jPanel5Layout.createSequentialGroup()
                                            .addComponent(id_pza, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(id_pza_guarda, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnbuscar))
                                .addGroup(jPanel5Layout.createSequentialGroup()
                                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel9)
                                        .addComponent(jLabel3)
                                        .addGroup(jPanel5Layout.createSequentialGroup()
                                            .addGap(61, 61, 61)
                                            .addComponent(btnalta)))
                                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel5Layout.createSequentialGroup()
                                            .addGap(18, 18, 18)
                                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(categoria, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(info_cat, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                    .addComponent(largo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                                                    .addComponent(ancho, javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(alto, javax.swing.GroupLayout.Alignment.LEADING))))
                                        .addGroup(jPanel5Layout.createSequentialGroup()
                                            .addGap(62, 62, 62)
                                            .addComponent(btnbaja)
                                            .addGap(73, 73, 73)
                                            .addComponent(btnmod)))
                                    .addGap(41, 41, 41))))
                        .addGap(0, 166, Short.MAX_VALUE))))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(id_pza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnbuscar)
                    .addComponent(id_pza_guarda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(linea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(color, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(categoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(info_cat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(alto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(ancho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(largo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnalta)
                    .addComponent(btnbaja)
                    .addComponent(btnmod))
                .addGap(71, 71, 71))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 93, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    private void btnbuscarActionPerformed(java.awt.event.ActionEvent evt) {                                          
        
    }                                         

    private void btnbajaActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
    }                                       

    private void altoActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
    }                                    

    private void btnmodActionPerformed(java.awt.event.ActionEvent evt) {                                       
        // TODO add your handling code here:
    }                                      

    private void btnaltaActionPerformed(java.awt.event.ActionEvent evt) {                                        
    	Connection con = null;
    	try {
    		con = conexion();
    		ps = con.prepareStatement("insert into piezas(Id_pza, lin, color, cat, inf_cat, ancho,alto, largo) values(?,?,?,?,?,?,?,?)");
    		
    		ps.setInt(1, Integer.parseInt(id_pza.getText())); //parse permite transformar la variable
    		ps.setInt(2, Integer.parseInt(linea.getText()));
    		ps.setString(3, color.getText());
    		ps.setString(4, categoria.getText());
    		ps.setString(5, info_cat.getText());
    		ps.setFloat(6, Float.parseFloat(alto.getText()));
    		ps.setFloat(7, Float.parseFloat(ancho.getText()));
    		ps.setFloat(8, Float.parseFloat(largo.getText()));
    		
    		int res=ps.executeUpdate();
    		if (res>0) {
    			JOptionPane.showMessageDialog(null,"Alta finalizada correctamente");
    			limpiartextFields();
    		}
    		else {
    			JOptionPane.showMessageDialog(null, "Error");
    			limpiartextFields();
    		}
    		con.close();
    	}
    	catch(Exception e){
    		System.err.println(e);
    	}
    }                                       

   
    // Variables declaration - do not modify                     
    private javax.swing.JTextField alto;
    private javax.swing.JTextField ancho;
    private javax.swing.JButton btnalta;
    private javax.swing.JButton btnbaja;
    private javax.swing.JButton btnbuscar;
    private javax.swing.JButton btnmod;
    private javax.swing.JTextField categoria;
    private javax.swing.JTextField color;
    private javax.swing.JTextField id_pza;
    private javax.swing.JTextField id_pza_guarda;
    private javax.swing.JTextField info_cat;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JTextField largo;
    private javax.swing.JTextField linea;
    // End of variables declaration                   
}
