package runner;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(features="src/test/java/features/deletelead.feature", glue="Steps", monochrome = true, publish = true)

public class rundeletelead extends AbstractTestNGCucumberTests{

}
