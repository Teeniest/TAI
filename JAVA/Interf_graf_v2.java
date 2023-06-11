package pfStark;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Interf_graf_v2 extends javax.swing.JFrame {

    private static final long serialVersionUID = 1L;
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
    public Interf_graf_v2() {
    	initComponents();
    	mensajeInicial();
        
    }
                      
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
        btnbuscarlin = new javax.swing.JButton();
        btnbuscarcol = new javax.swing.JButton();
        btnbuscarcat = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Stark Industries");
        setResizable(false);

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


        btnbuscarlin.setText("Buscar");
        btnbuscarlin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscarlinActionPerformed(evt);
            }
        });

        btnbuscarcol.setText("Buscar");
        btnbuscarcol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscarcolActionPerformed(evt);
            }
        });

        btnbuscarcat.setText("Buscar");
        btnbuscarcat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscarcatActionPerformed(evt);
            }
        });

        btnLimpiar.setText("Limpiar campos");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(jLabel8)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel3)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(61, 61, 61)
                                .addComponent(btnalta)))
                        .addGap(35, 35, 35)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(62, 62, 62)
                                .addComponent(btnbaja)
                                .addGap(73, 73, 73)
                                .addComponent(btnmod))
                            .addComponent(color, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(categoria, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(info_cat, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(largo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                                    .addComponent(ancho, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(alto, javax.swing.GroupLayout.Alignment.LEADING)))
                            .addComponent(linea, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(id_pza, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(6, 6, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(btnbuscarcat)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnbuscar)
                            .addComponent(btnbuscarlin)
                            .addComponent(btnbuscarcol))
                        .addContainerGap(93, Short.MAX_VALUE))))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addComponent(btnLimpiar)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(id_pza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnbuscar))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(linea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnbuscarlin))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(color, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnbuscarcol))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(categoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnbuscarcat))
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
                .addGap(28, 28, 28)
                .addComponent(btnLimpiar)
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 93, Short.MAX_VALUE))
        );

        pack();
    }                 
    
    
    private void mensajeInicial() {
    	JOptionPane.showMessageDialog(null, "Instrucciones "
    			+ "\nEs necesario realizar una búsqueda para borrar o modificar "
    			+ "\nun registro, existen 4 tipos de búsquedas: por ID, linea, "
    			+ "\ncolor o categoria, con su respectivo botón a la derecha"
    			+ "\n(considere que la opción id encuentra un único registro, "
    			+ "\nmientras que linea, color o categoria pueden encontrar "
    			+ "\nregistros con las mismas características pero solo se "
    			+ "\nmostrará el primer registro encontrado). Para dar de alta "
    			+ "\nuna pieza ingrese los datos en los campos y presione el botón (Alta) ");
    	JOptionPane.showMessageDialog(null, "Cada campo tiene un tipo de dato:"
    			+ "\nid: Int"
    			+ "\nlinea: Int"
    			+ "\ncolor: String (20 caracteres max.)"
    			+ "\ncategoria: String (9 caracteres max.)"
    			+ "\ninformación de categoría: String (5 caracteres max.)"
    			+ "\nalto, ancho y largo: Float");
    }
    
    private void btnbuscarActionPerformed(java.awt.event.ActionEvent evt) {                                          
        Connection con = null;
        try {
            con=conexion();
            ps=con.prepareStatement("select * from piezas where id_pza = ?");
            ps.setInt(1, Integer.parseInt(id_pza.getText()));
            
            rs=ps.executeQuery();
            
            if(rs.next()) {
                id_pza.setText((rs.getString("id_pza")));
                linea.setText((rs.getString("lin")));
                color.setText((rs.getString("color")));
                categoria.setText((rs.getString("cat")));
                info_cat.setText((rs.getString("inf_cat")));
                ancho.setText((rs.getString("ancho")));
                alto.setText((rs.getString("alto")));
                largo.setText((rs.getString("largo")));
            }
            else {
                JOptionPane.showMessageDialog(null, "Clave no encontrada");
            }
        }
        catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Error: "+e);
            limpiartextFields();
        }
    }                                         

    private void btnbajaActionPerformed(java.awt.event.ActionEvent evt) {                                        
         Connection con = null;
        try {
            con = conexion();
            ps = con.prepareStatement("delete from piezas where id_pza=?");
            
            ps.setInt(1, Integer.parseInt(id_pza.getText())); //parse permite transformar la variable
            
            int res=ps.executeUpdate();
            if (res>0) {
                JOptionPane.showMessageDialog(null,"Borrado exitoso");
                limpiartextFields();
            }
            else {
                JOptionPane.showMessageDialog(null, "Borrado no registrado");
                limpiartextFields();
            }
            con.close();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error: "+e);
            limpiartextFields();
        }
    }                                       

    private void btnmodActionPerformed(java.awt.event.ActionEvent evt) {                                       
        Connection con = null;
        try {
            con = conexion();
            ps = con.prepareStatement("update piezas set id_pza=?, lin=?, color=?, cat=?, inf_cat=?,ancho=?,alto=?, largo=? where id_pza=?");
            
            ps.setInt(1, Integer.parseInt(id_pza.getText())); //parse permite transformar la variable
            ps.setInt(2, Integer.parseInt(linea.getText()));
            ps.setString(3, color.getText());
            ps.setString(4, categoria.getText());
            ps.setString(5, info_cat.getText());
            ps.setFloat(6, Float.parseFloat(alto.getText()));
            ps.setFloat(7, Float.parseFloat(ancho.getText()));
            ps.setFloat(8, Float.parseFloat(largo.getText()));
            ps.setInt(9, Integer.parseInt(id_pza.getText()));
            
            int res=ps.executeUpdate();
            if (res>0) {
                JOptionPane.showMessageDialog(null,"Modificación exitosa");
                limpiartextFields();
            }
            else {
                JOptionPane.showMessageDialog(null, "Modificación no registrada");
                limpiartextFields();
            }
            con.close();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error: "+e);
            limpiartextFields();
        }
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
                JOptionPane.showMessageDialog(null,"Alta exitosa");
                limpiartextFields();
            }
            else {
                JOptionPane.showMessageDialog(null, "Alta no registrada");
                limpiartextFields();
            }
            con.close();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,"Error: "+e);
            limpiartextFields();
        }
    }                                       

    private void btnbuscarlinActionPerformed(java.awt.event.ActionEvent evt) {                                             
        Connection con = null;
        try {
            con=conexion();
            ps=con.prepareStatement("select * from piezas where lin = ?");
            ps.setInt(1, Integer.parseInt(linea.getText()));
            
            rs=ps.executeQuery();
            
            if(rs.next()) {
                id_pza.setText((rs.getString("id_pza")));
                linea.setText((rs.getString("lin")));
                color.setText((rs.getString("color")));
                categoria.setText((rs.getString("cat")));
                info_cat.setText((rs.getString("inf_cat")));
                ancho.setText((rs.getString("ancho")));
                alto.setText((rs.getString("alto")));
                largo.setText((rs.getString("largo")));
            }
            else {
                JOptionPane.showMessageDialog(null, "Linea no encontrada");
            }
        }
        catch(Exception e) {
        	JOptionPane.showMessageDialog(null,"Error: "+e);
            limpiartextFields();
        }
    }                                            

    private void btnbuscarcolActionPerformed(java.awt.event.ActionEvent evt) {                                             
        Connection con = null;
        try {
            con=conexion();
            ps=con.prepareStatement("select * from piezas where color = ?");
            ps.setString(1, color.getText());
            
            rs=ps.executeQuery();
            
            if(rs.next()) {
                id_pza.setText((rs.getString("id_pza")));
                linea.setText((rs.getString("lin")));
                color.setText((rs.getString("color")));
                categoria.setText((rs.getString("cat")));
                info_cat.setText((rs.getString("inf_cat")));
                ancho.setText((rs.getString("ancho")));
                alto.setText((rs.getString("alto")));
                largo.setText((rs.getString("largo")));
            }
            else {
                JOptionPane.showMessageDialog(null, "Color no encontrado");
            }
        }
        catch(Exception e) {
        	JOptionPane.showMessageDialog(null,"Error: "+e);
            limpiartextFields();
        }
    }                                            

    private void btnbuscarcatActionPerformed(java.awt.event.ActionEvent evt) {                                             
        Connection con = null;
        try {
            con=conexion();
            ps=con.prepareStatement("select * from piezas where cat = ?");
            ps.setString(1, categoria.getText());
            
            rs=ps.executeQuery();
            
            if(rs.next()) {
                id_pza.setText((rs.getString("id_pza")));
                linea.setText((rs.getString("lin")));
                color.setText((rs.getString("color")));
                categoria.setText((rs.getString("cat")));
                info_cat.setText((rs.getString("inf_cat")));
                ancho.setText((rs.getString("ancho")));
                alto.setText((rs.getString("alto")));
                largo.setText((rs.getString("largo")));
            }
            else {
                JOptionPane.showMessageDialog(null, "Categoria no encontrada");
            }
        }
        catch(Exception e) {
        	JOptionPane.showMessageDialog(null,"Error: "+e);
            limpiartextFields();
        }
    }                                            

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {                                           
        limpiartextFields();
        JOptionPane.showMessageDialog(null,"Limpieza de campos realizada");
    }                                          


    // Variables declaration - do not modify                     
    private javax.swing.JTextField alto;
    private javax.swing.JTextField ancho;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnalta;
    private javax.swing.JButton btnbaja;
    private javax.swing.JButton btnbuscar;
    private javax.swing.JButton btnbuscarcat;
    private javax.swing.JButton btnbuscarcol;
    private javax.swing.JButton btnbuscarlin;
    private javax.swing.JButton btnmod;
    private javax.swing.JTextField categoria;
    private javax.swing.JTextField color;
    private javax.swing.JTextField id_pza;
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
