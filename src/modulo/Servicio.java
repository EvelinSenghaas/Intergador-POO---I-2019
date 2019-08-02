
package modulo;

import java.util.ArrayList;
import java.util.Date;
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
import javax.persistence.Temporal;


@Entity
public class Servicio {
    @Id
    @SequenceGenerator (name = "id_Servicio", initialValue = 1, allocationSize=1)
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "id_Servicio")
    private int idServicio;
    
    private String descripcion;
    
    
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fecha; //fecha de finalizacion

    @OneToOne
    private ServicioRealizado serviRealizado;
    
    @ManyToOne
    private ServicioOfrecido servicioOfrecido; 
    
    @OneToOne
    private ServicioCancelado serviCancelado;
    
    @ManyToOne
    private Productor productor;
    
    private boolean borrado;
    
    
    public Servicio(){
        this.borrado=false;

    }

    public Servicio(String descripcion, Date fecha, ServicioOfrecido servicioOfrecido, Productor productor) {
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.servicioOfrecido = servicioOfrecido;
        this.productor=productor;
        this.borrado=false;
        
    }

    public Productor getProductor() {
        return productor;
    }

    public boolean isBorrado() {
        return borrado;
    }

    public void setBorrado(boolean borrado) {
        this.borrado = borrado;
    }
    

    public void setProductor(Productor productor) {
        this.productor = productor;
    }

    public ServicioCancelado getServiCancelado() {
        return serviCancelado;
    }

    public void setServiCancelado(ServicioCancelado serviCancelado) {
        this.serviCancelado = serviCancelado;
    }

    public int getIdServicio() {
        return idServicio;
    }

    public void setIdServicio(int idServicio) {
        this.idServicio = idServicio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public ServicioOfrecido getServicioOfrecido() {
        return servicioOfrecido;
    }

    public void setServicioOfrecido(ServicioOfrecido servicioOfrecido) {
        this.servicioOfrecido = servicioOfrecido;
    }

  

    public ServicioRealizado getServiRealizado() {
        return serviRealizado;
    }

    public void setServiRealizado(ServicioRealizado serviRealizado) {
        this.serviRealizado = serviRealizado;
    }

    @Override
    public String toString(){
        return this.servicioOfrecido.toString()+"prestador"+this.servicioOfrecido.getPrestador();
    }
    
}
