package AdapterPattern;

public class WebClient {
    private WebRequester webRequester;

    public WebClient(WebRequester webRequester) {
        this.webRequester = webRequester;
    }

    private Object makeObject() {
        return new Object();
    }

    public void doWork() {
        Object obj = makeObject();
        int status = webRequester.request(obj);
        if (status == 200) {
            System.out.println("OK");
        } else {
            System.out.println("Not OK");
        }
        return;
    }
}
