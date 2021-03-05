
package chat;


import javax.swing.JOptionPane;

public class PilaChat {

NodoChat cabeza;

    public PilaChat(){

        cabeza = null;
    } 

    public void NuevoMensaje(String m , String c ){
        
        NodoChat q;
        
        q =new  NodoChat(m,c);
        
        if (cabeza == null){
        
            cabeza  = q;
            
                }
        else{
            q.asignarPointer(cabeza);
                    cabeza =q;
              }
        
        }
    public String Mensajes(){ 
        
        NodoChat p;
        
        p=cabeza;
        
        String cadena = " " ;
        
        while(p != null){ 
    
            cadena += "\nNombre del Contacto : " + p.obtenerContacto()+ " \n" + p.obtenerMensaje() ;
            
            p =p.obtenerPointer();
        
        }
        
        return cadena;
    
    }
    
    public void   RecuperarMensaje(){
    
                NodoChat p; 
                
                 p = cabeza;
                
                if(p !=null){
                
                    JOptionPane.showMessageDialog(null, " El Ultimo Mensaje :  " + p.obtenerMensaje() + " \n" + " De: " + p.obtenerContacto());
                                        cabeza =p.obtenerPointer();

                }
                else{
                    JOptionPane.showMessageDialog(null, " No Hay Mas Mensajes ");
                }
    }
    
}
