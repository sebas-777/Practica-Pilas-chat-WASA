
package chat;

import javax.swing.JOptionPane;
public class Chat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int opcion;
        
          PilaChat Lista = new Pilachat();
                do{
                    
                    opcion = Integer.parseInt(JOptionPane.showInputDialog("***** WASA *** \n " + "Menu de opciones \n" +
        "1. Ingresar mensaje\n"+
        "2. Listar todos los mensajes recibidos \n"+
        "3. Ver último mensaje recibido y borrar \n"+
        "4. salir \n"

));switch(opcion){
           
    case 1:
String m = (JOptionPane.showInputDialog(null, "Ingrese el nombre del Contacto: "));
String f = (JOptionPane.showInputDialog(null, "Ingrese el Mensaje : "));
Lista.NuevoPasajero(m,f);
break;
case 2:
JOptionPane.showMessageDialog(null, "En el avion hay: " + Lista.sumaNodoPas() + " Pasajeros ");
break;
case 3:
JOptionPane.showMessageDialog(null, "Lista de pasajeros en el avion " + Lista.Pasajeros());
break;
case 4:
Lista.SalidaPasajeros();
break;


}
                
        } while(opcion!=4);
    }
    
}