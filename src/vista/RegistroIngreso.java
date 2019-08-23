/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.ControladorRegistroIngreso;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.conexion.RegistroIngresoCAD;

/**
 *
 * @author alexandragonzalez
 */
public class RegistroIngreso extends javax.swing.JFrame {
    
       ControladorRegistroIngreso controladorRegistroIngreso;


    /**
     * Creates new form principal
     */
       
       // Constructor RegistroIngreso
    public RegistroIngreso() {
        initComponents();
        controladorRegistroIngreso = new ControladorRegistroIngreso();
        addRowToJTable();   // El constructor llama al metodo  
    }

    RegistroIngreso(String string) {

    }
    
    public void addRowToJTable()
    {
        List<modelo.RegistroIngreso> listar = controladorRegistroIngreso.listar();
        
        DefaultTableModel model = (DefaultTableModel) tablaRegistros.getModel();
        
        int rowCount = model.getRowCount();
        //Remove rows one by one from the end of the table
        for (int i = rowCount - 1; i >= 0; i--) {
            model.removeRow(i);
        }
        
        
        Object rowData[] = new Object[11];
        for(int i = 0; i < listar.size(); i++)
        {
            rowData[0] = listar.get(i).getNombre();
            rowData[1] = listar.get(i).getApellido();
            rowData[2] = listar.get(i).getEdad();
            rowData[3] = listar.get(i).getSexo();
            rowData[4] = listar.get(i).getNombreCurso();
            rowData[5] = listar.get(i).getNombreInstructor();
            rowData[6] = listar.get(i).getHoraEntrada();
            rowData[7] = listar.get(i).getHoraLlegada();
            rowData[8] = listar.get(i).getHoraSalida();
            rowData[9] = listar.get(i).getFecha();
            rowData[10] = listar.get(i).getObservaciones();


            model.addRow(rowData);
        }
                
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
        Jusuario = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        cbInstructor = new javax.swing.JComboBox<>();
        cbCurso = new javax.swing.JComboBox<>();
        btnGuardar = new javax.swing.JButton();
        btnConsultar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaRegistros = new javax.swing.JTable();
        btnEditar = new javax.swing.JButton();
        cbSexo = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        txtEdad = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtEntrada = new javax.swing.JTextField();
        txtLlegada = new javax.swing.JTextField();
        txtSalida = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtObservaciones = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        txtFecha = new javax.swing.JFormattedTextField();
        jLabel9 = new javax.swing.JLabel();
        btnAtras = new javax.swing.JButton();

        Jusuario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Usuario", "Nombre", "Clave"
            }
        ));
        jScrollPane1.setViewportView(Jusuario);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("Nombre");
        jLabel1.setName("nombre"); // NOI18N

        jLabel2.setText("Apellido");

        txtNombre.setToolTipText("");
        txtNombre.setName("txtNombre"); // NOI18N
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });

        txtApellido.setName("txtapellido"); // NOI18N
        txtApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidoActionPerformed(evt);
            }
        });

        cbInstructor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Instructor", "Christian", "Adalberto", "Eder" }));
        cbInstructor.setToolTipText("");
        cbInstructor.setName("select_instructor"); // NOI18N
        cbInstructor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbInstructorActionPerformed(evt);
            }
        });

        cbCurso.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Curso", "Java", "Bases D", ".Net" }));
        cbCurso.setName("select_curso"); // NOI18N

        btnGuardar.setText("Guardar");
        btnGuardar.setName("btn_guardar"); // NOI18N
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnConsultar.setText("Consultar");
        btnConsultar.setName("btn_consultar"); // NOI18N
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.setName("btn_eliminar"); // NOI18N
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        tablaRegistros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Nombre", "Apellido", "Edad", "Sexo", "Curso", "Instructor", "Hora Entrada", "Hora Llegada", "Hora Salida", "Fecha", "Observaciones"
            }
        ));
        tablaRegistros.setName("cajatexto"); // NOI18N
        jScrollPane2.setViewportView(tablaRegistros);

        btnEditar.setText("Editar");
        btnEditar.setName("btn_editar"); // NOI18N
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        cbSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sexo", "Fem", "Mas" }));
        cbSexo.setName("select_sexo"); // NOI18N
        cbSexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbSexoActionPerformed(evt);
            }
        });

        jLabel5.setText("Edad");

        txtEdad.setName("numedad"); // NOI18N

        jLabel3.setText("Hora Entrada");

        jLabel4.setText("Hora Llegada");

        jLabel6.setText("Hora Salida");

        txtLlegada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLlegadaActionPerformed(evt);
            }
        });

        jLabel7.setText("Observaciones");

        txtObservaciones.setColumns(20);
        txtObservaciones.setRows(5);
        jScrollPane3.setViewportView(txtObservaciones);

        jLabel8.setText("Fecha");

        jLabel9.setFont(new java.awt.Font("Oriya Sangam MN", 1, 14)); // NOI18N
        jLabel9.setText("Registro Aprendices");

        btnAtras.setBackground(new java.awt.Color(0, 0, 0));

        btnAtras.setForeground(new java.awt.Color(255, 255, 255));

        btnAtras.setText("Atras");
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel1)
                                            .addComponent(jLabel5))
                                        .addGap(20, 20, 20)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(123, 123, 123))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(txtNombre)
                                                .addGap(36, 36, 36))))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(35, 35, 35))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(btnGuardar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnConsultar)
                                        .addGap(62, 62, 62)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(cbInstructor, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(cbCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(cbSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(12, 12, 12)
                                                .addComponent(btnEliminar)))
                                        .addGap(43, 43, 43)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel3)
                                                .addGap(18, 18, 18)
                                                .addComponent(txtEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel4)
                                                .addGap(18, 18, 18)
                                                .addComponent(txtLlegada))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel6)
                                                .addGap(29, 29, 29)
                                                .addComponent(txtSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addComponent(btnEditar))))))
                            .addComponent(jLabel8))
                        .addGap(18, 62, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)))))
                .addGap(281, 281, 281))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel1)
                                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnGuardar)
                            .addComponent(btnConsultar)
                            .addComponent(btnEliminar)
                            .addComponent(btnEditar)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cbInstructor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3)
                                    .addComponent(txtEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(btnAtras)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cbCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4)
                                    .addComponent(txtLlegada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(txtSalida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 429, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        txtNombre.getAccessibleContext().setAccessibleName("txtnombre");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        //Guardar -- captura de datos
        String nombre = txtNombre.getText();
        String apellido = txtApellido.getText();
        String fecha = txtFecha.getText();

        
        if(nombre.isEmpty() || apellido.isEmpty() || fecha.isEmpty()){  // validacion de campos vacios
            JOptionPane.showMessageDialog(null, "Los campos de nombre, apellido y fecha deben estar llenos ");
            return;
        }
        
        
        String edad = txtEdad.getText();
        String horaEntrada = txtEntrada.getText();
        String horaLlegada = txtLlegada.getText();
        String horaSalida = txtSalida.getText();
        String observaciones = txtObservaciones.getText();
        String nombreInstructor = cbInstructor.getSelectedItem().toString();
        String sexo = cbSexo.getSelectedItem().toString();
        String nombreCurso = cbCurso.getSelectedItem().toString();
        
        System.out.println(nombre+":"+apellido+":"+edad+":"+horaEntrada+":"+horaLlegada+":"+horaSalida+":"+observaciones+":"+nombreInstructor+":"+sexo+":"+nombreCurso+":"+fecha);
        
        controladorRegistroIngreso.registrar(nombre,apellido,edad,horaEntrada,horaLlegada,horaSalida,observaciones,nombreInstructor,sexo,nombreCurso,fecha);
        
        addRowToJTable();
        
        limpiarCampos();
           
        
        

        // TODO add your handling code here:
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed

        String nombre = txtNombre.getText();
        String apellido = txtApellido.getText();
        String fecha = txtFecha.getText();
        
        modelo.RegistroIngreso respuesta = controladorRegistroIngreso.consultar(nombre,apellido,fecha);
        
        
        if(respuesta!=null){
            txtNombre.setText(respuesta.getNombre());
            txtEdad.setText(respuesta.getEdad());
            txtEntrada.setText(respuesta.getHoraEntrada());
            txtLlegada.setText(respuesta.getHoraLlegada());
            txtSalida.setText(respuesta.getHoraSalida());
            txtObservaciones.setText(respuesta.getObservaciones());
            cbInstructor.setSelectedItem(respuesta.getNombreInstructor());
            cbCurso.setSelectedItem(respuesta.getNombreCurso());
            cbSexo.setSelectedItem(respuesta.getSexo());
            txtFecha.setText(respuesta.getFecha());
                    
                    
                    
        }else{
            JOptionPane.showMessageDialog(null, "El usuario "+nombre+" no existe");
        }
        
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void txtApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellidoActionPerformed

    private void cbSexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbSexoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbSexoActionPerformed

    private void txtLlegadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLlegadaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLlegadaActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
              
        String nombre = txtNombre.getText();
        String apellido = txtApellido.getText();
        String nombreCurso = cbCurso.getSelectedItem().toString();
        String fecha = txtFecha.getText();
        
        controladorRegistroIngreso.eliminar(nombre,apellido,nombreCurso,fecha);

        
        addRowToJTable();

    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed

        String nombre = txtNombre.getText();
        String apellido = txtApellido.getText();
        String fecha = txtFecha.getText();

        
        if(nombre.isEmpty() || apellido.isEmpty() || fecha.isEmpty()){  // validacion de campos vacios
            JOptionPane.showMessageDialog(null, "Los campos de nombre, apellido y fecha deben estar llenos ");
            return;
        }
        
        
        String edad = txtEdad.getText();
        String horaEntrada = txtEntrada.getText();
        String horaLlegada = txtLlegada.getText();
        String horaSalida = txtSalida.getText();
        String observaciones = txtObservaciones.getText();
        String nombreInstructor = cbInstructor.getSelectedItem().toString();
        String sexo = cbSexo.getSelectedItem().toString();
        String nombreCurso = cbCurso.getSelectedItem().toString();
        
        System.out.println(nombre+":"+apellido+":"+edad+":"+horaEntrada+":"+horaLlegada+":"+horaSalida+":"+observaciones+":"+nombreInstructor+":"+sexo+":"+nombreCurso+":"+fecha);
        
        controladorRegistroIngreso.editar(nombre,apellido,edad,horaEntrada,horaLlegada,horaSalida,observaciones,nombreInstructor,sexo,nombreCurso,fecha);
        
        addRowToJTable();   
        
    }//GEN-LAST:event_btnEditarActionPerformed

    private void cbInstructorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbInstructorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbInstructorActionPerformed

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        Login l=new Login();
            l.setExtendedState(NORMAL);
            l.setVisible(true);
            this.dispose();

    }//GEN-LAST:event_btnAtrasActionPerformed

    /**
     * @param args the command line arguments
     */
    public RegistroIngreso(String args[]) {
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
            java.util.logging.Logger.getLogger(RegistroIngreso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistroIngreso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistroIngreso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistroIngreso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistroIngreso().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTable Jusuario;
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JComboBox<String> cbCurso;
    private javax.swing.JComboBox<String> cbInstructor;
    private javax.swing.JComboBox<String> cbSexo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    public javax.swing.JTable tablaRegistros;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtEntrada;
    private javax.swing.JFormattedTextField txtFecha;
    private javax.swing.JTextField txtLlegada;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextArea txtObservaciones;
    private javax.swing.JTextField txtSalida;
    // End of variables declaration//GEN-END:variables

    private void setRegistroIngreso(String trim) {


    }
    
    private void limpiarCampos(){
        txtNombre.setText("");
        txtApellido.setText("");
        txtEdad.setText("");
        txtEntrada.setText("");
        txtLlegada.setText("");
        txtSalida.setText("");
        txtObservaciones.setText("");
        cbInstructor.setSelectedItem("");
        cbCurso.setSelectedItem("Curso");
        cbSexo.setSelectedItem("");
        txtFecha.setText("");
                
    }

    void setEsconderBotones() {
           btnGuardar.setVisible(false);
           btnEliminar.setVisible(false);
           btnEditar.setVisible(false);


    }
}
