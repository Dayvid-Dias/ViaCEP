package Utils;

public class ValidadorCep {

    public String limparCep(String cep){
        return cep.replaceAll("\\D", "");// Remove tudo que não for dígito
    }

    public Boolean validarCep(String cep){
        if (cep.length() != 8){
            return false;
        }
        for (int i = 0; i < cep.length(); i++) {
            if (!Character.isDigit(cep.charAt(i))){
                return false;
            }
        }
        return true;
    }

}
