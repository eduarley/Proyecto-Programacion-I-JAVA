
package appproyectoeduardoarley;

import java.awt.Color;
import java.util.Locale;
import java.util.Stack;
import javax.swing.JOptionPane;

public class FrmJuego extends javax.swing.JFrame {

        private String nombre1=FrmInicioJuego.getNombre1();
        private String nombre2=FrmInicioJuego.getNombre2();
        private int categoria1=FrmInicioJuego.getCategoria1();
        private int categoria2=FrmInicioJuego.getCategoria2();
        private Juego juego1;
        private Jugador jugador1=new Jugador(nombre1);
        private Jugador jugador2=new Jugador(nombre2);
        private boolean turno;
        private int contador=1;
       
        
        
        
        
        
        
    public FrmJuego() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jGrp = new javax.swing.ButtonGroup();
        jLblPregunta = new javax.swing.JLabel();
        jRdb1 = new javax.swing.JRadioButton();
        jRdb2 = new javax.swing.JRadioButton();
        jRdb3 = new javax.swing.JRadioButton();
        jBtnVerificar = new javax.swing.JButton();
        jLblTurno = new javax.swing.JLabel();
        jLblNombreJugador = new javax.swing.JLabel();
        jLblCorrecto = new javax.swing.JLabel();
        jBtnOk = new javax.swing.JButton();
        jLblPuntaje = new javax.swing.JLabel();
        jLblNumeroPuntaje = new javax.swing.JLabel();
        jBtnSiguiente = new javax.swing.JButton();
        jLblNombreGanador = new javax.swing.JLabel();
        jLblGanador = new javax.swing.JLabel();
        jBtnSalir = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLblPregunta.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLblPregunta.setText("PREGUNTA");
        getContentPane().add(jLblPregunta, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, -1, -1));

        jRdb1.setBackground(new java.awt.Color(255, 255, 255));
        jGrp.add(jRdb1);
        jRdb1.setText("jRadioButton1");
        getContentPane().add(jRdb1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, -1, -1));

        jRdb2.setBackground(new java.awt.Color(255, 255, 255));
        jGrp.add(jRdb2);
        jRdb2.setText("jRadioButton2");
        getContentPane().add(jRdb2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 360, -1, -1));

        jRdb3.setBackground(new java.awt.Color(255, 255, 255));
        jGrp.add(jRdb3);
        jRdb3.setText("jRadioButton3");
        getContentPane().add(jRdb3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 400, -1, -1));

        jBtnVerificar.setBackground(new java.awt.Color(51, 153, 255));
        jBtnVerificar.setFont(new java.awt.Font("Decker", 1, 36)); // NOI18N
        jBtnVerificar.setForeground(new java.awt.Color(255, 255, 255));
        jBtnVerificar.setText("Verificar");
        jBtnVerificar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBtnVerificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnVerificarActionPerformed(evt);
            }
        });
        getContentPane().add(jBtnVerificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 300, 170, 60));

        jLblTurno.setFont(new java.awt.Font("Decker", 0, 36)); // NOI18N
        jLblTurno.setForeground(new java.awt.Color(255, 255, 255));
        jLblTurno.setText("TURNO DE:");
        getContentPane().add(jLblTurno, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jLblNombreJugador.setFont(new java.awt.Font("Decker", 1, 36)); // NOI18N
        jLblNombreJugador.setForeground(new java.awt.Color(255, 255, 255));
        jLblNombreJugador.setText("Nombre");
        getContentPane().add(jLblNombreJugador, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, -1, -1));

        jLblCorrecto.setFont(new java.awt.Font("Decker", 1, 36)); // NOI18N
        jLblCorrecto.setForeground(new java.awt.Color(255, 0, 0));
        jLblCorrecto.setText("correcto o no");
        getContentPane().add(jLblCorrecto, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 200, -1, -1));

        jBtnOk.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton ok1.png"))); // NOI18N
        jBtnOk.setBorderPainted(false);
        jBtnOk.setContentAreaFilled(false);
        jBtnOk.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBtnOk.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton ok2.png"))); // NOI18N
        jBtnOk.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton ok oscuro.png"))); // NOI18N
        jBtnOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnOkActionPerformed(evt);
            }
        });
        getContentPane().add(jBtnOk, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 210, 225, 99));

        jLblPuntaje.setFont(new java.awt.Font("Decker", 0, 36)); // NOI18N
        jLblPuntaje.setForeground(new java.awt.Color(255, 255, 255));
        jLblPuntaje.setText("PUNTAJE:");
        getContentPane().add(jLblPuntaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jLblNumeroPuntaje.setFont(new java.awt.Font("Decker", 1, 36)); // NOI18N
        jLblNumeroPuntaje.setForeground(new java.awt.Color(255, 255, 255));
        jLblNumeroPuntaje.setText("0");
        getContentPane().add(jLblNumeroPuntaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, -1, -1));

        jBtnSiguiente.setBackground(new java.awt.Color(51, 155, 255));
        jBtnSiguiente.setFont(new java.awt.Font("Decker", 0, 36)); // NOI18N
        jBtnSiguiente.setForeground(new java.awt.Color(255, 255, 255));
        jBtnSiguiente.setText("Siguiente");
        jBtnSiguiente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBtnSiguiente.setEnabled(false);
        jBtnSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnSiguienteActionPerformed(evt);
            }
        });
        getContentPane().add(jBtnSiguiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 420, 200, 60));

        jLblNombreGanador.setFont(new java.awt.Font("Decker", 1, 48)); // NOI18N
        jLblNombreGanador.setForeground(new java.awt.Color(51, 153, 255));
        jLblNombreGanador.setText("Ganador");
        getContentPane().add(jLblNombreGanador, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 260, -1, -1));

        jLblGanador.setFont(new java.awt.Font("Decker", 1, 48)); // NOI18N
        jLblGanador.setForeground(new java.awt.Color(51, 153, 255));
        jLblGanador.setText("Ganador:");
        getContentPane().add(jLblGanador, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 100, -1, -1));

        jBtnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cerrar2.png"))); // NOI18N
        jBtnSalir.setBorderPainted(false);
        jBtnSalir.setContentAreaFilled(false);
        jBtnSalir.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cerrar3.png"))); // NOI18N
        jBtnSalir.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cerrar1.png"))); // NOI18N
        jBtnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(jBtnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 10, -1, -1));

        jButton1.setBackground(new java.awt.Color(174, 165, 145));
        jButton1.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        jButton1.setText("Regresar al menú");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 20, -1, -1));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondooooooo_1.png"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 510));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnOkActionPerformed
        //Se pone en visble los lbl
       // FrmInicioJuego.getNombre1();
       
       
       
       
       //Cambia las preguntas
       
       
       
       
       
       
       
       
       
       if(contador==1){
        jugador1=new Jugador(nombre1);
        jugador2=new Jugador(nombre2);
        juego1.introducirJugador(jugador1);
        juego1.introducirJugador(jugador2);
       }
       //Ir ingresando aqui los jugadores en el arreglo jugadores para comparar en estadisticas
       
       
       
       
       
        jLblNumeroPuntaje.setVisible(true);
        jLblPuntaje.setVisible(true);
        jBtnVerificar.setVisible(true);
        //jTxtPregunta.setVisible(true);
        jLblPregunta.setLocale(null);
        jLblPregunta.setVisible(true);
        jRdb1.setVisible(true);
        jRdb2.setVisible(true);
        jRdb3.setVisible(true);
        jLblTurno.setVisible(false);
        jLblNombreJugador.setVisible(false);
        jBtnOk.setVisible(false);
        
        if(turno==true){
            juego1.setCategoria(categoria2);
            jLblNumeroPuntaje.setText(""+jugador2.getPuntaje());
            jLblPregunta.setText(juego1.obtenerPregunta());
            jRdb1.setText(juego1.obtenerRespuestas()[0]);
            jRdb2.setText(juego1.obtenerRespuestas()[1]);
            jRdb3.setText(juego1.obtenerRespuestas()[2]);
            jLblNombreJugador.setText(nombre2);
            jRdb1.setEnabled(true);
            jRdb2.setEnabled(true);
            jRdb3.setEnabled(true);
            jBtnSiguiente.setEnabled(false);
            jBtnSiguiente.setVisible(true);
            jBtnVerificar.setEnabled(true);
        }else{
            juego1.setCategoria(categoria1);
            jLblNumeroPuntaje.setText(""+jugador1.getPuntaje());
            jLblPregunta.setText(juego1.obtenerPregunta());
            jRdb1.setText(juego1.obtenerRespuestas()[0]);
            jRdb2.setText(juego1.obtenerRespuestas()[1]);
            jRdb3.setText(juego1.obtenerRespuestas()[2]);
            jLblNombreJugador.setText(nombre1);
            jRdb1.setEnabled(true);
            jRdb2.setEnabled(true);
            jRdb3.setEnabled(true);
            jBtnSiguiente.setEnabled(false);
            jBtnSiguiente.setVisible(true);
            jBtnVerificar.setEnabled(true);
        }
        
        
        
    }//GEN-LAST:event_jBtnOkActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        
        
        
        FrmInicioJuego.getNombre1();
        FrmInicioJuego.getNombre2();
        FrmInicioJuego.getCategoria1();
        FrmInicioJuego.getCategoria2();
        juego1=new  Juego();
        juego1.setCategoria(categoria1);
        //jTxtPregunta.setText(juego1.obtenerPregunta());
        jLblPregunta.setText(juego1.obtenerPregunta());
        jRdb1.setText(juego1.obtenerRespuestas()[0]);
        jRdb2.setText(juego1.obtenerRespuestas()[1]);
        jRdb3.setText(juego1.obtenerRespuestas()[2]);
        jLblNombreJugador.setText(nombre1);
        jugador1=new Jugador(nombre1);
        jugador2=new Jugador(nombre2);
        jLblNombreGanador.setVisible(false);
        jLblGanador.setVisible(false);
        jBtnSiguiente.setVisible(false);
        
        
        
        
        
        
        
        
        
        
        
        
        
        jLblCorrecto.setVisible(false);
        jLblNumeroPuntaje.setVisible(false);
        jLblPuntaje.setVisible(false);
        jBtnVerificar.setVisible(false);
        //jTxtPregunta.setVisible(false);
        jLblPregunta.setVisible(false);
        jRdb1.setVisible(false);
        jRdb2.setVisible(false);
        jRdb3.setVisible(false);
        
    }//GEN-LAST:event_formWindowOpened

    private void jBtnVerificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnVerificarActionPerformed
          
        int seleccion=(jRdb1.isSelected()?0:jRdb2.isSelected()?1:jRdb3.isSelected()?2:-1);
        
        
        if(seleccion==-1){
            return;
        }
        juego1.setRespuesta(seleccion);
        if(turno==false){
       if(juego1.comprobar()){
            jLblCorrecto.setText("correcto");
            jugador1.setPuntaje(10);
            jLblNumeroPuntaje.setText(""+jugador1.getPuntaje());
            
            turno=true;
            
            
        }else{
            
            jLblCorrecto.setText("Incorrecto");
            turno=true;
        }
        
        }else{
            if(juego1.comprobar()){
            jLblCorrecto.setText("correcto");
            jugador2.setPuntaje(10);
            jLblNumeroPuntaje.setText(""+jugador2.getPuntaje());
            
            
            turno=false;
            
            }else{
            jLblCorrecto.setText("Incorrecto");
            turno=false;
            }
            
        }
        
        if(juego1.comprobar()){
            jLblCorrecto.setForeground(Color.green);
        }else{
            jLblCorrecto.setForeground(Color.red);
        }
        
        
        
        
        
        
        jGrp.clearSelection();
        jRdb1.setEnabled(false);
        jRdb2.setEnabled(false);
        jRdb3.setEnabled(false);
        jBtnSiguiente.setEnabled(true);
        jBtnVerificar.setEnabled(false);
        jLblCorrecto.setLocale(null);
        jLblCorrecto.setVisible(true);
    }//GEN-LAST:event_jBtnVerificarActionPerformed

    private void jBtnSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnSiguienteActionPerformed
 // cambia la categoria       
        //crear contador que llegue a 10 para que termine ell juego,mostrar hacer metdodo ganador o empate
        
        
        contador++;
        
        if(contador<=10){
       if(turno==true){ 
       jLblNombreJugador.setText(nombre2);
       
       
       juego1.setCategoria(categoria2);
        jLblNumeroPuntaje.setText(""+jugador2.getPuntaje());
       jLblPregunta.setText(juego1.obtenerPregunta());
        jRdb1.setText(juego1.obtenerRespuestas()[0]);
        jRdb2.setText(juego1.obtenerRespuestas()[1]);
        jRdb3.setText(juego1.obtenerRespuestas()[2]);
       
       
       
       
       
       jBtnVerificar.setEnabled(true);
       jBtnSiguiente.setVisible(true);
       jLblTurno.setVisible(true);
       jLblNombreJugador.setVisible(true);
       jLblPuntaje.setVisible(false);
       jLblPregunta.setVisible(false);
       jLblNumeroPuntaje.setVisible(false);
       jLblCorrecto.setVisible(false);
       jBtnOk.setVisible(true);
       jBtnSiguiente.setVisible(false);
       jBtnVerificar.setVisible(false);
       jRdb1.setVisible(false);
       jRdb2.setVisible(false);
       jRdb3.setVisible(false);
       
       
       jRdb1.setEnabled(true);
       jRdb2.setEnabled(true);
       jRdb3.setEnabled(true);
       
       
       }else{
       jLblNombreJugador.setText(nombre1);
       
       
       
       juego1.setCategoria(categoria1);
       jLblPregunta.setText(juego1.obtenerPregunta());
        jRdb1.setText(juego1.obtenerRespuestas()[0]);
        jRdb2.setText(juego1.obtenerRespuestas()[1]);
        jRdb3.setText(juego1.obtenerRespuestas()[2]);
       
       
        
       jBtnVerificar.setEnabled(true);
       jBtnSiguiente.setVisible(true);
       jLblTurno.setVisible(true);
       jLblNombreJugador.setVisible(true);
       jLblPuntaje.setVisible(false);
       jLblPregunta.setVisible(false);
       jLblNumeroPuntaje.setVisible(false);
       jLblCorrecto.setVisible(false);
       jBtnOk.setVisible(true);
       jBtnSiguiente.setVisible(false);
       jBtnVerificar.setVisible(false);
       jRdb1.setVisible(false);
       jRdb2.setVisible(false);
       jRdb3.setVisible(false);
       
       
       
       
       jRdb1.setEnabled(true);
       jRdb2.setEnabled(true);
       jRdb3.setEnabled(true);
       } 
         
        }else{
            contador=0;
            jLblTurno.setVisible(false);
            jLblNombreJugador.setVisible(false);   
            jBtnOk.setVisible(false);
            
            
            if(juego1.ganador(jugador1, jugador2).equalsIgnoreCase("Hubo un empate")){
                jLblNombreGanador.setText(juego1.ganador(jugador1,jugador2));
                jLblGanador.setVisible(false);
                jLblNombreGanador.setVisible(true);            
            jLblCorrecto.setVisible(false);
            jLblNombreJugador.setVisible(false);
            jLblNumeroPuntaje.setVisible(false);
            jLblPregunta.setVisible(false);
            jLblPuntaje.setVisible(false);
            jLblTurno.setVisible(false);
            jBtnOk.setVisible(false);
            jBtnSiguiente.setVisible(false);
            jBtnVerificar.setVisible(false);
            jRdb1.setVisible(false);
            jRdb2.setVisible(false);
            jRdb3.setVisible(false);
            }else{
//jLblEstadisticas.setText(juego1.estadisticas());
                jLblNombreGanador.setText(juego1.ganador(jugador1,jugador2));
                jLblGanador.setVisible(true);
            jLblNombreGanador.setVisible(true);            
            jLblCorrecto.setVisible(false);
            jLblNombreJugador.setVisible(false);
            jLblNumeroPuntaje.setVisible(false);
            jLblPregunta.setVisible(false);
            jLblPuntaje.setVisible(false);
            jLblTurno.setVisible(false);
            jBtnOk.setVisible(false);
            jBtnSiguiente.setVisible(false);
            jBtnVerificar.setVisible(false);
            jRdb1.setVisible(false);
            jRdb2.setVisible(false);
            jRdb3.setVisible(false);
            }
            
            
            
            
            
            
            
            
            
            
        } 
        
        
        
        
        
    }//GEN-LAST:event_jBtnSiguienteActionPerformed

    private void jBtnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnSalirActionPerformed
        int opcion=JOptionPane.showConfirmDialog(this, "Seguro que desea salir?");
        if(opcion==0){

            jLblCorrecto.setVisible(true);
            JOptionPane.showMessageDialog(this, juego1.ganador(jugador1, jugador2).equalsIgnoreCase("Hubo un empate")?"Hubo un empate":"El ganador es: "+juego1.ganador(jugador1, jugador2));
            System.exit(0);

        }
    }//GEN-LAST:event_jBtnSalirActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        FrmInicioJuego frmInicioJuego=new FrmInicioJuego();
        frmInicioJuego.setVisible(true);
        frmInicioJuego.setLocationRelativeTo(this);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel fondo;
    private javax.swing.JButton jBtnOk;
    private javax.swing.JButton jBtnSalir;
    private javax.swing.JButton jBtnSiguiente;
    private javax.swing.JButton jBtnVerificar;
    private javax.swing.JButton jButton1;
    private javax.swing.ButtonGroup jGrp;
    private javax.swing.JLabel jLblCorrecto;
    private javax.swing.JLabel jLblGanador;
    private javax.swing.JLabel jLblNombreGanador;
    private javax.swing.JLabel jLblNombreJugador;
    private javax.swing.JLabel jLblNumeroPuntaje;
    private javax.swing.JLabel jLblPregunta;
    private javax.swing.JLabel jLblPuntaje;
    private javax.swing.JLabel jLblTurno;
    private javax.swing.JRadioButton jRdb1;
    private javax.swing.JRadioButton jRdb2;
    private javax.swing.JRadioButton jRdb3;
    // End of variables declaration//GEN-END:variables
}
//hacer contador de el boton sigiente hasta 10 para que cuando llegue a 10 termine y se va al menu
//hacer label puntuaciones que se sume en el boton siguiente 
//hacer en la clase juego un atributo r3espuesta la cual se modifica en el frame para el metodo verificar
//