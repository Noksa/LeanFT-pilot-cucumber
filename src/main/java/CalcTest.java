import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

import stepdefs.CommonSteps;

@RunWith(Cucumber.class)
@CucumberOptions(
                    glue = {"stepdefs"},
                 features = {"src/main/java/features"})
public class CalcTest extends CommonSteps {

    }

