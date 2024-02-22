package runner_file;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)   // runwith is used when we have to run specific file

@CucumberOptions(features= {"\\src\\test\\resources\\forms\\government_form.feature"},
glue={"steps"})

public class Login_runner {
	
	
	

}
