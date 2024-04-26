package Conversiones.ProcesoConversor;
import Conversiones.Ejecucion.InicioEntrada;
import com.google.gson.*;

import java.io.File;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class ApiConversorRelate {
    public double Consulta_Api(double cantidadProcesar, String baseConver, String finalConver )  {
        double valor_final=0;
        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .setPrettyPrinting().create();
        List<ConversionRequest> lisConver = new ArrayList<>();
       try {
            System.out.println("Esperando ejecución");

           URI direccion = URI.create("https://v6.exchangerate-api.com/v6/" + "5997ac84426da9b1d406d87f"
                           + "/pair/" + baseConver + "/" + finalConver + "/" + cantidadProcesar);

           HttpClient client = HttpClient.newHttpClient();
           HttpRequest request = HttpRequest.newBuilder()
                   .uri(direccion).build();


           HttpResponse<String> response = client
                   .send(request, HttpResponse.BodyHandlers.ofString());

        String json = response.body();


           System.out.println(json);








           conversion_Requests miConversion = gson.fromJson(json, conversion_Requests.class);
           System.out.println(miConversion);




       } catch(Exception ex) {
            JOptionPane.showMessageDialog(null,"Error,Intenta mas tarde","Error",JOptionPane.ERROR_MESSAGE);
            InicioEntrada intentar = new InicioEntrada();
            intentar.arranque();
              }

    }
}
