package Services;

import Models.Endereco;
import com.google.gson.Gson;

import java.io.FileWriter;
import java.io.IOException;

public class ArquivoService {

    private Gson gson = new Gson();

    public Endereco salvarEndereco(Endereco endereco) {
        String nomeArquivo = endereco.getCep() + ".json";

        try (FileWriter file = new FileWriter(nomeArquivo)) {
            String json = gson.toJson(endereco);
            file.write(json);
            System.out.println("Endereço salvo em " + nomeArquivo);
        } catch (IOException e) {
            System.out.println("Erro ao salvar o endereço: " + e.getMessage());
        }

        return endereco;
    }
}
