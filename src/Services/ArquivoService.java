package Services;

import Models.Endereco;
import com.google.gson.Gson;

public class ArquivoService {

    Endereco endereco = new Endereco();
    Gson gson = new Gson();
    String cep = gson.toJson(endereco);
}
