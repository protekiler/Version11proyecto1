package org.example.Vista;

import java.awt.HeadlessException;

import javax.swing.JFrame;

public class ventanaBase extends JFrame{
    private javax.swing.JLabel EspacioInstrucciones;
    private javax.swing.JLabel EspacioInstrucciones2;
    private javax.swing.JLabel EspacioInstrucciones3;
    private javax.swing.JLabel EspacioInstrucciones4;
    private javax.swing.JTable TblPersona;
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnCargar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblApellido;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblHora;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNombre;
    public ventanaBase(String arg0) throws HeadlessException {
        btnRegresar = new javax.swing.JButton();
        lblId = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblApellido = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        lblFecha = new javax.swing.JLabel();
        lblHora = new javax.swing.JLabel();
        btnAgregar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TblPersona = new javax.swing.JTable();
        EspacioInstrucciones = new javax.swing.JLabel();
        EspacioInstrucciones2 = new javax.swing.JLabel();
        EspacioInstrucciones3 = new javax.swing.JLabel();
        EspacioInstrucciones4 = new javax.swing.JLabel();
        btnCargar = new javax.swing.JButton();
        btnRegresar.setText("regresar");
        

        lblId.setText("ID");

        lblNombre.setText("Nombre");

        lblApellido.setText("Apellido");

        lblFecha.setText("Fecha");

        lblHora.setText("Hora");

        btnAgregar.setText("Agregar");
        

        btnActualizar.setText("Actualizar");

        btnEliminar.setText("Eliminar Dato");
        

        TblPersona.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "id", "nombre", "apellido"
            }
        ));
        jScrollPane1.setViewportView(TblPersona);

        EspacioInstrucciones.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        EspacioInstrucciones.setText("Pasos para cambiar datos");

        EspacioInstrucciones2.setText("1-Seleccione en la tabla el dato a cambiar");

        EspacioInstrucciones3.setText("2-Ingrese los nuevos valores");

        EspacioInstrucciones4.setText("3-Precione el boton cambiar datos");

        btnCargar.setText("Cargar Tabla");


        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblFecha)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblHora)
                        .addGap(47, 47, 47))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnRegresar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCargar)
                        .addGap(26, 26, 26))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(156, 156, 156)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btnActualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(lblApellido)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtApellido))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(lblNombre))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(42, 42, 42)
                                    .addComponent(lblId)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 138, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 475, Short.MAX_VALUE)
                        .addGap(12, 12, 12))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(EspacioInstrucciones)
                            .addComponent(EspacioInstrucciones2))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(EspacioInstrucciones4)
                            .addComponent(EspacioInstrucciones3))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnRegresar)
                            .addComponent(btnCargar))
                        .addGap(21, 21, 21))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblFecha)
                                    .addComponent(lblHora))
                                .addGap(85, 85, 85)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblId)
                                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblNombre)
                                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblApellido)
                                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(58, 58, 58)
                                .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(EspacioInstrucciones)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(EspacioInstrucciones2)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(EspacioInstrucciones3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(EspacioInstrucciones4)
                        .addGap(52, 52, 52))))
        );

        pack();
        this.setVisible(false);
    }


    public javax.swing.JLabel getEspacioInstrucciones() {
        return EspacioInstrucciones;
    }
    public void setEspacioInstrucciones(javax.swing.JLabel espacioInstrucciones) {
        EspacioInstrucciones = espacioInstrucciones;
    }
    public javax.swing.JLabel getEspacioInstrucciones2() {
        return EspacioInstrucciones2;
    }
    public void setEspacioInstrucciones2(javax.swing.JLabel espacioInstrucciones2) {
        EspacioInstrucciones2 = espacioInstrucciones2;
    }
    public javax.swing.JLabel getEspacioInstrucciones3() {
        return EspacioInstrucciones3;
    }
    public void setEspacioInstrucciones3(javax.swing.JLabel espacioInstrucciones3) {
        EspacioInstrucciones3 = espacioInstrucciones3;
    }
    public javax.swing.JLabel getEspacioInstrucciones4() {
        return EspacioInstrucciones4;
    }
    public void setEspacioInstrucciones4(javax.swing.JLabel espacioInstrucciones4) {
        EspacioInstrucciones4 = espacioInstrucciones4;
    }
    public javax.swing.JTable getTblPersona() {
        return TblPersona;
    }
    public void setTblPersona(javax.swing.JTable tblPersona) {
        TblPersona = tblPersona;
    }
    public javax.swing.JButton getBtnActualizar() {
        return btnActualizar;
    }
    public void setBtnActualizar(javax.swing.JButton btnActualizar) {
        this.btnActualizar = btnActualizar;
    }
    public javax.swing.JButton getBtnAgregar() {
        return btnAgregar;
    }
    public void setBtnAgregar(javax.swing.JButton btnAgregar) {
        this.btnAgregar = btnAgregar;
    }
    public javax.swing.JButton getBtnCargar() {
        return btnCargar;
    }
    public void setBtnCargar(javax.swing.JButton btnCargar) {
        this.btnCargar = btnCargar;
    }
    public javax.swing.JButton getBtnEliminar() {
        return btnEliminar;
    }
    public void setBtnEliminar(javax.swing.JButton btnEliminar) {
        this.btnEliminar = btnEliminar;
    }
    public javax.swing.JButton getBtnRegresar() {
        return btnRegresar;
    }
    public void setBtnRegresar(javax.swing.JButton btnRegresar) {
        this.btnRegresar = btnRegresar;
    }
    public javax.swing.JScrollPane getjScrollPane1() {
        return jScrollPane1;
    }
    public void setjScrollPane1(javax.swing.JScrollPane jScrollPane1) {
        this.jScrollPane1 = jScrollPane1;
    }
    public javax.swing.JLabel getLblApellido() {
        return lblApellido;
    }
    public void setLblApellido(javax.swing.JLabel lblApellido) {
        this.lblApellido = lblApellido;
    }
    public javax.swing.JLabel getLblFecha() {
        return lblFecha;
    }
    public void setLblFecha(javax.swing.JLabel lblFecha) {
        this.lblFecha = lblFecha;
    }
    public javax.swing.JLabel getLblHora() {
        return lblHora;
    }
    public void setLblHora(javax.swing.JLabel lblHora) {
        this.lblHora = lblHora;
    }
    public javax.swing.JLabel getLblId() {
        return lblId;
    }
    public void setLblId(javax.swing.JLabel lblId) {
        this.lblId = lblId;
    }
    public javax.swing.JLabel getLblNombre() {
        return lblNombre;
    }
    public void setLblNombre(javax.swing.JLabel lblNombre) {
        this.lblNombre = lblNombre;
    }
    public javax.swing.JTextField getTxtApellido() {
        return txtApellido;
    }
    public void setTxtApellido(javax.swing.JTextField txtApellido) {
        this.txtApellido = txtApellido;
    }
    public javax.swing.JTextField getTxtId() {
        return txtId;
    }
    public void setTxtId(javax.swing.JTextField txtId) {
        this.txtId = txtId;
    }
    public javax.swing.JTextField getTxtNombre() {
        return txtNombre;
    }
    public void setTxtNombre(javax.swing.JTextField txtNombre) {
        this.txtNombre = txtNombre;
    }
    
    
    
}
