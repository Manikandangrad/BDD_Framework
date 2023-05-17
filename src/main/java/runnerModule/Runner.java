package runnerModule;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(tags = "@Regression",features ={"C:\\Users\\DEVI\\IdeaProjects\\BDD_Framework\\src\\main\\java\\features"} ,glue ={"stepDefinition"} ,plugin ={} )
public class Runner extends AbstractTestNGCucumberTests {

}
