package stepdefinitions;

import java.net.MalformedURLException;

import io.appium.java_client.AppiumBy;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import setup.Capabilities;

public class SendMessage extends Capabilities {

	@Given("I start application ApiDemos.apk")
	public void iStartApplication() throws MalformedURLException {
		initializeDriver();
	}
	
	@And("I delay 3 Second")
	public void iDelay3Second() throws InterruptedException {
	    Thread.sleep(3000);
	}
	
	@And("I tap OS")
	public void iTapOS() {
		driver.findElement(AppiumBy.accessibilityId("OS")).click();
	}
	
	@And("I tap SMS Messaging")
	public void iTapSMSMessaging() {
		driver.findElement(AppiumBy.accessibilityId("SMS Messaging")).click();
	}
	
	@And("I input {string} in Recipient Text Field")
	public void iInputRecipient(String recipient) {
		driver.findElement(AppiumBy.id("sms_recipient")).sendKeys(recipient);
	}
	
	@And("I input {string} in Message Body Text Field")
	public void iInputMessageBody(String body) {
		driver.findElement(AppiumBy.id("sms_content")).sendKeys(body);
	}
	
	@Then("I tap Send button")
	public void iTapSendButton() throws Exception {
		driver.findElement(AppiumBy.id("sms_send_message")).click();
	}

}
