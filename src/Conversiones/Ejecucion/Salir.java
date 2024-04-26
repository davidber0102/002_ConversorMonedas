package Conversiones.Ejecucion;
import javax.swing.JOptionPane;

public class Salir {
    public void SalirApp(){
        System.out.println("Aplicacion finalizada");
        String[] opciones = {"SI","NO"};
        Object msjSalir = JOptionPane.showConfirmDialog(null, "¿Desea continuar?",
                        "Selecciona una opción", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        int msj= (Integer) msjSalir;

        if (msj==0) {
            InicioEntrada intentarNuevo= new InicioEntrada();
            intentarNuevo.arranque();
        } else if (msj==1) {
            JOptionPane.showMessageDialog(null, "Programa Finalizado","Gracias ",JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
