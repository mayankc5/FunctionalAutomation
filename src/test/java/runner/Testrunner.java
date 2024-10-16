package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
				
				tags= "@toolsqa",
				 features ="G:\\myWorkspace\\com.seleniumbddhybridframework\\src\\test\\resources\\featurefiles\\toolsqa.feature",
			        glue= "steps",
			        plugin= {"json:target/cucumber.json","html:target/site/cucumber-pretty/index.html"}
		
		)
public class Testrunner {

}
