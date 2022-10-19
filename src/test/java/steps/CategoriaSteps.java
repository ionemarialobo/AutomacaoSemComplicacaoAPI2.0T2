package steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Quando;
import maps.LoginMap;
import utils.RestUtils;

import java.util.HashMap;
import java.util.Map;

public class CategoriaSteps {
    Map<String, String> header = new HashMap<>();


    @Dado("que tenha um payload valido da API de Categoria")
    public void queTenhaUmPayloadValidoDaAPIDeCategoria() {
        header.put("Authorization", "Bearer "+ LoginMap.token);

    }
    @Quando("realizo uma requisição do tipo GET da Categoria")
    public void realizoUmaRequisiçãoDoTipoGETDaCategoria() {
        RestUtils.get(header, "categorias");
    }

    @Quando("altero o campo {string} do header de categorias com o valor {string}")
    public void alteroOCampoDoHeaderDeCategoriasComOValor(String key, String value) {
        header.put(key, value);
    }
}
