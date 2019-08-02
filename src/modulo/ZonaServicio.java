
package modulo;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity

public class ZonaServicio {
    @Id
    @GeneratedValue
    private int idZona;
    private String descripcion;
    
    @ManyToMany
    private List<Prestador> prestadores = new ArrayList<>();

    public ZonaServicio() {
    }
    
    
    public int getIdZona() {
        return idZona;
    }

    public void setIdZona(int idZona) {
        this.idZona = idZona;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public List<Prestador> getPrestadores() {
        return prestadores;
    }

    public void setPrestadores(Prestador prestador) {
        this.prestadores.add(prestador);
    }
     public void quitarPrestador(Prestador p) {
        this.prestadores.remove(p);
        p.quitarZonaServicio(this);        
    }   
     @Override
     public String toString(){
         return this.getDescripcion();
     }
    
}
        
