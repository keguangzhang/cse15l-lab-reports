import java.net.URI;


class Handler {
    public void handleRequest(URI url) {
        if (url.getPath().contains("/add-message")) {
            String[] strings = url.getQuery().split("=");
            /* 
            String stringToReturn = strings[1];
            return stringToReturn;
            */
            for (int i = 0; i < strings.length; i++) {
                System.out.println(strings[i]);
            }
        }
            
    }
}

class StringServer {
    public static void main(String[] args) {
        Handler request = new Handler();
        URI url = new URI(":/add-message?s=Hello");
        request.handleRequest(url);
    }

}