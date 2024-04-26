package Conversiones.ProcesoConversor;


public class Pais {
    private String currencyCode;
    private String currencyName;
    private String country;
    private String nombMoneda;
    private String nombPais;

    public Pais(String currencyCode, String currencyName, String country) {
        this.currencyCode = currencyCode;
        this.currencyName = currencyName;
        this.country = country;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public String getCurrencyName() {
        return currencyName;
    }

    public void setCurrencyName(String currencyName) {
        this.currencyName = currencyName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getNombMoneda() {
        return nombMoneda;
    }

    public void setNombMoneda(String nombMoneda) {
        this.nombMoneda = nombMoneda;
    }

    public String getNombPais() {
        return nombPais;
    }

    public void setNombPais(String nombPais) {
        this.nombPais = nombPais;
    }

    @Override
    public String toString() {
        return "Codigo Currency = " + currencyCode + ", Name Cuyrrency = " + currencyName + ", Contry="
                + country + ", Nombre Moneda=" + nombMoneda + ", Nombre Pais=" + nombPais;
    }
}
