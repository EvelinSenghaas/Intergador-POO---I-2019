
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
import javax.persistence.SequenceGenerator;

@Entity
public class ServicioOfrecido {
    @Id
    @SequenceGenerator (name = "idServicioOfrecido", initialValue = 1, allocationSize=1)
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "idServicioOfrecido")
    private int idServicioOfrecido;
    private double costoPorPrestador;
    
    @ManyToOne
    private Prestador prestador;
    
    @ManyToOne
    private TipoServicio tipoServicio;
    
    @OneToMany (mappedBy = "servicioOfrecido")
    private List<Servicio> servicio = new ArrayList<>();
    
     private boolean borrado;

    public ServicioOfrecido() {
        this.borrado=false;
    }

    public ServicioOfrecido(double costoPorPrestador, Prestador prestador, TipoServicio tipoServicio) {
        this.costoPorPrestador = costoPorPrestador;
        this.prestador = prestador;
        this.tipoServicio = tipoServicio;
        this.borrado = false;
    }

    public boolean isBorrado() {
        return borrado;
    }

    public void setBorrado(boolean borrado) {
        this.borrado = borrado;
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
    
    
    public int getIdServicioOfrecido() {
        return idServicioOfrecido;
    }

    public void setIdServicioOfrecido(int idServicioOfrecido) {
        this.idServicioOfrecido = idServicioOfrecido;
    }

    public double getCostoPorPrestador() {
        return costoPorPrestador;
    }

    public void setCostoPorPrestador(double costoPorPrestador) {
        this.costoPorPrestador = costoPorPrestador;
    }

    public Prestador getPrestador() {
        return prestador;
    }

    public void setPrestador(Prestador prestador) {
        this.prestador = prestador;
    }

    public TipoServicio getTipoServicio() {
        return tipoServicio;
    }

    public void setTipoServicio(TipoServicio tipoServicio) {
        this.tipoServicio = tipoServicio;
    }
    
    @Override
    public String toString(){
        return " "+this.getTipoServicio()+"  $"+this.getCostoPorPrestador()+" "+this.getPrestador();
    }
    
    
        
}
