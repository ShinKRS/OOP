package inheritance;
        
import java.util.Date;

public class Cliente extends Person {
    private int idCliente;   
    private Date fechaRegistro;
    private boolean vip;
    private static int contadorClientes;
    
    public Cliente(Date fechaRegistro, boolean vip, String nombre, char genero, int edad, String Direccion){
        
        super(nombre, genero, edad, Direccion);
         this.idCliente = ++Cliente.contadorClientes;
        this.fechaRegistro = fechaRegistro;
        this.vip = vip;
    }  
    
    @Override
    public String obtenerDetalles(){
        return super.obtenerDetalles() + " \tEs VIP: " + this.vip;
        
        
        
}

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public boolean isVip() {
        return vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cliente{");
        sb.append("idCliente=").append(idCliente);
        sb.append(", fechaRegistro=").append(fechaRegistro);
        sb.append(", vip=").append(vip);
        sb.append('}');
        return sb.toString();
    }

}
