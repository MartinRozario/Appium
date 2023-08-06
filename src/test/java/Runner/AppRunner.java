package Runner;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.Test;

@CucumberOptions(features = {"src/test/resources/Features/Login.feature"},
        glue = {"StepDefs"},   monochrome = true,
        dryRun = false)
//        plugin ={ "pretty","html:build/reports/accountManagerJourney.html"
@Test
class AppRunner extends AbstractTestNGCucumberTests{
}
