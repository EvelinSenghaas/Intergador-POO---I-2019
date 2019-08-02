
package modulo;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

@Entity
public class ServicioRealizado {
    @Id
    @SequenceGenerator (name = "idEstado", initialValue = 1, allocationSize=1)
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "idEstado")
    private int idEstado;
    private String descripcion;
    private Double costo;
    private String puntaje;
    
    @ManyToOne
    private Productor productor;
    
    @ManyToOne
    private Prestador prestador;
    
    @OneToOne(mappedBy = "serviRealizado")
    private Servicio servicio;
   
    public ServicioRealizado(){
    
    }

    public ServicioRealizado(String descripcion, String puntaje, Servicio servicio, double costo) {
        this.descripcion = descripcion;
        this.puntaje = puntaje;
        this.productor = servicio.getProductor();
        this.prestador= servicio.getServicioOfrecido().getPrestador();
        this.servicio = servicio;
        this.costo=costo;
    }

    public Prestador getPrestador() {
        return prestador;
    }

    public void setPrestador(Prestador prestador) {
        this.prestador = prestador;
    }

  

    public Double getCosto() {
        return costo;
    }

    public void setCosto(Double costo) {
        this.costo = costo;
    }
    

    public int getIdEstado() {
        return idEstado;
    }

    public void setIdEstado(int idEstado) {
        this.idEstado = idEstado;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(String puntaje) {
        this.puntaje = puntaje;
    }

    public Productor getProductor() {
        return productor;
    }

    public void setProductor(Productor productor) {
        this.productor = productor;
    }

    public Servicio getServicio() {
        return servicio;
    }

    public void setServicio(Servicio servicio) {
        this.servicio = servicio;
    }
    
    @Override
    public String toString(){
        return this.servicio+" Costo: "+this.costo;
    }
    
}
