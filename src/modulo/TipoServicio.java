/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modulo;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

@Entity
public class TipoServicio {
    @Id
    @SequenceGenerator (name = "id_tipoServicio", initialValue = 1, allocationSize=1)
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "id_tipoServicio")
    private int idServi;
    private String nombre;
    private String descripcion;
    
    @ManyToOne
    private Unidad unidad;
        
    @OneToMany(mappedBy = "tipoServicio")
    private List<ServicioOfrecido> serviciosOfrecidos = new ArrayList<>();
    
    public TipoServicio (){

    }

    public TipoServicio(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public Unidad getUnidad() {
        return unidad;
    }

    public void setUnidad(Unidad unidad) {
        this.unidad = unidad;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getIdServi() {
        return idServi;
    }

    public void setIdServi(int idServi) {
        this.idServi = idServi;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public List<ServicioOfrecido> getServiciosOfrecidos() {
        return serviciosOfrecidos;
    }
    public List<ServicioOfrecido> getSO(){
        List<ServicioOfrecido> so=serviciosOfrecidos;
        int size=serviciosOfrecidos.size();
        for (int i = 0; i < size; i++) {
            if(serviciosOfrecidos.get(i).isBorrado()){
                so.remove(i);
                i--;
                size--;        
            }
        }
        return so;
    }

    public void setServiciosOfrecidos(ServicioOfrecido servicioofrecido) {
        this.serviciosOfrecidos.add(servicioofrecido);
    }

    public void setServiciosOfrecidos(List<ServicioOfrecido> serviciosOfrecidos) {
        this.serviciosOfrecidos = serviciosOfrecidos;
    }
    

    @Override
    public String toString(){
        return this.nombre;
    }
        
    
}
