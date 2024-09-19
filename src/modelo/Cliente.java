package modelo;
/**
 *
 * @author AguidoRin
 */
public class Cliente {
    private String dni;
    private String nombres;
    private String tp_tarjeta;
    private double monto;
    private double montof;
    private double descuento;
    
    public Cliente(){}
    public Object[] Registro(int num){
        Object[] fila ={dni,nombres,tp_tarjeta,monto,montof,descuento};
        return fila;
    }
    
    public void Descuento(){
        switch (tp_tarjeta) {
            case "Clásica":
                descuento = monto*0.4;
                montof = monto-descuento;
                break;
            case "Visa":
                descuento = monto*0.94;
                montof = monto-descuento;
                break;
            case "Premium":
                descuento = monto*0.92;
                montof = monto-descuento;
                break;
        }
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getTp_tarjeta() {
        return tp_tarjeta;
    }

    public void setTp_tarjeta(String tp_tarjeta) {
        this.tp_tarjeta = tp_tarjeta;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }
}