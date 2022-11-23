package interview;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src\\test\\java\\interview\\features"},
        glue = {"src\\test\\java\\interview\\stepDefs"},
        tags ={"@ArrangeItems"}
)
public class TestRunner {
}
