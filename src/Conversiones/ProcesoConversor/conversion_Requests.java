package Conversiones.ProcesoConversor;

public class conversion_Requests implements Comparable<conversion_Requests>{
    private String result;
    private String documentation;
    private String terms_of_use;
    private int time_last_update_unix;
    private String time_last_update_utc;
    private int time_next_update_unix;
    private String time_next_update_utc;
    private String base_code;
    private String target_code;
    private double conversion_rate;
    private int conversion_result;

    public conversion_Requests(){

    }

    public conversion_Requests(String result, String documentation, String terms_of_use, int time_last_update_unix, String time_last_update_utc, int time_next_update_unix, String time_next_update_utc, String base_code, String target_code, double conversion_rate, int conversion_result) {
        this.result = result;
        this.documentation = documentation;
        this.terms_of_use = terms_of_use;
        this.time_last_update_unix = time_last_update_unix;
        this.time_last_update_utc = time_last_update_utc;
        this.time_next_update_unix = time_next_update_unix;
        this.time_next_update_utc = time_next_update_utc;
        this.base_code = base_code;
        this.target_code = target_code;
        this.conversion_rate = conversion_rate;
        this.conversion_result = conversion_result;
    }

    public conversion_Requests(ConversionRequest conversionRequest){
        this.base_code = conversionRequest.basCode();
        this.target_code = conversionRequest.targetCode();
        this.conversion_rate = conversionRequest.conversionRate();
        this.conversion_result = conversionRequest.conversionResult();
    }
    public void ResultadoConversion(ResultadoConversion result){
        this.conversion_result = result.conversionResult();
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getDocumentation() {
        return documentation;
    }

    public void setDocumentation(String documentation) {
        this.documentation = documentation;
    }

    public String getTerms_of_use() {
        return terms_of_use;
    }

    public void setTerms_of_use(String terms_of_use) {
        this.terms_of_use = terms_of_use;
    }

    public int getTime_last_update_unix() {
        return time_last_update_unix;
    }

    public void setTime_last_update_unix(int time_last_update_unix) {
        this.time_last_update_unix = time_last_update_unix;
    }

    public String getTime_last_update_utc() {
        return time_last_update_utc;
    }

    public void setTime_last_update_utc(String time_last_update_utc) {
        this.time_last_update_utc = time_last_update_utc;
    }

    public int getTime_next_update_unix() {
        return time_next_update_unix;
    }

    public void setTime_next_update_unix(int time_next_update_unix) {
        this.time_next_update_unix = time_next_update_unix;
    }

    public String getTime_next_update_utc() {
        return time_next_update_utc;
    }

    public void setTime_next_update_utc(String time_next_update_utc) {
        this.time_next_update_utc = time_next_update_utc;
    }

    public String getBase_code() {
        return base_code;
    }

    public void setBase_code(String base_code) {
        this.base_code = base_code;
    }

    public String getTarget_code() {
        return target_code;
    }

    public void setTarget_code(String target_code) {
        this.target_code = target_code;
    }

    public double getConversion_rate() {
        return conversion_rate;
    }

    public void setConversion_rate(double conversion_rate) {
        this.conversion_rate = conversion_rate;
    }

    public int getConversion_result() {
        return conversion_result;
    }

    public void setConversion_result(int conversion_result) {
        this.conversion_result = conversion_result;
    }

    @Override
    public int compareTo(conversion_Requests otrapeticion){
        return this.getBase_code().compareTo(otrapeticion.getBase_code());
    }
    @Override
    public String toString() {
        return "resultado = " + result + ", time update utc = " + time_last_update_utc + ", base code="
                + base_code + ", target_code=" + target_code + ", conversion_rate=" + conversion_rate
                + ", conversion_result=" + conversion_result;
    }

}
