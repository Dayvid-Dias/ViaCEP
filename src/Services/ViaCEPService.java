package Services;

import Models.Endereco;
import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ViaCEPService {

    private final HttpClient client;

    public ViaCEPService() {
        this.client = HttpClient.newHttpClient();
    }

    public Endereco buscarEndereco(String cep) {
        try {
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create("https://viacep.com.br/ws/" + cep + "/json/"))
                    .build();

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            Gson gson = new Gson();
            Endereco endereco = gson.fromJson(response.body(), Endereco.class);

            return endereco;
        } catch (Exception e) {
            System.out.println("Erro ao buscar o CEP: " + e.getMessage());
            return null;
        }
    }
}
