package steps;

import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Então;
import org.junit.Assert;
import utils.RestUtils;

public class GenericSteps {

    @Entao("valido que recebo status {int} no response")
    public void validoQueReceboStatusNoResponse(int status) {
        Assert.assertEquals(status, RestUtils.getResponse().getStatusCode());
    }

    @Entao("valido que no campo {string} possui o valor {string}")
    public void validoQueNoCampoPossuiOValor(String key, String value) {
        Assert.assertEquals(value, RestUtils.getResponse().jsonPath().get(key));

    }

}
