package Services;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ViaCEPService {
    private String endereco;

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    HttpClient client = HttpClient.newHttpClient();
    HttpRequest request;

    {
        request = HttpRequest.newBuilder()
                .uri(URI.create("https://viacep.com.br/ws/"+ endereco + "/json/"))
                .build();
    }

    HttpResponse<String> response = client
            .send(request, HttpResponse.BodyHandlers.ofString());

    public ViaCEPService() throws IOException, InterruptedException {
    }
}
