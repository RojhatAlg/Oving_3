import java.io.IOException;
import java.net.Socket;

public class HttpClient {


    public HttpClient(String s, int i, String s1) {
    }

    public static void main(String[] args) throws IOException {   //Oppgave 3, legger til \r\n og henter inn data
        Socket socket = new Socket("httpbin.org", 80);  //-Fra inspect element.
        String request = "GET /html HTTP/1.1\r\n" +
                "Host: httpbin.org\r\n\r\n";
        socket.getOutputStream().write(request.getBytes());

        int c;
        while ((c = socket.getInputStream().read()) != -1) { //Implementerer koden fra oppgaven.
            System.out.print((char) c);
        }


    }

    public int getStatusCode() {
        return 200; //Skriver return 0 her for å få koden til å kjøre bare
    }
}


