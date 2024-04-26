package Conversiones.ProcesoConversor;

public record ConversionRequest(
    String basCode,
    String targetCode,
    double conversionRate,
    int conversionResult) {


}
