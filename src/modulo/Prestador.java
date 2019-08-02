
package modulo;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
@DiscriminatorValue("Prestador")
public class Prestador extends Persona{
    
    @ManyToMany(mappedBy = "prestadores")
    private List<ZonaServicio> zona = new ArrayList<>(); 
    
    @OneToMany(mappedBy = "prestador")
    private List<ServicioCancelado> servicioCancelado = new ArrayList<>(); 
    
    @OneToMany(mappedBy = "prestador")
    private List<ServicioOfrecido> serviviosOfrecidos = new ArrayList<>();
    
    @OneToMany(mappedBy = "prestador")
    private List<ServicioRealizado> servicioRealizado = new ArrayList<>();
    
    private boolean borrado;
    
    public Prestador(){
        super();
        this.borrado=false;
    }

    public Prestador(long cuit, String razonSocial, int nroInscripcion, String domicilioLegal, String nombre) {
        super(cuit,razonSocial,nroInscripcion,domicilioLegal,nombre);
        this.borrado=false;
    }

    public boolean isBorrado() {
        return borrado;
    }

    public void setBorrado(boolean borrado) {
        this.borrado = borrado;
    }
    

    public List<ServicioRealizado> getServicioRealizado() {
        return servicioRealizado;
    }

    public void setServicioRealizado(ServicioRealizado servicioRealizado) {
        this.servicioRealizado.add(servicioRealizado);
    }
    
    public void eliminarServicioRealizado(ServicioRealizado servicioRealizado){
        this.serviviosOfrecidos.remove(servicioRealizado);
    }

    public List<ZonaServicio> getZona() {
        return zona;
    }

    public void setZona(ZonaServicio zona) {
        this.zona.add(zona);
    }

    public List<ServicioCancelado> getServicioCancelado() {
       return servicioCancelado;
    }

    public void setServicioCancelado(ServicioCancelado servicioCancelado) {
        this.servicioCancelado.add(servicioCancelado);
    }

    public void eliminarServicioCancelado(ServicioCancelado servicioCancelado){
        this.serviviosOfrecidos.remove(servicioCancelado);
    }
    
    public List<ServicioOfrecido> getServiviosOfrecidos() {
        List<ServicioOfrecido> so=new ArrayList<>();
        for(int i =0;i<serviviosOfrecidos.size();i++){
            if(!(serviviosOfrecidos.get(i).isBorrado())){
                so.add(serviviosOfrecidos.get(i));
            }
        }
        return so;
    }

    public void setServiciosOfrecidos(ServicioOfrecido serviviosOfrecidos) {
        this.serviviosOfrecidos.add(serviviosOfrecidos);
    }

    public void setServiviosOfrecidos(List<ServicioOfrecido> serviviosOfrecidos) {
        this.serviviosOfrecidos = serviviosOfrecidos;
    }
    
    
    public void eliminarServicioOfrecido(ServicioOfrecido serviciosOfrecidos){
        this.serviviosOfrecidos.remove(serviciosOfrecidos);
    }
    
   
    
    @Override
    public String toString(){
        return super.getNombre();
    
    }
    public void quitarZonaServicio(ZonaServicio zona){
        this.zona.remove(zona);
    }
    public void quitarServicioOfrecido(ServicioOfrecido so){
        this.serviviosOfrecidos.remove(so);
    }
    
    
}
