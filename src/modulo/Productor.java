
package modulo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
@DiscriminatorValue("Productor")
public class Productor extends Persona{
    
    private int cantHectarea;
    
    @OneToMany(mappedBy = "productor")
    private List<ServicioCancelado> serviciosCancelados = new ArrayList<>();
    
    @OneToMany (mappedBy = "productor")
    private List<ServicioRealizado> serviciosRealizados = new ArrayList<>();
    
    @OneToMany(mappedBy = "productor")
    private List<Servicio> servicio = new ArrayList<>();
    
    private boolean borrado;
    
    public Productor() {
        super();
        this.borrado=false;
    }

    public Productor(long cuit, String razonSocial, int nroInscripcion, String domicilioLegal, String nombre, int cantHectarea) {
        super(cuit,razonSocial,nroInscripcion,domicilioLegal,nombre);
        this.cantHectarea=cantHectarea;
        this.borrado=false;
    }

    public boolean isBorrado() {
        return borrado;
    }

    public void setBorrado(boolean borrado) {
        this.borrado = borrado;
    }
    
    
    public int getCantHectarea() {
        return cantHectarea;
    }

    public void setCantHectarea(int cantHectarea) {
        this.cantHectarea = cantHectarea;
    }

    public List<ServicioCancelado> getServiciosCancelados() {
        return serviciosCancelados;
    }

    public void setServiciosCancelados(List<ServicioCancelado> serviciosCancelados) {
        this.serviciosCancelados = serviciosCancelados;
    }

    public List<ServicioRealizado> getServiciosRealizados() {
        return serviciosRealizados;
    }

    public void setServiciosRealizados(ServicioRealizado serviciosRealizados) {
        this.serviciosRealizados.add(serviciosRealizados);
    }

    public List<Servicio> getServicio() {
        List<Servicio> s =new ArrayList<>();
        for(int i =0;i<servicio.size();i++){
            if(!(servicio.get(i).isBorrado())){
                s.add(servicio.get(i));
            }
        }
        return s;
    }

    public void setServicio(Servicio servicio) {
        this.servicio.add(servicio);
    }
    
    @Override
    public String toString(){
        return super.getNombre();
    
    }
    

    
}
