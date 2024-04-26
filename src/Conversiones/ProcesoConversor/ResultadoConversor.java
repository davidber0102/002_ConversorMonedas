package Conversiones.ProcesoConversor;
import Conversiones.Ejecucion.GeneradorJson;
import Conversiones.Ejecucion.Salir;


import javax.swing.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ResultadoConversor {
    public void resultado(String tipoConvercion, String cantidadProcesar) {
        String datos_api[];//guarda los daots que se envia a  la API
        datos_api= new String[3];
        String baseConver="",finalConver = "";
        switch (tipoConvercion) {
            case "Dolar(USD) a Argentine Peso(ARS)":
                baseConver="USD";
                finalConver="ARS";
                break;
            case "Argentine Peso(ARS) a Dolar(USD)":
                baseConver="ARS";
                finalConver="USD";
                break;
            case "Dolar(USD) a Brazilian Real(BRL)":
                baseConver="USD";
                finalConver="BRL";
                break;
            case "Brazilian Real(BRL) a Dolar(USD)":
                baseConver="BRL";
                finalConver="USD";
                break;
            case "Dolar(USD) a Colombian Peso(COP)":
                baseConver="USD";
                finalConver="COP";
                break;
            case "Colombian Peso(COP) a Dolar(USD)":
                baseConver="COP";
                finalConver="USD";
                break;

            case "Dolar(USD) a Mexican Peso(MXN)":
                baseConver="USD";
                finalConver="MXN";
                break;
            case "Mexican Peso(MXN) a Dolar(USD)" :
                baseConver="MXN";
                finalConver="USD";
                break;
            default:
                break;
        }

        datos_api[0]=cantidadProcesar;
        datos_api[1]=baseConver;
        datos_api[2]=finalConver;

        //datos a la Api
        ApiConversorRelate result = new ApiConversorRelate();
        double valor1 = Double.parseDouble(datos_api[0]);

        result.Consulta_Api(valor1,datos_api[1],datos_api[2]);

        //formato decimales del  resultado
        double valor_formateado=0;
        valor_formateado=Math.round((valor1*100.0)/100.0);

        //mostrar conversión
        JOptionPane.showMessageDialog(null,"El valor de la conversión  "+ tipoConvercion+ " es : $"+ valor_formateado);

        Salir salir = new Salir();
        salir.SalirApp();

    }
}
