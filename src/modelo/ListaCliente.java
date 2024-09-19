package modelo;
import java.io.Serializable;
import java.util.ArrayList;
/**
 *
 * @author AguidoRin
 */
public class ListaCliente implements Serializable{
    private ArrayList<Cliente> lista;
    
    public ListaCliente(){
        lista=new ArrayList();
    }
    
    public void Agregar(Cliente cl){
        lista.add(cl);
    }
    
    public void Eliminar(int pos){
        lista.remove(pos);
    }
    
    public Cliente Recuperar(int pos){
        return lista.get(pos);
    }
    
    public void Actualizar(Cliente cl,int pos){
        lista.set(pos, cl);
    }
    
    public int Cantidad(){
        return lista.size();
    }
    
    public int Buscar(String dni){
        for(int i=0;i<lista.size();i++){
            if(dni.equals(lista.get(i).getDni()))
                return i;
        }
        return -1;
    }
    public ArrayList<Cliente> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Cliente> lista) {
        this.lista = lista;
    }
}//fin de la clase