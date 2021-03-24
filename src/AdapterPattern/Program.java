package AdapterPattern;

public class Program {
    public static void main(String[] args) {
        String webHost = "Host:https://google.com\n\r";
        WebService service = new WebService(webHost);
        WebAdapter adapter = new WebAdapter();
        adapter.connect(service);
        WebClient client = new WebClient(adapter);
        client.doWork();
    }
}
