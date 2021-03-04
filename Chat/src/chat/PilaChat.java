/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chat;

/**
 *
 * @author Shebas
 */
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
}
