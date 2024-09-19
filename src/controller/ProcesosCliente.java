package controller;
/**
 *
 * @author AguidoRin
 */
import modelo.Cliente;
import javax.swing.table.DefaultTableModel;
import modelo.ListaCliente;
import vista.FrmCliente;
public class ProcesosCliente {
    
   public static void Presentar(FrmCliente fc){
       fc.setTitle("Compras de clientes");
       fc.setVisible(true);
       fc.cbxTarjeta.removeAllItems();
       fc.cbxTarjeta.addItem("CLASICA");
       fc.cbxTarjeta.addItem("VISA");
       fc.cbxTarjeta.addItem("PREMIUM");
   }

   public static void Limpiar(FrmCliente fc){
       fc.txtDni.setText("");
       fc.txtNombre.setText("");
       fc.cbxTarjeta.setSelectedIndex(0);
       fc.txtDni.requestFocus();
   }
   public static Cliente LeerCliente(FrmCliente fc){
       Cliente cli = new Cliente();
       cli.setDni(fc.txtDni.getText());
       cli.setNombres(fc.txtNombre.getText());
       cli.setTp_tarjeta(fc.cbxTarjeta.getSelectedItem().toString());
       cli.Descuento();
       return cli;
   }
   public static void MostrarDatos(FrmCliente fc,ListaCliente lista){
       String titulos[] = {"Dni","Nombres","Tipo de Tarjeta","Monto de compra", "Descuento","Monto Final"};
       DefaultTableModel mt = new DefaultTableModel(null,titulos);
       fc.tblDatosCliente.setModel(mt);
       for(int i=0;i<lista.Cantidad();i++){
           mt.addRow(lista.Recuperar(i).Registro(i+1));
       }
   }
}//fin de la clase.