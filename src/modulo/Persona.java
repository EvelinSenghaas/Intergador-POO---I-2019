
package modulo;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;


@Entity
@Table(name="personas")
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name = "tipoPersona")
public abstract class Persona {

    @Id
    @GeneratedValue
    private long cuit;
    private String razonSocial;
    private int nroInscripcion;
    private String domicilioLegal;
    private String nombre;
    
    public Persona(){
 
    }

    public Persona(long cuit, String razonSocial, int nroInscripcion, String domicilioLegal, String nombre) {
        this.cuit = cuit;
        this.razonSocial = razonSocial;
        this.nroInscripcion = nroInscripcion;
        this.domicilioLegal = domicilioLegal;
        this.nombre = nombre;
    }

   
    public long getCuit() {
        return cuit;
    }

    public void setCuit(long cuit) {
        this.cuit = cuit;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public int getNroInscripcion() {
        return nroInscripcion;
    }

    public void setNroInscripcion(int nroInscripcion) {
        this.nroInscripcion = nroInscripcion;
    }

    public String getDomicilioLegal() {
        return domicilioLegal;
    }

    public void setDomicilioLegal(String domicilioLegal) {
        this.domicilioLegal = domicilioLegal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}