
package chat;

/**
 *
 * @author Shebas
 */
public class NodoChat {
  /**
 *
 * @atributos
 */
    public  String Contacto;
    public String  Mensaje;
    public NodoChat Apuntador;
    
    /**
 *
 * @constructor
 */
    
    public NodoChat(String c , String m){
    
    Contacto =c ;
    Mensaje = m ;
    Apuntador =null ;
   
    } 
    
 /**
 *
 * @Metodo obtener 
 */
    
    public String obtenerContacto(){
                return Contacto;
    } 
    
    public String obtenerMensaje(){
                return Mensaje;
    } 
    
    public NodoChat obtenerPointer(){
                 return Apuntador; 
    } 
    
     /**
 *
 * @Metodo obtener 
 */
    
    public void asignarPointer(NodoChat x){
    
                Apuntador = x;
    }
    
}
