package AdapterPattern;

public class WebAdapter implements WebRequester {
    private WebService service;

    public void connect(WebService currentService) {
        this.service = currentService;
    }

    @Override
    public int request(Object request) {
        String result = this.toString(request);
        String response = this.service.request(result);
        if (response != null)
            return 200;
        return 500;
    }

    private String toString(Object request) {
        return request.toString();
    }
}
