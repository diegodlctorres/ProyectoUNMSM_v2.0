package Vista.ColaboradorViews;

public class FrmColaboradorView extends javax.swing.JFrame {

    public FrmColaboradorView() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        panelEscritorio = new javax.swing.JDesktopPane();
        menuPrincipal = new javax.swing.JMenuBar();
        menuConsultas = new javax.swing.JMenu();
        itConsultaProductos = new javax.swing.JMenuItem();
        itConsultaClientes = new javax.swing.JMenuItem();
        menuMantenimientos = new javax.swing.JMenu();
        itMantenimientoProductos = new javax.swing.JMenuItem();
        itMantenimientoClientes = new javax.swing.JMenuItem();
        itMantenimientoColaboradores = new javax.swing.JMenuItem();
        menuSalir = new javax.swing.JMenu();
        itCerrarSesion = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Lagarto Store - Colaboradores");
        setSize(new java.awt.Dimension(700, 575));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(600, 550));
        jPanel1.setMinimumSize(new java.awt.Dimension(600, 550));
        jPanel1.setPreferredSize(new java.awt.Dimension(600, 550));

        panelEscritorio.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout panelEscritorioLayout = new javax.swing.GroupLayout(panelEscritorio);
        panelEscritorio.setLayout(panelEscritorioLayout);
        panelEscritorioLayout.setHorizontalGroup(
            panelEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
        );
        panelEscritorioLayout.setVerticalGroup(
            panelEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 550, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelEscritorio)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelEscritorio)
        );

        menuPrincipal.setBackground(new java.awt.Color(204, 204, 204));
        menuPrincipal.setBorder(null);
        menuPrincipal.setForeground(new java.awt.Color(51, 51, 51));
        menuPrincipal.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        menuPrincipal.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        menuPrincipal.setPreferredSize(new java.awt.Dimension(71, 25));

        menuConsultas.setBackground(new java.awt.Color(3, 137, 57));
        menuConsultas.setBorder(null);
        menuConsultas.setForeground(new java.awt.Color(51, 51, 51));
        menuConsultas.setText("Consultas");
        menuConsultas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuConsultas.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        itConsultaProductos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        itConsultaProductos.setBackground(new java.awt.Color(204, 204, 204));
        itConsultaProductos.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        itConsultaProductos.setForeground(new java.awt.Color(51, 51, 51));
        itConsultaProductos.setText("Consultar productos");
        itConsultaProductos.setBorder(null);
        itConsultaProductos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        itConsultaProductos.setPreferredSize(new java.awt.Dimension(193, 25));
        itConsultaProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itConsultaProductosActionPerformed(evt);
            }
        });
        menuConsultas.add(itConsultaProductos);

        itConsultaClientes.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        itConsultaClientes.setBackground(new java.awt.Color(204, 204, 204));
        itConsultaClientes.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        itConsultaClientes.setForeground(new java.awt.Color(51, 51, 51));
        itConsultaClientes.setText("Consultar clientes");
        itConsultaClientes.setBorder(null);
        itConsultaClientes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        itConsultaClientes.setPreferredSize(new java.awt.Dimension(193, 25));
        itConsultaClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itConsultaClientesActionPerformed(evt);
            }
        });
        menuConsultas.add(itConsultaClientes);

        menuPrincipal.add(menuConsultas);

        menuMantenimientos.setBackground(new java.awt.Color(3, 137, 57));
        menuMantenimientos.setBorder(null);
        menuMantenimientos.setForeground(new java.awt.Color(51, 51, 51));
        menuMantenimientos.setText("Mantenimientos");
        menuMantenimientos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuMantenimientos.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        itMantenimientoProductos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itMantenimientoProductos.setBackground(new java.awt.Color(204, 204, 204));
        itMantenimientoProductos.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        itMantenimientoProductos.setForeground(new java.awt.Color(51, 51, 51));
        itMantenimientoProductos.setText("Mantenimiento de productos");
        itMantenimientoProductos.setBorder(null);
        itMantenimientoProductos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        itMantenimientoProductos.setPreferredSize(new java.awt.Dimension(250, 25));
        itMantenimientoProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itMantenimientoProductosActionPerformed(evt);
            }
        });
        menuMantenimientos.add(itMantenimientoProductos);

        itMantenimientoClientes.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itMantenimientoClientes.setBackground(new java.awt.Color(204, 204, 204));
        itMantenimientoClientes.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        itMantenimientoClientes.setForeground(new java.awt.Color(51, 51, 51));
        itMantenimientoClientes.setText("Mantenimiento de clientes");
        itMantenimientoClientes.setBorder(null);
        itMantenimientoClientes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        itMantenimientoClientes.setPreferredSize(new java.awt.Dimension(193, 25));
        itMantenimientoClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itMantenimientoClientesActionPerformed(evt);
            }
        });
        menuMantenimientos.add(itMantenimientoClientes);

        itMantenimientoColaboradores.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.SHIFT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itMantenimientoColaboradores.setBackground(new java.awt.Color(204, 204, 204));
        itMantenimientoColaboradores.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        itMantenimientoColaboradores.setForeground(new java.awt.Color(51, 51, 51));
        itMantenimientoColaboradores.setText("Mantenimiento de colaboradores");
        itMantenimientoColaboradores.setBorder(null);
        itMantenimientoColaboradores.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        itMantenimientoColaboradores.setPreferredSize(new java.awt.Dimension(193, 25));
        itMantenimientoColaboradores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itMantenimientoColaboradoresActionPerformed(evt);
            }
        });
        menuMantenimientos.add(itMantenimientoColaboradores);

        menuPrincipal.add(menuMantenimientos);

        menuSalir.setBackground(new java.awt.Color(3, 137, 57));
        menuSalir.setBorder(null);
        menuSalir.setForeground(new java.awt.Color(51, 51, 51));
        menuSalir.setText("Fin");
        menuSalir.setToolTipText("");
        menuSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuSalir.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        itCerrarSesion.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ESCAPE, 0));
        itCerrarSesion.setBackground(new java.awt.Color(204, 204, 204));
        itCerrarSesion.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        itCerrarSesion.setForeground(new java.awt.Color(51, 51, 51));
        itCerrarSesion.setText("Cerrar sesión");
        itCerrarSesion.setBorder(null);
        itCerrarSesion.setPreferredSize(new java.awt.Dimension(250, 25));
        itCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itCerrarSesionActionPerformed(evt);
            }
        });
        menuSalir.add(itCerrarSesion);

        menuPrincipal.add(menuSalir);

        setJMenuBar(menuPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void itConsultaProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itConsultaProductosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itConsultaProductosActionPerformed

    private void itConsultaClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itConsultaClientesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itConsultaClientesActionPerformed

    private void itMantenimientoProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itMantenimientoProductosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itMantenimientoProductosActionPerformed

    private void itMantenimientoClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itMantenimientoClientesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itMantenimientoClientesActionPerformed

    private void itCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itCerrarSesionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itCerrarSesionActionPerformed

    private void itMantenimientoColaboradoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itMantenimientoColaboradoresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itMantenimientoColaboradoresActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(FrmColaboradorView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmColaboradorView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmColaboradorView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmColaboradorView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmColaboradorView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JMenuItem itCerrarSesion;
    public javax.swing.JMenuItem itConsultaClientes;
    public javax.swing.JMenuItem itConsultaProductos;
    public javax.swing.JMenuItem itMantenimientoClientes;
    public javax.swing.JMenuItem itMantenimientoColaboradores;
    public javax.swing.JMenuItem itMantenimientoProductos;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JMenu menuConsultas;
    public javax.swing.JMenu menuMantenimientos;
    public javax.swing.JMenuBar menuPrincipal;
    public javax.swing.JMenu menuSalir;
    public javax.swing.JDesktopPane panelEscritorio;
    // End of variables declaration//GEN-END:variables
}
