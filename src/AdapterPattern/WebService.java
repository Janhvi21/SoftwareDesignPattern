package AdapterPattern;

public class WebService {
    String service="";
    WebService(String Service){
        this.service=Service;
    }
    public String request(String result) {
        return service+result;
    }
}
