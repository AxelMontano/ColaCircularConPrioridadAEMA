package colaconprioridadcircularaema;

import javax.swing.JOptionPane;

public class VentanaCircular extends javax.swing.JFrame {
    
    ColaCircular circuloOBJ;
    Prioridad prioridadOBJ;

//Inicio    
    public VentanaCircular() {
        initComponents();
        String tamano =JOptionPane.showInputDialog("ESCRIBA EL TAMAÑO DEL VECTOR: ");
        circuloOBJ = new ColaCircular(Integer.parseInt(tamano));
        this.setLocationRelativeTo(null);
        jLabel2.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        cmbPrioridad = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton2.setText("ELIMINAR");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setText("VALOR:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 0, 0));
        jLabel2.setText("jLabel2");

        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jButton1.setText("INSERTAR");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        jTextPane1.setEnabled(false);
        jScrollPane2.setViewportView(jTextPane1);

        cmbPrioridad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "1", "2", "3" }));
        cmbPrioridad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbPrioridadActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setText("Prioridad:");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel4.setText("Cola Circular Con Prioridad");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(101, 101, 101))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addGap(258, 258, 258)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel1))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(cmbPrioridad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 432, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(jLabel2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbPrioridad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

//Boton Eliminar
    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked

        boolean eliminar = circuloOBJ.eliminar();
        String mensaje ="ERROR, COLA VACIA!";

        if(eliminar) mensaje="SE ELIMINO VALOR!";
        jLabel2.setText(mensaje);
        mostrarCola();
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
          //Puesto por error, no hace nada xD
    }//GEN-LAST:event_jButton2ActionPerformed

//Boton Insertar
    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked

        char dato = jTextField1.getText().charAt(0);
        int nivel = cmbPrioridad.getSelectedIndex();

        prioridadOBJ = new Prioridad(dato, nivel);
        boolean respuesta = circuloOBJ.insertar(prioridadOBJ);
        String mensaje="ERROR, COLA LLENA!";

        if(respuesta) mensaje = "SE CAPTURO VALOR: "+dato;
        jLabel2.setText(mensaje);
        jTextField1.setText("");
        mostrarCola();
    }//GEN-LAST:event_jButton1MouseClicked

    private void cmbPrioridadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbPrioridadActionPerformed
        // Puesto por error, no hace nada xD
    }//GEN-LAST:event_cmbPrioridadActionPerformed
    
//Funcion mostrarCola
    private void mostrarCola(){
        setTitle("VALORES DE INI: "+ circuloOBJ.getIni()+ " FIN: "+ circuloOBJ.getFin());
        if(circuloOBJ.ini==-1){
            jTextPane1.setText("COLA VACIA!!!");
            return;
        }
        
        String cad = "";
        
//Inicio del normal    
        if(circuloOBJ.estaColaVacia()){
                jTextPane1.setText("COLA VACIA!!!");
            }else{
                if(circuloOBJ.getIni()<=circuloOBJ.getFin()){
                    for(int i=circuloOBJ.getIni(); i<=circuloOBJ.getFin(); i++){
                        cad = "["+i+"] = "+circuloOBJ.getVector(i).getDato()+"\n" + cad;
                    }
                    jTextPane1.setText(cad);
                }else{

//Inicio del Circular
                    for(int i=0; i<=circuloOBJ.getFin(); i++){
                        cad = "["+i+"] = "+circuloOBJ.getVector(i).getDato()+"\n" + cad;
                    }
                    jTextPane1.setText(cad);

                    for(int i=circuloOBJ.getIni(); i<circuloOBJ.getTam(); i++){
                        cad = "["+i+"] = "+circuloOBJ.getVector(i).getDato()+"\n" + cad;
                    }
                    jTextPane1.setText(cad);
  
            }   
        }
    }
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(VentanaCircular.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaCircular.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaCircular.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaCircular.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaCircular().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmbPrioridad;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextPane jTextPane1;
    // End of variables declaration//GEN-END:variables
}
