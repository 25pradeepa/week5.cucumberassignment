package runner;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(features="src/test/java/features/editlead.feature", glue="Steps", monochrome = true, publish = true)

public class runeditlead extends AbstractTestNGCucumberTests{

}
