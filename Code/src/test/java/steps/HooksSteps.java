package steps;

import java.util.Collection;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import utils.CodeBase;

public class HooksSteps extends CodeBase {
	
	
	@Before("@Formulario")
    public void beforeTest(Scenario scenario){
    	Collection<String> sourceTagNames = scenario.getSourceTagNames();
    	for (String tag : sourceTagNames) {
    		CodeBase.iniciarBrowser(tag);	
		}
    }
	
	
	@After("@Formulario")
		public void afterTest() {
			driver.close();
			driver.quit();
	}

}
