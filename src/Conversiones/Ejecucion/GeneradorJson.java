package Conversiones.Ejecucion;

import Conversiones.ProcesoConversor.ConversionRequest;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;

public class GeneradorJson {
    public void guardarJson(ConversionRequest convertir) throws IOException {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        FileWriter escritura = new FileWriter(convertir.basCode() + ".json");
        escritura.write(gson.toJson(convertir));
        escritura.close();
    }
}
