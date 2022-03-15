package com.czeczotka.bdd.steps;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import com.czeczotka.bdd.banking.Banking;

public class BankingSteps {

    private Banking banking;

    @Before
    public void setUp() {
        banking = new Banking();
    }

    @Given("^I have \\$(-?\\d+) on my account$")
    public void i_have_a_atm(int arg1) throws Throwable {
        assertNotNull(banking);
        banking.setBalance(arg1);
    }

    @When("^I withdraw \\$(-?\\d+)")
    public void i_withdraw(int arg1) throws Throwable {
        banking.substract(arg1);
    }
	
	@Then("^I get \\$(-?\\d+) from the ATM$")
    public void the_result_should_be(int result) throws Throwable {
        assertEquals(result, banking.getResult());
    }
}
