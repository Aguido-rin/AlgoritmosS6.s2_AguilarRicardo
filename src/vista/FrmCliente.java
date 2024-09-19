package vista;
/**
 *
 * @author AguidoRin
 */
public class FrmCliente extends javax.swing.JFrame {

    /**
     * Creates new form FrmCliente
     */
    public FrmCliente() {
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
        jLabel1 = new javax.swing.JLabel();
        txtDni = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        cbxTarjeta = new javax.swing.JComboBox<>();
        txtMonto = new javax.swing.JTextField();
        bntAgregar = new javax.swing.JButton();
        bntBuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDatosCliente = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.black, null));
        jPanel1.setFont(new java.awt.Font("Britannic Bold", 0, 14)); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Clientes");
        jLabel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Bienvenido a", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Yu Gothic UI Semibold", 0, 12))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 8, 224, 50));

        txtDni.setBackground(new java.awt.Color(255, 255, 204));
        txtDni.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtDni.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "DNI", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Verdana", 1, 12))); // NOI18N
        txtDni.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPanel1.add(txtDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 64, 224, 50));

        txtNombre.setBackground(new java.awt.Color(255, 255, 204));
        txtNombre.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtNombre.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nombre", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Verdana", 1, 12))); // NOI18N
        txtNombre.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 120, 224, 50));

        cbxTarjeta.setBackground(new java.awt.Color(255, 255, 204));
        cbxTarjeta.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        cbxTarjeta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Clásica", "Visa", "Premium" }));
        cbxTarjeta.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tipo de Tarjeta", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Verdana", 1, 12))); // NOI18N
        cbxTarjeta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(cbxTarjeta, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 176, 224, 50));

        txtMonto.setBackground(new java.awt.Color(255, 255, 204));
        txtMonto.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtMonto.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Monto de Compra", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Verdana", 1, 12))); // NOI18N
        txtMonto.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPanel1.add(txtMonto, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 232, 224, 50));

        bntAgregar.setBackground(new java.awt.Color(255, 255, 51));
        bntAgregar.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        bntAgregar.setText("AGREGAR");
        bntAgregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(bntAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 374, 224, 35));

        bntBuscar.setBackground(new java.awt.Color(255, 255, 51));
        bntBuscar.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        bntBuscar.setText("BUSCAR");
        bntBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(bntBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 415, 224, 35));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 240, 500));

        tblDatosCliente.setBackground(new java.awt.Color(255, 255, 204));
        tblDatosCliente.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 0), null));
        tblDatosCliente.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        tblDatosCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "DNI", "Nombre", "Tipo de Tarjeta", "Monto de Compra", "Descuento", "Monto Final"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblDatosCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.WAIT_CURSOR));
        jScrollPane1.setViewportView(tblDatosCliente);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 0, 660, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton bntAgregar;
    public javax.swing.JButton bntBuscar;
    public javax.swing.JComboBox<String> cbxTarjeta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable tblDatosCliente;
    public javax.swing.JTextField txtDni;
    public javax.swing.JTextField txtMonto;
    public javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}