@message
Feature: Send Message
  Verify if user is able to send a message

  Scenario Outline: Sending a message
    Given I start application ApiDemos.apk
    And I delay 3 Second
    And I tap OS
    And I delay 3 Second
    And I tap SMS Messaging
    And I delay 3 Second
    And I input "<recipient>" in Recipient Text Field
    And I input "<body>" in Message Body Text Field
    Then I tap Send button
		Examples:
			| recipient | body |
			| 081212121212 | Hello World |