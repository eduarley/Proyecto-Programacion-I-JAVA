/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package appproyectoeduardoarley;

import javax.swing.JOptionPane;


public class FrmInicioJuego extends javax.swing.JFrame {
    private static String nombre1;
    private static String nombre2;
    private static int puntaje;
    private static int categoria1;
    private static int categoria2;
    int num=0;
    
    //FrmJuego frmJuego =new FrmJuego();
    public FrmInicioJuego() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLblUnloked1 = new javax.swing.JLabel();
        jLblLocked1 = new javax.swing.JLabel();
        jLblUnloked = new javax.swing.JLabel();
        jLblLocked = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTxtJugador1 = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jTxtJugador2 = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jCboCategoriasJugador1 = new javax.swing.JComboBox<>();
        jCboCategoriasJugador2 = new javax.swing.JComboBox<>();
        jLblCatPlayer2 = new javax.swing.JLabel();
        P2 = new javax.swing.JLabel();
        jLblPlayer2 = new javax.swing.JLabel();
        jLblPlayer1 = new javax.swing.JLabel();
        jLblCatPlayer1 = new javax.swing.JLabel();
        P1 = new javax.swing.JLabel();
        jBtnReglas = new javax.swing.JButton();
        jBtnJugar = new javax.swing.JButton();
        jBtnCreaJugador1 = new javax.swing.JButton();
        jBtnCreaJugador2 = new javax.swing.JButton();
        jBtnEstadisticas = new javax.swing.JButton();
        jLblError = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLblUnloked1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/unlock.png"))); // NOI18N
        jPanel1.add(jLblUnloked1, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 80, -1, -1));

        jLblLocked1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Locked.png"))); // NOI18N
        jPanel1.add(jLblLocked1, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 80, -1, -1));

        jLblUnloked.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/unlock.png"))); // NOI18N
        jPanel1.add(jLblUnloked, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 90, -1, -1));

        jLblLocked.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Locked.png"))); // NOI18N
        jPanel1.add(jLblLocked, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 90, -1, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cerrar2.png"))); // NOI18N
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cerrar3.png"))); // NOI18N
        jButton1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cerrar1.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 0, 110, 80));

        jLabel1.setFont(new java.awt.Font("Decker", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(127, 220, 246));
        jLabel1.setText("Nombre:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 90, -1, -1));

        jTxtJugador1.setFont(new java.awt.Font("Decker", 0, 24)); // NOI18N
        jTxtJugador1.setForeground(new java.awt.Color(204, 204, 204));
        jTxtJugador1.setText("Ingresar nombre");
        jTxtJugador1.setBorder(null);
        jTxtJugador1.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentRemoved(java.awt.event.ContainerEvent evt) {
                jTxtJugador1ComponentRemoved(evt);
            }
        });
        jTxtJugador1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTxtJugador1MouseClicked(evt);
            }
        });
        jTxtJugador1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtJugador1ActionPerformed(evt);
            }
        });
        jTxtJugador1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTxtJugador1KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTxtJugador1KeyReleased(evt);
            }
        });
        jPanel1.add(jTxtJugador1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, 220, 41));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 130, 230, 20));

        jLabel2.setFont(new java.awt.Font("Decker", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(127, 220, 246));
        jLabel2.setText("Nombre:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        jTxtJugador2.setFont(new java.awt.Font("Decker", 0, 24)); // NOI18N
        jTxtJugador2.setForeground(new java.awt.Color(204, 204, 204));
        jTxtJugador2.setText("Ingresar nombre");
        jTxtJugador2.setBorder(null);
        jTxtJugador2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTxtJugador2MouseClicked(evt);
            }
        });
        jTxtJugador2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtJugador2ActionPerformed(evt);
            }
        });
        jTxtJugador2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTxtJugador2KeyPressed(evt);
            }
        });
        jPanel1.add(jTxtJugador2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 80, 230, 41));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, 230, 20));

        jCboCategoriasJugador1.setFont(new java.awt.Font("Decker", 2, 18)); // NOI18N
        jCboCategoriasJugador1.setForeground(new java.awt.Color(51, 153, 255));
        jCboCategoriasJugador1.setToolTipText("Seleccione una categoría");
        jCboCategoriasJugador1.setBorder(javax.swing.BorderFactory.createTitledBorder("Categorías"));
        jCboCategoriasJugador1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jCboCategoriasJugador1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCboCategoriasJugador1ActionPerformed(evt);
            }
        });
        jPanel1.add(jCboCategoriasJugador1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 270, 50));

        jCboCategoriasJugador2.setFont(new java.awt.Font("Decker", 2, 18)); // NOI18N
        jCboCategoriasJugador2.setToolTipText("Seleccione una categoría");
        jCboCategoriasJugador2.setBorder(javax.swing.BorderFactory.createTitledBorder("Categorías"));
        jCboCategoriasJugador2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jCboCategoriasJugador2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCboCategoriasJugador2ActionPerformed(evt);
            }
        });
        jPanel1.add(jCboCategoriasJugador2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 160, 270, 50));

        jLblCatPlayer2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLblCatPlayer2.setForeground(new java.awt.Color(51, 153, 255));
        jLblCatPlayer2.setText("Categoria 2");
        jPanel1.add(jLblCatPlayer2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 540, -1, -1));

        P2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/P2.png"))); // NOI18N
        jPanel1.add(P2, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 490, 120, 90));

        jLblPlayer2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLblPlayer2.setForeground(new java.awt.Color(51, 153, 255));
        jLblPlayer2.setText("Player 2");
        jPanel1.add(jLblPlayer2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 490, -1, -1));

        jLblPlayer1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLblPlayer1.setForeground(new java.awt.Color(51, 153, 255));
        jLblPlayer1.setText("Player 1");
        jPanel1.add(jLblPlayer1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 490, -1, -1));

        jLblCatPlayer1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLblCatPlayer1.setForeground(new java.awt.Color(51, 153, 255));
        jLblCatPlayer1.setText("Categoria 1");
        jPanel1.add(jLblCatPlayer1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 540, -1, -1));

        P1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/P1.png"))); // NOI18N
        jPanel1.add(P1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 490, 110, 80));

        jBtnReglas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Reglas2.png"))); // NOI18N
        jBtnReglas.setBorder(null);
        jBtnReglas.setBorderPainted(false);
        jBtnReglas.setContentAreaFilled(false);
        jBtnReglas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBtnReglas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBtnReglas.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Reglas3.png"))); // NOI18N
        jBtnReglas.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Reglas.png"))); // NOI18N
        jBtnReglas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnReglasActionPerformed(evt);
            }
        });
        jPanel1.add(jBtnReglas, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, -1, -1));

        jBtnJugar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Boton_jugar2.png"))); // NOI18N
        jBtnJugar.setBorder(null);
        jBtnJugar.setBorderPainted(false);
        jBtnJugar.setContentAreaFilled(false);
        jBtnJugar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBtnJugar.setEnabled(false);
        jBtnJugar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Boton_jugar3.png"))); // NOI18N
        jBtnJugar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Boton_jugar_1.png"))); // NOI18N
        jBtnJugar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBtnJugarMouseClicked(evt);
            }
        });
        jBtnJugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnJugarActionPerformed(evt);
            }
        });
        jPanel1.add(jBtnJugar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 380, -1, -1));

        jBtnCreaJugador1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/crearjugador1-2.png"))); // NOI18N
        jBtnCreaJugador1.setBorder(null);
        jBtnCreaJugador1.setBorderPainted(false);
        jBtnCreaJugador1.setContentAreaFilled(false);
        jBtnCreaJugador1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBtnCreaJugador1.setEnabled(false);
        jBtnCreaJugador1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBtnCreaJugador1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/crearjugador1-3.png"))); // NOI18N
        jBtnCreaJugador1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/crearjugador1-1.png"))); // NOI18N
        jBtnCreaJugador1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCreaJugador1ActionPerformed(evt);
            }
        });
        jPanel1.add(jBtnCreaJugador1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, -1, -1));

        jBtnCreaJugador2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/crearjugador2-2.png"))); // NOI18N
        jBtnCreaJugador2.setBorder(null);
        jBtnCreaJugador2.setBorderPainted(false);
        jBtnCreaJugador2.setContentAreaFilled(false);
        jBtnCreaJugador2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBtnCreaJugador2.setEnabled(false);
        jBtnCreaJugador2.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/crearjugador2-3.png"))); // NOI18N
        jBtnCreaJugador2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/crearjugador2-1.png"))); // NOI18N
        jBtnCreaJugador2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCreaJugador2ActionPerformed(evt);
            }
        });
        jPanel1.add(jBtnCreaJugador2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 240, 240, 110));

        jBtnEstadisticas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Estadisticas2.png"))); // NOI18N
        jBtnEstadisticas.setBorder(null);
        jBtnEstadisticas.setBorderPainted(false);
        jBtnEstadisticas.setContentAreaFilled(false);
        jBtnEstadisticas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBtnEstadisticas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBtnEstadisticas.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Estadisticas3.png"))); // NOI18N
        jBtnEstadisticas.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Estadisticas.png"))); // NOI18N
        jPanel1.add(jBtnEstadisticas, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 380, -1, -1));

        jLblError.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLblError.setForeground(new java.awt.Color(255, 51, 51));
        jLblError.setText("CATEGORÍAS DEBEN SER DISTINTAS!");
        jPanel1.add(jLblError, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 360, -1, -1));

        jSeparator4.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 80, 40, 160));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icono.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 630));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, 230, 20));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        
        
        jTxtJugador1.requestFocus();
        jLblLocked.setVisible(false);
        jLblLocked1.setVisible(false);
        //Juego juego1=new Juego();
//        Categoria categorias[]=juego1.getCategorias();
//        for (Categoria categoria : categorias) {
//            jCboCategorias.addItem(categoria.getNombre());
//        }
//        jCboCategorias.setSelectedIndex(-1);
        for(Enum_Categorias micategoria: Enum_Categorias.values()){
            jCboCategoriasJugador1.setSelectedIndex(-1);
            jCboCategoriasJugador1.addItem(micategoria);
        }
         for(Enum_Categorias micategoria: Enum_Categorias.values()){
            jCboCategoriasJugador2.setSelectedIndex(-1);
            jCboCategoriasJugador2.addItem(micategoria);
        }
        P1.setVisible(false);
        jLblPlayer1.setVisible(false);
        jLblCatPlayer1.setVisible(false);
        jLblError.setVisible(false);
        jLblCatPlayer2.setVisible(false);
        jLblPlayer2.setVisible(false);
        P2.setVisible(false);
        
    }//GEN-LAST:event_formWindowOpened

    private void jBtnCreaJugador1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCreaJugador1ActionPerformed
        categoria1=jCboCategoriasJugador1.getSelectedIndex();
        categoria2=jCboCategoriasJugador2.getSelectedIndex();
        
        if("".equals(jTxtJugador1.getText())){
            JOptionPane.showMessageDialog(this, "Debe ingresar un nombre primero!", "ERROR", JOptionPane.ERROR_MESSAGE);
            jTxtJugador1.requestFocus();
            return;
            
        }
        if(jCboCategoriasJugador1.getSelectedIndex()<0){
            JOptionPane.showMessageDialog(this, "Debe escoger una categoría!", "ERROR", JOptionPane.ERROR_MESSAGE);
            jCboCategoriasJugador1.requestFocus();
        }
        
        if(categoria1==-1&&categoria2==-1){
            return;
        } 
      if(categoria1==categoria2){
          jLblError.setVisible(true);
      }else{
          jLblError.setVisible(false);
        
        
        
        
        
        
        
          
        nombre1=jTxtJugador1.getText();
        
        if(jCboCategoriasJugador1.getSelectedIndex()>=0){          
            jTxtJugador1.setEnabled(false);           
            jCboCategoriasJugador1.setEnabled(false);
            jBtnCreaJugador1.setEnabled(false);
            num++;
            jTxtJugador2.requestFocus();
            P1.setVisible(true);
            jLblPlayer1.setVisible(true);
           // jLblPlayer1.setText(""+nombre1.replace(nombre1.charAt(0), nombre1.toUpperCase().charAt(0)));
            jLblPlayer1.setText(nombre1);
            jLblCatPlayer1.setVisible(true);
            jLblCatPlayer1.setText(""+jCboCategoriasJugador1.getSelectedItem());
            jLblUnloked.setVisible(false);
            jLblLocked.setVisible(true);
            
        }
        
      }
    }//GEN-LAST:event_jBtnCreaJugador1ActionPerformed

    private void jTxtJugador1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtJugador1ActionPerformed
        jCboCategoriasJugador1.requestFocus();
    }//GEN-LAST:event_jTxtJugador1ActionPerformed

    private void jTxtJugador1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTxtJugador1KeyPressed
        
        if(jTxtJugador1.getText().trim().length()>-1){
            jBtnCreaJugador1.setEnabled(true);
            
        }
        if(jTxtJugador1.getText().trim().equals("Ingresar nombre")){
            jTxtJugador1.setText("");
        }
        
    }//GEN-LAST:event_jTxtJugador1KeyPressed

    private void jBtnCreaJugador2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCreaJugador2ActionPerformed
        categoria1=jCboCategoriasJugador1.getSelectedIndex();
        categoria2=jCboCategoriasJugador2.getSelectedIndex();
        if("".equals(jTxtJugador2.getText())){
            JOptionPane.showMessageDialog(this, "Debe ingresar un nombre primero!", "ERROR", JOptionPane.ERROR_MESSAGE);
            jTxtJugador2.requestFocus();
            return;
            
        }
        if(jCboCategoriasJugador2.getSelectedIndex()<0){
            JOptionPane.showMessageDialog(this, "Debe escoger una categoría!", "ERROR", JOptionPane.ERROR_MESSAGE);
            jCboCategoriasJugador2.requestFocus();
        } 
        if(categoria1==-1&&categoria2==-1){
            return;
        } 
      if(categoria1==categoria2){
          jLblError.setVisible(true);
      }else{
          jLblError.setVisible(false);




//        if("".equals(jTxtJugador2.getText())){
//            JOptionPane.showMessageDialog(null, "Debe ingresar un nombre primero");
//            
//        }
//        if(jCboCategorias.getSelectedIndex()<0){
//            JOptionPane.showMessageDialog(null, "Escoja una categoría");
//        }else{  
//        String nombre=jTxtJugador2.getText();
//        int puntaje =0;
//        Jugador jugador2 =new Jugador(nombre, puntaje);
//        jugador2.setNickname(nombre);
//        int indice =jCboCategorias.getSelectedIndex();
//        Categoria categoria2 =new Categoria(jCboCategorias.getItemAt(indice), nombre);
//        if(jCboCategorias.getSelectedIndex()>=0){
//            jTxaResultado.append(jugador2.toString()+categoria2.toString()+"\n"); 
//            jCboCategorias.setSelectedIndex(-1);
//            jTxtJugador2.setEnabled(false);
//            jBtnCreaJugador2.setEnabled(false);
//            num++;
//            jTxtJugador1.requestFocus();
//            
//        }
//        }
         
        
        nombre2=jTxtJugador2.getText();
        
        if(jCboCategoriasJugador2.getSelectedIndex()>=0){          
            jTxtJugador2.setEnabled(false);
            jCboCategoriasJugador2.setEnabled(false);
            jBtnCreaJugador2.setEnabled(false);
            num++;
            jTxtJugador2.requestFocus();
            jBtnJugar.setEnabled(true);
            jLblCatPlayer2.setText(""+jCboCategoriasJugador2.getSelectedItem());
            //jLblPlayer2.setText(""+nombre2.replace(nombre2.charAt(0), nombre2.toUpperCase().charAt(0)));
            jLblPlayer2.setText(nombre2);
            jLblCatPlayer2.setVisible(true);
            jLblPlayer2.setVisible(true);
            P2.setVisible(true);
            
            
            jLblLocked1.setVisible(true);
            jLblUnloked1.setVisible(false);
//            int indice=jCboCategoriasJugador2.getSelectedIndex();
//            if(indice!=-1){
//            jCboCategoriasJugador1.removeItemAt(indice);
//            }
//            P1.setVisible(true);
//            jLblPlayer1.setVisible(true);
//            jLblPlayer1.setText(nombre.toUpperCase());
//            jLblCatPlayer1.setVisible(true);
//            jLblCatPlayer1.setText(""+jCboCategoriasJugador1.getSelectedItem());
            
        }
        
      }
        

        


    }//GEN-LAST:event_jBtnCreaJugador2ActionPerformed

    private void jTxtJugador2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTxtJugador2KeyPressed
        if(jTxtJugador2.getText().trim().length()>-1){
            jBtnCreaJugador2.setEnabled(true);
        }
        if(jTxtJugador2.getText().trim().equals("Ingresar nombre")){
            jTxtJugador2.setText("");
        }
    }//GEN-LAST:event_jTxtJugador2KeyPressed

    private void jCboCategoriasJugador2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCboCategoriasJugador2ActionPerformed
      
    }//GEN-LAST:event_jCboCategoriasJugador2ActionPerformed

    private void jBtnReglasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnReglasActionPerformed
        JOptionPane.showMessageDialog(this, "Reglas: \nAl iniciar el juego, se debe crear dos jugadores (obligatoriamente). "
                + "\nCada uno de ellos con sus respectivos nombres deberán escoger una categoría para cada uno; deben"
                + " ser distintas."
                + "\nUna vez creado los jugadores, se podrá acceder al juego."
                + "\nLos dos jugadores deberán responder 5 preguntas cada uno, turnándose."
                + "\nEl jugador con mayor respuestas contestadas correctamente ganará."
                +"\nEl juego está basado en una escala del 0 al 50, siendo 50 la calificación más alta.", "Información acerca del juego", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jBtnReglasActionPerformed

    private void jBtnJugarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtnJugarMouseClicked

    }//GEN-LAST:event_jBtnJugarMouseClicked

    private void jBtnJugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnJugarActionPerformed
            categoria1=jCboCategoriasJugador1.getSelectedIndex();
        categoria2=jCboCategoriasJugador2.getSelectedIndex();

        
        
        if(categoria1==-1&&categoria2==-1){
            return;
        } 
        
        
        
         if(categoria1!=categoria2){
        if(num==2){
         
               FrmJuego frmJuego =new FrmJuego();
               frmJuego.setVisible(true);
               frmJuego.setLocationRelativeTo(null);
               frmJuego.setDefaultCloseOperation(frmJuego.DISPOSE_ON_CLOSE);
               this.setVisible(false);
               
            }else{
                JOptionPane.showMessageDialog(this, "Debe crear mínimo dos jugadores!", "ERROR", JOptionPane.ERROR_MESSAGE);
                
            }
            }else{
//             jLblError.setVisible(true);
//            JOptionPane.showMessageDialog(null, "No deben escoger la misma categoria");
            jCboCategoriasJugador1.setEnabled(true);
            jCboCategoriasJugador2.setEnabled(true);
            jBtnCreaJugador1.setEnabled(true);
            jBtnCreaJugador2.setEnabled(true);      
            jTxtJugador1.requestFocus();
            
        }            
       
        
    }//GEN-LAST:event_jBtnJugarActionPerformed

    private void jCboCategoriasJugador1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCboCategoriasJugador1ActionPerformed
    
    }//GEN-LAST:event_jCboCategoriasJugador1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTxtJugador1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTxtJugador1KeyReleased
        
    }//GEN-LAST:event_jTxtJugador1KeyReleased

    private void jTxtJugador1ComponentRemoved(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_jTxtJugador1ComponentRemoved
        
    }//GEN-LAST:event_jTxtJugador1ComponentRemoved

    private void jTxtJugador1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTxtJugador1MouseClicked
        jTxtJugador1.selectAll();
    }//GEN-LAST:event_jTxtJugador1MouseClicked

    private void jTxtJugador2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTxtJugador2MouseClicked
        jTxtJugador2.selectAll();
    }//GEN-LAST:event_jTxtJugador2MouseClicked

    private void jTxtJugador2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtJugador2ActionPerformed
        jCboCategoriasJugador2.requestFocus();
    }//GEN-LAST:event_jTxtJugador2ActionPerformed

    public static int getCategoria1() {
        return categoria1;
    }

    public static int getCategoria2() {
        return categoria2;
    }

    public static String getNombre1() {
        return nombre1;
    }

    public static String getNombre2() {
        return nombre2;
    }

    public static int getPuntaje() {
        return puntaje;
    }

    public int getNum() {
        return num;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel P1;
    private javax.swing.JLabel P2;
    private javax.swing.JButton jBtnCreaJugador1;
    private javax.swing.JButton jBtnCreaJugador2;
    private javax.swing.JButton jBtnEstadisticas;
    private javax.swing.JButton jBtnJugar;
    private javax.swing.JButton jBtnReglas;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<Enum_Categorias> jCboCategoriasJugador1;
    private javax.swing.JComboBox<Enum_Categorias> jCboCategoriasJugador2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLblCatPlayer1;
    private javax.swing.JLabel jLblCatPlayer2;
    private javax.swing.JLabel jLblError;
    private javax.swing.JLabel jLblLocked;
    private javax.swing.JLabel jLblLocked1;
    private javax.swing.JLabel jLblPlayer1;
    private javax.swing.JLabel jLblPlayer2;
    private javax.swing.JLabel jLblUnloked;
    private javax.swing.JLabel jLblUnloked1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTextField jTxtJugador1;
    private javax.swing.JTextField jTxtJugador2;
    // End of variables declaration//GEN-END:variables

}
