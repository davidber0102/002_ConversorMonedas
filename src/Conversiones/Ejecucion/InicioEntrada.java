package Conversiones.Ejecucion;
import Conversiones.ProcesoConversor.ProcesoConversor;
import Conversiones.ProcesoConversor.conversion_Requests;
import Conversiones.ProcesoConversor.ConversionRequest;

import javax.swing.JOptionPane;


public class InicioEntrada {
    public void arranque(){
        Object[] opciones = {"Entrar","Salir", "Acerca de"};
        Object opcionElegir = JOptionPane.showInputDialog(null, "Bienvenido a Conversor de Monedas", "Incio Aplicacion", JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);
        String elegida = (String) opcionElegir;

        if (elegida != null) {
            switch (elegida) {
                case "Entrar":
                    ProcesoConversor procesoInciar = new ProcesoConversor();
                    procesoInciar.valorConversion();
                    break;

                case "Salir":
                    Salir salir = new Salir();
                    salir.SalirApp();
                    break;

                case "Acerca de":
                    break;
                default:
                    break;
            }
        }

    }
}
