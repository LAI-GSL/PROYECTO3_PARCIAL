/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventana;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author familia
 */
public class Ventana1 extends javax.swing.JFrame {

    /**
     * Creates new form Ventana1
     */
    List<Cliente> lista = new ArrayList<>();
    public Ventana1() {
        initComponents();
        this.getContentPane().setBackground(Color.pink);
        mostrar();
        
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        TituloVentana = new javax.swing.JLabel();
        SubTitulo = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        Nombre = new javax.swing.JLabel();
        ID = new javax.swing.JLabel();
        Edad = new javax.swing.JLabel();
        Telefono = new javax.swing.JLabel();
        Correo = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        TextID = new javax.swing.JTextField();
        TextNombre = new javax.swing.JTextField();
        TextEdad = new javax.swing.JTextField();
        TextNum = new javax.swing.JTextField();
        TextCorreo = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();
        BtnGuardadDatos = new javax.swing.JButton();
        OtroRegistro = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        DATONOMBRE = new javax.swing.JTextField();
        ELIMINAR = new javax.swing.JButton();
        CONSULTAR = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 153, 153));

        TituloVentana.setBackground(new java.awt.Color(255, 223, 108));
        TituloVentana.setFont(new java.awt.Font("Leelawadee UI", 1, 36)); // NOI18N
        TituloVentana.setText("CARTERA DE CLIENTES");
        TituloVentana.setAutoscrolls(true);
        TituloVentana.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TituloVentanaKeyPressed(evt);
            }
        });

        SubTitulo.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        SubTitulo.setText("-Datos del cliente-");

        jPanel1.setBackground(new java.awt.Color(255, 153, 153));
        jPanel1.setForeground(new java.awt.Color(255, 153, 153));

        Nombre.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        Nombre.setText("Ingresa el nombre:");

        ID.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        ID.setText("Ingresa ID:");

        Edad.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        Edad.setText("Ingresa la edad:");

        Telefono.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        Telefono.setText("Ingresa el número telefonico:");

        Correo.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        Correo.setText("Ingresa el correo electronico:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ID)
                    .addComponent(Nombre)
                    .addComponent(Edad)
                    .addComponent(Telefono)
                    .addComponent(Correo))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ID)
                .addGap(28, 28, 28)
                .addComponent(Nombre)
                .addGap(30, 30, 30)
                .addComponent(Edad)
                .addGap(28, 28, 28)
                .addComponent(Telefono)
                .addGap(28, 28, 28)
                .addComponent(Correo)
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(255, 153, 153));
        jPanel2.setForeground(new java.awt.Color(255, 153, 153));

        TextID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextIDActionPerformed(evt);
            }
        });

        TextNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextNombreActionPerformed(evt);
            }
        });

        TextEdad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextEdadActionPerformed(evt);
            }
        });

        TextNum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextNumActionPerformed(evt);
            }
        });

        TextCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextCorreoActionPerformed(evt);
            }
        });

        Tabla.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Edad", "Correo", "Telefono"
            }
        ));
        Tabla.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane2.setViewportView(Tabla);

        BtnGuardadDatos.setBackground(new java.awt.Color(0, 0, 0));
        BtnGuardadDatos.setForeground(new java.awt.Color(255, 255, 255));
        BtnGuardadDatos.setText("Guardar");
        BtnGuardadDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnGuardadDatosActionPerformed(evt);
            }
        });

        OtroRegistro.setBackground(new java.awt.Color(0, 0, 0));
        OtroRegistro.setForeground(new java.awt.Color(255, 255, 255));
        OtroRegistro.setText("Registrar otro cliente");
        OtroRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OtroRegistroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TextID, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TextCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TextNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TextEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TextNum, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(BtnGuardadDatos)
                        .addGap(40, 40, 40)
                        .addComponent(OtroRegistro)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TextID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(TextNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(TextEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(TextNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TextCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnGuardadDatos)
                    .addComponent(OtroRegistro))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        jLabel1.setText("Ingrese el nombre del cliente que quiere buscar o eliminar:");

        DATONOMBRE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DATONOMBREActionPerformed(evt);
            }
        });

        ELIMINAR.setBackground(new java.awt.Color(0, 0, 0));
        ELIMINAR.setForeground(new java.awt.Color(255, 255, 255));
        ELIMINAR.setText("Eliminar");
        ELIMINAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ELIMINARActionPerformed(evt);
            }
        });

        CONSULTAR.setBackground(new java.awt.Color(0, 0, 0));
        CONSULTAR.setForeground(new java.awt.Color(255, 255, 255));
        CONSULTAR.setText("Consultar");
        CONSULTAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CONSULTARActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(DATONOMBRE, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(ELIMINAR, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CONSULTAR))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(SubTitulo)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(TituloVentana)
                .addGap(207, 207, 207))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(TituloVentana)
                .addGap(18, 18, 18)
                .addComponent(SubTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ELIMINAR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(DATONOMBRE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(CONSULTAR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TituloVentanaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TituloVentanaKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_TituloVentanaKeyPressed

    private void TextNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextNombreActionPerformed

    private void TextEdadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextEdadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextEdadActionPerformed

    private void TextNumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextNumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextNumActionPerformed

    private void TextCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextCorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextCorreoActionPerformed

    private void BtnGuardadDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnGuardadDatosActionPerformed
        // TODO add your handling code here:
        Cliente cliente = new Cliente (TextID.getText(), TextNombre.getText(), TextEdad.getText(), TextCorreo.getText(), TextNum.getText());
        lista.add(cliente);
        
        mostrar();

 
    }//GEN-LAST:event_BtnGuardadDatosActionPerformed

    public void mostrar(){
DefaultTableModel fila = new DefaultTableModel();

fila.addColumn("ID");
fila.addColumn("Nombre");
fila.addColumn("Edad");
fila.addColumn("Correo");
fila.addColumn("Telefono");

    for (Cliente d: lista) {
       Object [] horizontal=new Object[5];
       horizontal[0] = d.getID();
       horizontal[1] = d.getNombre();
       horizontal[2] = d.getEdad();
       horizontal[3] = d.getCorreo();
       horizontal[4] = d.getTelefono();
       fila.addRow(horizontal);
    }
    Tabla.setModel(fila);
}

    private void TextIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextIDActionPerformed

    private void DATONOMBREActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DATONOMBREActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DATONOMBREActionPerformed

    private void ELIMINARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ELIMINARActionPerformed
        for (Cliente d: lista) {
              if (d.getNombre().equals(DATONOMBRE.getText())){
                lista.remove(d);
                mostrar();
            }

        }
    }//GEN-LAST:event_ELIMINARActionPerformed

    private void CONSULTARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CONSULTARActionPerformed
        // TODO add your handling code here:
DefaultTableModel fila = new DefaultTableModel();

fila.addColumn("ID");
fila.addColumn("Nombre");
fila.addColumn("Edad");
fila.addColumn("Correo");
fila.addColumn("Telefono");

    for (Cliente d: lista) {
        if (d.getNombre().equals(DATONOMBRE.getText())) {
      Object [] horizontal=new Object[5];
       horizontal[0] = d.getID();
       horizontal[1] = d.getNombre();
       horizontal[2] = d.getEdad();
       horizontal[3] = d.getCorreo();
       horizontal[4] = d.getTelefono();
       fila.addRow(horizontal);
        }
       
    }
    Tabla.setModel(fila);
    }//GEN-LAST:event_CONSULTARActionPerformed

    private void OtroRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OtroRegistroActionPerformed
        // TODO add your handling code here:
//           Cliente datos = new Cliente();
//    datos.setID(ID.getText());
//    datos.setNombre(Nombre.getText());
//    datos.setEdad(Edad.getText());
//    datos.setCorreo(Correo.getText());
//    datos.setTelefono(Telefono.getText());
        TextID.setText("");
        TextNombre.setText("");
        TextEdad.setText("");
        TextCorreo.setText("");
        TextNum.setText("");
        mostrar();
    }//GEN-LAST:event_OtroRegistroActionPerformed

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
            java.util.logging.Logger.getLogger(Ventana1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnGuardadDatos;
    private javax.swing.JButton CONSULTAR;
    private javax.swing.JLabel Correo;
    private javax.swing.JTextField DATONOMBRE;
    private javax.swing.JButton ELIMINAR;
    private javax.swing.JLabel Edad;
    private javax.swing.JLabel ID;
    private javax.swing.JLabel Nombre;
    private javax.swing.JButton OtroRegistro;
    private javax.swing.JLabel SubTitulo;
    private javax.swing.JTable Tabla;
    private javax.swing.JLabel Telefono;
    private javax.swing.JTextField TextCorreo;
    private javax.swing.JTextField TextEdad;
    private javax.swing.JTextField TextID;
    private javax.swing.JTextField TextNombre;
    private javax.swing.JTextField TextNum;
    private javax.swing.JLabel TituloVentana;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
