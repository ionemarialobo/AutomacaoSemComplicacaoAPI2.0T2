package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import utils.RestUtils;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        tags = "@filme",
        glue = "steps",
        plugin = {"json:target/reports/CucumberReports.json", "pretty"},
        snippets = CucumberOptions.SnippetType.CAMELCASE
)

public class RunnerTest {
    @BeforeClass
    public static void beforeClass() throws Exception {
        RestUtils.setBaseURI("http://localhost:8080/");

    }
}
