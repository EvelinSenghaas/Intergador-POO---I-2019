package Controlador;

import controlador.Persistencia;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import modulo.*;

public class Controlador {
    private final Persistencia Persistencia;
       
    public Controlador(Persistencia p){
        this.Persistencia = p;
    }
    
    
    public List listarPrestadoresActivos(){
         return this.Persistencia.buscarActivos(Prestador.class);
     }
    public List listarProductoresActivos(){
         return this.Persistencia.buscarActivos(Productor.class);
     }
     public List ListarZonas(){
         return this.Persistencia.buscarTodos(ZonaServicio.class);
     }
     public List ListarTiposServcios(){
         return this.Persistencia.buscarTodos(TipoServicio.class);
     }
    
     public List listarServiciosOfrecidosActivos(){
         return this.Persistencia.buscarActivos(ServicioOfrecido.class);
     }
     
     public List listarServiciosCancelados(){
         return this.Persistencia.buscarTodos(ServicioCancelado.class);
     }
     public List listarServiciosRealizados(){
         return this.Persistencia.buscarTodos(ServicioRealizado.class);
     }
     
     public Prestador obtenerPrestador(long i){
         if(!(this.Persistencia.buscar(Prestador.class, i).isBorrado())){
            return this.Persistencia.buscar(Prestador.class, i);
         
         }else{
             return null;
         }
     }
     
      public Prestador obtenerPrestadorGral(long i){
         return this.Persistencia.buscar(Prestador.class, i);
     }
     
     public Productor obtenerProductor(long i){
         if(!this.Persistencia.buscar(Productor.class, i).isBorrado()){
             return this.Persistencia.buscar(Productor.class, i);
         }else{
             return null ;
         }
     }
     public Productor obtenerProductorGral(long i){
         return this.Persistencia.buscar(Productor.class, i);
     }
     
     
    
     
    public List ListarUnidades(){
         return this.Persistencia.buscarTodos(Unidad.class);
     }
    
    public List listarServiciosActivos(){
         return this.Persistencia.buscarActivos(Servicio.class);
     }
    
    public void agregarProductor(long cuit, String razonSocial, int nroInscripcion, String domicilioLegal, String nombre, int cantHectarea){
        try{
            if(cuit>0){
                this.Persistencia.iniciarTransaccion();
                Productor p = new Productor(cuit,razonSocial,nroInscripcion,domicilioLegal,nombre,cantHectarea);
                this.Persistencia.insertar(p);
                this.Persistencia.confirmarTransaccion();
            }
            else{
                JOptionPane.showMessageDialog(null,"El cuit debe ser > 0");
            }
        } catch(Exception e){
            e.getMessage();
            System.out.println("No se pudo cargar productor");
        }
        
    }
    
    public void modificarProductor(Productor p){
        try{
            this.Persistencia.iniciarTransaccion();
            this.Persistencia.modificar(p);
            this.Persistencia.confirmarTransaccion();
        } catch(Exception e){
            e.getMessage();
        }
    }
   
    public void eliminarProductor(Productor p){
        try{
            this.Persistencia.iniciarTransaccion();
            p.setBorrado(true);
            this.Persistencia.modificar(p);
            this.Persistencia.confirmarTransaccion();
         } catch(Exception e){
            e.getMessage();
            System.out.println("No se elimino el productor");
        }
    }
    
    public void agregarPrestador(long cuit, String razonSocial, int nroInscripcion, String domicilioLegal, String nombre){
        try{
            this.Persistencia.iniciarTransaccion();
            if(cuit > 0){
                Prestador p;
                p = new Prestador(cuit,razonSocial,nroInscripcion,domicilioLegal,nombre);
                this.Persistencia.insertar(p);
                this.Persistencia.confirmarTransaccion();
            }
            else{
                JOptionPane.showMessageDialog(null,"El cuit debe ser mayor a cero");
            }
         } catch(Exception e){
            e.getMessage();
            System.out.println("No se agrego prestador");
        }
    }
    
    public void agregarZonaPrestador(Prestador p, ZonaServicio z){
        try{
            this.Persistencia.iniciarTransaccion();
            p.setZona(z);
            z.setPrestadores(p);
            this.Persistencia.insertar(z);
            this.Persistencia.modificar(p);
            this.Persistencia.confirmarTransaccion();
         } catch(Exception e){
            e.getMessage();
        }
    }
    
    public void eliminarZonaPrestador(Prestador p,ZonaServicio z){
        try{
            this.Persistencia.iniciarTransaccion();
            z.quitarPrestador(p);
            p.quitarZonaServicio(z);
            this.Persistencia.modificar(z);
            this.Persistencia.modificar(p);
            this.Persistencia.confirmarTransaccion();
         } catch(Exception e){
            e.getMessage();
            System.out.println("No se elimino zona");
        }
    } 
    
    public void modificarPrestador(Prestador p){
        try{
            this.Persistencia.iniciarTransaccion();
            if(p.getServiviosOfrecidos().size()>0){
                this.Persistencia.modificar(p);
                this.Persistencia.confirmarTransaccion();
            }
            else{
                JOptionPane.showMessageDialog(null,"Se debe indicar que servicio ofrece el prestador");
            }
         } catch(Exception e){
            e.getMessage();
        }
    }
   
    public void eliminarPrestador(Prestador p){
        try{
            this.Persistencia.iniciarTransaccion();
            p.setBorrado(true);
            this.Persistencia.modificar(p);
            this.Persistencia.confirmarTransaccion();
         } catch(Exception e){
            e.getMessage();
            System.out.println("No se puso eliminar prestador");
        }
    }
    
    public void agregarTipoServicio(TipoServicio tiposervicio){
        try{
            this.Persistencia.iniciarTransaccion();
            this.Persistencia.insertar(tiposervicio);
            this.Persistencia.confirmarTransaccion();
         } catch(Exception e){
            e.getMessage();
            System.out.println("No se agrego el tipo de servicio");
        }
    }
    
    public void AgregarUnidad(TipoServicio tp, Unidad unidad){
        try{
            this.Persistencia.iniciarTransaccion();
            tp.setUnidad(unidad);
            this.Persistencia.modificar(tp);
            this.Persistencia.confirmarTransaccion();
        } catch(Exception e){
            e.getMessage();
        }
    }
    
    public void eliminarTipoServicio(TipoServicio tiposervicio){
               this.Persistencia.iniciarTransaccion();
        try{
            if(tiposervicio.getServiciosOfrecidos().isEmpty()){
                this.Persistencia.eliminar(tiposervicio);
            }
            else{
               /* int respuesta =JOptionPane.showConfirmDialog(null,"El tipo de servicio contiene prestadores asociados, desea eliminar los servicios ofrecidos","Danger",JOptionPane.YES_NO_OPTION);
                if(respuesta == JOptionPane.YES_OPTION){
                    ServicioOfrecido so;
                    int size = tiposervicio.getServiciosOfrecidos().size();
                    for(int i =0;i< size;i++){
                        so = (ServicioOfrecido) tiposervicio.getServiciosOfrecidos().get(i);
                        Prestador p = (Prestador)so.getPrestador();
                        p.quitarServicioOfrecido(so); 
                        this.Persistencia.modificar(p);
                        this.Persistencia.eliminar(so);
                    }
                    this.Persistencia.eliminar(tiposervicio);
                }*/
               JOptionPane.showMessageDialog(null,"No se puede borrar porque tiene servicios ofrecidos asociados");
                
            }
            this.Persistencia.confirmarTransaccion();
        } catch(Exception e){
            System.out.println(e.getMessage());
            System.out.println("no se elimino");
            this.Persistencia.descartarTransaccion();

        }
    }
    
    public void modificarTipoServicio(TipoServicio tiposervicio){
        try{
            this.Persistencia.iniciarTransaccion();
            this.Persistencia.modificar(tiposervicio);
            this.Persistencia.confirmarTransaccion();
        } catch(Exception e){
            e.getMessage();
        }
    }
    
    public void agregarServicioOfrecido(Prestador prestador,List<ServicioOfrecido> so){
        try{
            this.Persistencia.iniciarTransaccion();
            //System.out.println(so);
            prestador.setServiviosOfrecidos(so);
            int size=prestador.getServiviosOfrecidos().size();
            System.out.println("");
            System.out.println("Tamanio de la lista de so que le estoy pasando"+size);
            System.out.println("");
            for(int i =0; i<size;i++){
                so.get(i).setPrestador(prestador);
                TipoServicio tiposervicio = so.get(i).getTipoServicio();
                tiposervicio.setServiciosOfrecidos(so.get(i));
                this.Persistencia.modificar(tiposervicio);

            }
            this.Persistencia.modificar(prestador);
            //this.Persistencia.insertar(so);

            this.Persistencia.confirmarTransaccion();
        } catch(Exception e){
            e.getMessage();
            JOptionPane.showMessageDialog(null, "no se agrego el servicio ofrecido");
        }
    }
    
    public void eliminarServicioOfrecido(ServicioOfrecido servicioofrecido){
        try{
            this.Persistencia.iniciarTransaccion();
            servicioofrecido.setBorrado(true);
            servicioofrecido.getPrestador().eliminarServicioOfrecido(servicioofrecido);
            this.Persistencia.modificar(servicioofrecido.getPrestador());
            this.Persistencia.modificar(servicioofrecido);
            this.Persistencia.confirmarTransaccion();
        } catch(Exception e){
            System.out.println(e.getMessage());
            System.out.println("No se elimino el servicio ofrecido");
            
        }
    }
    
    public void modificarServicioOfrecido(ServicioOfrecido servicioofrecido){
        try{
            this.Persistencia.iniciarTransaccion();
            this.Persistencia.modificar(servicioofrecido);
            this.Persistencia.confirmarTransaccion();
        } catch(Exception e){
            
        }
    }
    
    public void agregarServicio(Double costo,String descripcion, Date fecha, ServicioOfrecido servicioOfrecido,Productor productor){
        try{
            this.Persistencia.iniciarTransaccion();
            Servicio s = new Servicio(descripcion,fecha,servicioOfrecido,productor);
            productor.setServicio(s);
            this.Persistencia.modificar(productor);
            this.Persistencia.insertar(s);
            this.Persistencia.confirmarTransaccion();
            JOptionPane.showMessageDialog(null,"Se solicito el servicio correctamente");
        }catch(Exception e ){
            this.Persistencia.descartarTransaccion();
        }
    }
    
    public void finalizarServicio(String descripcion, String puntaje, Servicio servicio, double costo){
        try{
            this.Persistencia.iniciarTransaccion();
            ServicioRealizado sr = new ServicioRealizado(descripcion,puntaje,servicio,costo);
            sr.setServicio(servicio);
            servicio.setServiRealizado(sr);
            sr.getProductor().setServiciosRealizados(sr);
            servicio.getServicioOfrecido().getPrestador().setServicioRealizado(sr);
            sr.setPrestador(servicio.getServicioOfrecido().getPrestador());          
            this.Persistencia.modificar(servicio.getServicioOfrecido().getPrestador());
            this.Persistencia.modificar(sr.getProductor());
            this.Persistencia.insertar(sr);
            servicio.setBorrado(true);
            this.Persistencia.modificar(servicio);
            this.Persistencia.confirmarTransaccion();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Algo paso");
            this.Persistencia.descartarTransaccion();
        }
    
    }
    public void cancelarServicio(ServicioCancelado sc){
        try{
            this.Persistencia.iniciarTransaccion();
            sc.getServicio().setBorrado(true);
            this.Persistencia.modificar(sc.getServicio());
            this.Persistencia.insertar(sc);
            this.Persistencia.confirmarTransaccion();
        }catch(Exception e){
            System.out.println(e.getMessage());
            this.Persistencia.descartarTransaccion();
            JOptionPane.showMessageDialog(null,"no se cancelo nada");
        }
    }
    
}

