import Models.Endereco;
import Services.ArquivoService;
import Services.ViaCEPService;
import Utils.ValidadorCep;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ValidadorCep validator = new ValidadorCep();
        ViaCEPService search = new ViaCEPService();
        ArquivoService arquiveService = new ArquivoService();
        Endereco endereco;

        System.out.println("Digite um CEP para procura: ");
        String cep = sc.nextLine();

        validator.limparCep(cep);
        validator.validarCep(cep);
       endereco = search.buscarEndereco(cep);
       arquiveService.salvarEndereco(endereco);

        System.out.println(endereco);

    }
}
