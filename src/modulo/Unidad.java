
package modulo;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

@Entity
public class Unidad {
    @Id
    @SequenceGenerator (name = "id_unidad", initialValue = 1, allocationSize=1)
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "id_unidad")
    private int idUnidad;
    private String descripcion;
    
   // @OneToMany(mappedBy = "unidad")
   // private List<TipoServicio> tiposervicio = new ArrayList<>();

    public Unidad() {
    }
    
    public Unidad(String descripcion){
        this.descripcion=descripcion;
    }
   
    public int getIdUnidad() {
        return idUnidad;
    }

    public void setIdUnidad(int idUnidad) {
        this.idUnidad = idUnidad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

  

   
    
    
}
