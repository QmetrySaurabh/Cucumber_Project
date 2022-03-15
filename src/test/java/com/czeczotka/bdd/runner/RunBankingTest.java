package com.czeczotka.bdd.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
		  features = "classpath:cucumber/banking.feature" ,
		  glue = "com.czeczotka.bdd.steps",
		plugin = {"json:target/Cucumber.json"},
		monochrome = true
       
)
public class RunBankingTest {
}
