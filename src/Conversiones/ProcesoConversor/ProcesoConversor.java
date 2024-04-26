package Conversiones.ProcesoConversor;
import Conversiones.Ejecucion.GeneradorJson;
import Conversiones.Ejecucion.InicioEntrada;
import Conversiones.Ejecucion.Salir;
import javax.swing.JOptionPane;

public class ProcesoConversor {
    public void valorConversion(){
        Object [] opcionesMoneda={"Dolar(USD) a Argentine Peso(ARS)",
                                    "Argentine Peso(ARS) a Dolar(USD)",
                                    "Dolar(USD) a Brazilian Real(BRL)",
                                    "Brazilian Real(BRL) a Dolar(USD)",
                                    "Dolar(USD) a Colombian Peso(COP)",
                                    "Colombian Peso(COP) a Dolar(USD)",
                                    "Dolar(USD) a Mexican Peso(MXN)",
                                    "Mexican Peso(MXN) a Dolar(USD)"};
        Object elegirMoneda = JOptionPane.showInputDialog(null,"Seleccione un opción de conversión", "Incio Aplicacion",JOptionPane.QUESTION_MESSAGE,null,opcionesMoneda, opcionesMoneda[0]);
        System.out.println(elegirMoneda);
        String monedaElegida= (String)elegirMoneda;

        if(elegirMoneda==null){
            Salir salir = new Salir();
            salir.SalirApp();
            System.exit(0);
            }

        try{
            String cantidadProcesar=JOptionPane.showInputDialog("Ingrese la cantidad de dinero que desea convertir \n Opción escogida: "+ monedaElegida);
            ResultadoConversor resultado = new ResultadoConversor();
            resultado.resultado(monedaElegida,cantidadProcesar);

        }catch(NumberFormatException | NullPointerException exception) {
            JOptionPane.showMessageDialog(null,"Valor no valido","Error",JOptionPane.ERROR_MESSAGE);
            InicioEntrada intentarNnuevo= new InicioEntrada();
            intentarNnuevo.arranque();

        }

    }
}
