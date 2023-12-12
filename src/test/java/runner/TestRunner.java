package runner;



import basesTest.TestBase;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="classpath:features"
,glue= {"stepsDefinition"}
,plugin= {"pretty","json:target/cucumber.json","html:target/cucumber.html"})
public class TestRunner extends TestBase {

}
